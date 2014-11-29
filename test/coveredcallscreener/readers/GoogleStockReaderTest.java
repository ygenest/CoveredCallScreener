/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coveredcallscreener.readers;

import coveredcallscreener.domain.StockQuote;
import coveredcallscreener.domain.json.option.Expiration;
import coveredcallscreener.domain.json.option.GoogleOptionsJson;
import coveredcallscreener.domain.json.stock.GoogleStockJson;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 *
 * @author Yves
 */
public class GoogleStockReaderTest {

    public GoogleStockReaderTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    public void testReadOneStock() {
        System.out.println("readOneStock");
        String symbol = "F";
        GoogleStockReader instance = new GoogleStockReader();
        String expResult = "Ford Motor Company";
        GoogleStockJson result = instance.readStockQuote(symbol);
        assertEquals(expResult, result.getName());
    }

    @Test
    public void testReadOneStock_invalid_symbol() {
        System.out.println("readOneStock_invalid_symbol");
        String symbol = "XXXX";
        GoogleStockReader instance = new GoogleStockReader();
        GoogleStockJson result = instance.readStockQuote(symbol);
        assertEquals(null, result);
    }

    @Test
    public void testReadOptionExpiration() {
        System.out.println("testReadOptionExpiration");
        String symbol = "SPY";
        GoogleStockReader instance = new GoogleStockReader();
        List<Expiration> result = instance.readOptionExpiration(symbol);
        assertTrue(result.size()>0);
    }

    @Test
    public void testReadOptionExpiration_invalid_symbol() {
        System.out.println("testReadOptionExpiration");
        String symbol = "XXXX";
        GoogleStockReader instance = new GoogleStockReader();
        List<Expiration> result = instance.readOptionExpiration(symbol);
        assertNull(result);
    }

    @Test
    public void testReadOptionQuotes() {
        System.out.println("readOptionQuotes");
        String symbol = "F";
        GoogleStockReader instance = new GoogleStockReader();
        List<Expiration> exp = instance.readOptionExpiration(symbol);
        GoogleOptionsJson result = instance.readOptionQuote(symbol,exp.get(0));
        assertNotNull(result);
    }
    
}
