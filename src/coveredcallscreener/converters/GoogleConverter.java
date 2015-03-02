/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coveredcallscreener.converters;

import coveredcallscreener.domain.OptionQuote;
import coveredcallscreener.domain.StockQuote;
import coveredcallscreener.domain.json.option.Call;
import coveredcallscreener.domain.json.option.Expiration;
import coveredcallscreener.domain.json.option.GoogleOptionsJson;
import coveredcallscreener.domain.json.stock.GoogleStockJson;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author Yves
 */
public class GoogleConverter {

    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    private static final int UNDEFINED = -1;

    public StockQuote convertStock(GoogleStockJson googleStockJson) {
        StockQuote stockQuote = new StockQuote();
        stockQuote.setName(googleStockJson.getName());
        stockQuote.setSymbol(googleStockJson.getSymbol());
        try {
            stockQuote.setDividendYield(Double.parseDouble(googleStockJson.getDy()));
        } catch (java.lang.NumberFormatException e) {
            stockQuote.setDividendYield(UNDEFINED);
        } catch (java.lang.NullPointerException e) {
            stockQuote.setDividendYield(UNDEFINED);
        }
        try {
            stockQuote.setLast(Double.parseDouble(googleStockJson.getL()));
        } catch (java.lang.NumberFormatException e) {
            stockQuote.setLast(UNDEFINED);
        } catch (java.lang.NullPointerException e) {
            stockQuote.setLast(UNDEFINED);
        }
        return stockQuote;
    }

    public List<OptionQuote> convertOption(GoogleOptionsJson googleOptionJson, Expiration expiration) {
        List<OptionQuote> optionQuotes = new ArrayList<OptionQuote>();
        Calendar expDate = new GregorianCalendar(expiration.getY(), expiration.getM() - 1, expiration.getD());
        for (Call call : googleOptionJson.getCalls()) {
            OptionQuote optionQuote = new OptionQuote();
            optionQuote.setExparyDate(expDate.getTime());
            try {
                optionQuote.setStrike(Double.parseDouble(call.getStrike()));
            } catch (java.lang.NumberFormatException e) {
                optionQuote.setStrike(UNDEFINED);
            }
            try {
                optionQuote.setLast(Double.parseDouble(call.getP()));
            } catch (java.lang.NumberFormatException e) {
                optionQuote.setLast(UNDEFINED);
            }
            try {
                optionQuote.setAsk(Double.parseDouble(call.getA()));
            } catch (java.lang.NumberFormatException e) {
                optionQuote.setAsk(UNDEFINED);
            }
            try {
                optionQuote.setBid(Double.parseDouble(call.getB()));
            } catch (java.lang.NumberFormatException e) {
                optionQuote.setBid(UNDEFINED);
            }
            try {
                optionQuote.setOpenInt(Long.parseLong(call.getOi()));
            } catch (java.lang.NumberFormatException e) {
                optionQuote.setOpenInt(UNDEFINED);
            }
            try {
                optionQuote.setVolume(Long.parseLong(call.getVol()));
            } catch (java.lang.NumberFormatException e) {
                optionQuote.setVolume(UNDEFINED);
            }
            optionQuotes.add(optionQuote);
        }
        return optionQuotes;
    }
}
