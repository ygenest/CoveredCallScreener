/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package coveredcallscreener.readers;

import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Yves
 */
public class TsxOptionsReaderTest {

    public TsxOptionsReaderTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    public void testReadOptionQuote() {
        System.out.println("readOptionQuote");
        String symbol = "SU";
        TsxOptionsReader instance = new TsxOptionsReader();
        List result = instance.readOptionQuote(symbol);
        assertTrue(result.size()>0);
    }

    @Test
    public void testReadOptionQuote_invalid_symbol() {
        System.out.println("readOptionQuote_invalid_symbol");
        String symbol = "XXX";
        TsxOptionsReader instance = new TsxOptionsReader();
        List result = instance.readOptionQuote(symbol);
        assertNull(result);
    }

}