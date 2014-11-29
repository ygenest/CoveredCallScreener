/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coveredcallscreener.readers;

import coveredcallscreener.domain.OptionQuote;
import java.io.IOException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Yves
 */
public class TsxOptionsReader {
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    private final static String URLTSX = "http://www.m-x.ca/nego_cotes_fr.php?symbol={0}";

    public List<OptionQuote> readOptionQuote(String symbol) {
        String surl = MessageFormat.format(URLTSX, symbol);
        LOGGER.log(Level.INFO,"URLTSX="+surl);
        List<OptionQuote> optionQuotes = new ArrayList<OptionQuote>();
        org.jsoup.nodes.Document doc;
        try {
            doc = Jsoup.connect(surl).get();
        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, "Problem accessing TSX", ex);
            return optionQuotes;
        }
        Elements tds = doc.getElementsByTag("TD");
        if (tds.size() == 0) {
            LOGGER.log(Level.INFO,"No TD tag on this page. returning...");
            return optionQuotes;
        }
        int count = 0;
        OptionQuote op = null;
        String li = null;
        //chain = new OptionsChain();
        for (Element td : tds) {
            if (td.hasClass("left")) {
                op = new OptionQuote();
                Element a = td.child(0);
                li = a.attr("title");
                LOGGER.log(Level.INFO,"title attr="+surl);
                String optype = (li.substring(12, 13));
                if (optype.equals("P")) {
                    break;
                }

                String price = li.substring(13).replace(",", ".");
                op.setStrike(Double.parseDouble(price));
                String dts = li.substring(6, 12);
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyMMdd");
                Date dateExp=null;
                try {
                    dateExp = dateFormat.parse(dts);
                } catch (ParseException ex) {
                    Logger.getLogger(TsxOptionsReader.class.getName()).log(Level.SEVERE, "Invalid date format", ex);
                    continue;
                }
                op.setExparyDate(dateExp);

            } else {
                if (count == 0) {
                    op.setBid(Double.parseDouble(td.text().replace(',', '.')));
                    count++;
                } else if (count == 1) {
                    op.setAsk(Double.parseDouble(td.text().replace(',', '.')));
                    count++;
                } else if (count == 2) {
                    op.setLast(Double.parseDouble(td.text().replace(',', '.')));
                    count++;
                } else if (count == 3) {
                    //op.setChange(Double.parseDouble(td.text().replace(',', '.')));
                    count++;
                } else if (count == 4) {
                    String opint = td.text().replace(" ", "");
                    op.setOpenInt(Long.parseLong(opint));
                    count++;
                } else if (count == 5) {
                    op.setVolume(Long.parseLong(td.text()));
                    optionQuotes.add(op);
                    count = 0;
                }
            }
        }
        return optionQuotes;
    }
}
