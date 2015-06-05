/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coveredcallscreener.writers;

import coveredcallscreener.domain.OptionQuote;
import coveredcallscreener.domain.StockQuote;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yves
 */
public class CsvWriter {

    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public void write(List<StockQuote> stockQuotes, File fname, boolean unique) {
        LOGGER.log(Level.INFO, "Entering CsvWriter");
        try {
            FileWriter fw = new FileWriter(fname);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Symbol;Name;Expiry Date;Stock Price;Strike;Bid;Ask;Last;Volume;Open Int; Yield Opt;Yield Cap Gain;Div Yield;Put Val;Rate");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            LOGGER.log(Level.INFO, "Stock quotes to write: {0}", stockQuotes.size());
            for (StockQuote stockQuote : stockQuotes) {
                if (stockQuote.getOptionQuotes() != null) {
                    LOGGER.log(Level.INFO, "Option quotes to write: {0} for {1}", new Object[]{stockQuote.getOptionQuotes().size(), stockQuote.getSymbol()});
                    for (OptionQuote optionQuote : stockQuote.getOptionQuotes()) {
                        String expDate;
                        if (optionQuote.getExparyDate() != null) {
                            expDate = sdf.format(optionQuote.getExparyDate());
                        } else {
                            LOGGER.log(Level.INFO, "Null expiry date for option {0}", stockQuote.getSymbol());
                            expDate = "??";
                        }

                        double putVal = (optionQuote.getAsk() / (stockQuote.getLast() - optionQuote.getStrike()) / optionQuote.getDaysBeforeExpiry());
                        pw.format(Locale.US, "%s;%s;%s;%7.2f;%7.2f;%7.2f;%7.2f;%7.2f;%d;%d;%5.1f;%5.1f;%5.1f;%7.2f;%5.2f",
                                stockQuote.getSymbol(),
                                stockQuote.getName(),
                                expDate,
                                stockQuote.getLast(),
                                optionQuote.getStrike(),
                                optionQuote.getBid(),
                                optionQuote.getAsk(),
                                optionQuote.getLast(),
                                optionQuote.getVolume(),
                                optionQuote.getOpenInt(),
                                optionQuote.getCallYield(),
                                optionQuote.getCapGainYield(),
                                stockQuote.getDividendYield(),
                                putVal,
                                (optionQuote.getLast() / optionQuote.getStrike()) * 100
                        );
                        pw.println();
                        if (unique) break;
                    }
                } else {
                    LOGGER.log(Level.INFO, "No option quote for ", stockQuote.getSymbol());
                }
            }
            pw.close();
            fw.close();
            //writer.write("",quote.getSymbol(),quote.getName(),quote.getBid(),quote.getAsk(),quote.getLast(),quote.getDividend(),quote.getExDivDate(),quote.getDivPayDate());
        } catch (IOException ex) {
            Logger.getLogger(CsvWriter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
