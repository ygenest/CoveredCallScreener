/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coveredcallscreener.readers;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import coveredcallscreener.domain.json.option.Expiration;
import coveredcallscreener.domain.json.option.GoogleOptionsJson;
import coveredcallscreener.domain.json.stock.GoogleStockJson;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.MessageFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Yves
 */
public class GoogleStockReader {
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    private final static String URLSTOCK = "http://www.google.com/finance?q={0}&output=json";
    private final static String URLOPTIONEXP = "http://www.google.com/finance/option_chain?q={0}&output=json";
    private final static String URLOPTION = "http://www.google.com/finance/option_chain?q={0}&output=json&expy={1,number,####}&expm={2}&expd={3}";
    private final static byte SLASH = 47;
    private final static byte BYTESTOSKIP = 5;
    private final static byte FIRST= 1;
    private final static byte SECOND= 2;

    public GoogleStockJson readStockQuote(String symbol) {
        LOGGER.log(Level.INFO, "Entering readStockQuote with {0}",symbol);
        GoogleStockJson googleStockJson = null;
        String surl = MessageFormat.format(URLSTOCK, symbol);
        try {
            URL url = new URL(surl);
            InputStream is = url.openStream();
            // a valid response from google start with "//"
            byte[] b = new byte[BYTESTOSKIP];
            is.read(b, 0, 5);
            if (b[FIRST] == SLASH && b[SECOND] == SLASH) {
                LOGGER.log(Level.INFO, "Google response starts with expected // characters for {0}",symbol);
                ObjectMapper mapper = new ObjectMapper();
                mapper.configure(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER, true);
                googleStockJson = mapper.readValue(is, GoogleStockJson.class);
            } else {
                LOGGER.log(Level.WARNING, "Google response did not start with expected // characters for {0}",symbol);
                return null;
            }
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, "Error parsing data", ex);
            return null;
        }
        return googleStockJson;
    }


    public List<Expiration> readOptionExpiration(String symbol) {
        LOGGER.log(Level.INFO, "Entering readOptionExpiration with {0}",symbol);
        GoogleOptionsJson googleOptionsJson = null;
        String surl = MessageFormat.format(URLOPTIONEXP, symbol);
        URL url = null;
        try {
            url = new URL(surl);
        } catch (MalformedURLException ex) {
            LOGGER.log(Level.SEVERE, "Malformed Expiration URL", ex);
        }
        googleOptionsJson=accessGoogle(url);
        if (googleOptionsJson != null) {
            LOGGER.log(Level.INFO, "Symbol {0} has {1} expiration dates",new Object[]{symbol,googleOptionsJson.getExpirations().size()});
            return googleOptionsJson.getExpirations();
        } else {
            LOGGER.log(Level.INFO,"There is no expiration date for symbol {0},symbol");
            return null;
        }
    }

    public GoogleOptionsJson readOptionQuote(String symbol,Expiration exp) {
        LOGGER.log(Level.INFO, "Entering readOptionQuote with symbol {0} et expiration date {1}", new Object[]{symbol, exp});
        String surl = MessageFormat.format(URLOPTION, symbol,exp.getY(),exp.getM(),exp.getD());
        URL url = null;
        try {
            url = new URL(surl);
        } catch (MalformedURLException ex) {
            LOGGER.log(Level.SEVERE, "Malformed Option URL", ex);
        }
        return accessGoogle(url);
    }

    private GoogleOptionsJson accessGoogle(URL url) {
        LOGGER.log(Level.INFO, "Entering accessGoogle with URL {0}",url);
        GoogleOptionsJson googleOptionsJson = null;
         InputStream is = null;
        try {
            is = url.openStream();
        } catch (IOException ex) {
            LOGGER.log(Level.INFO, "Error accessing google with URL {0} ",url);
            return null;
        }
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        try {
            googleOptionsJson = mapper.readValue(is, GoogleOptionsJson.class);
        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, "IO exception reading google options", ex);
        }
        return googleOptionsJson;
    }
}
