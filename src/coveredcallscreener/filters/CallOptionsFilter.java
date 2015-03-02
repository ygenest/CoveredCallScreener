/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coveredcallscreener.filters;

import coveredcallscreener.domain.OptionQuote;
import java.util.logging.Logger;

/**
 *
 * @author Yves
 */
public class CallOptionsFilter {

    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    private static boolean noZeroInterest = false;
    private static int percentageAboveStrike = 0;
    private static boolean noStrikeBelowCurrent = false;

    public static boolean filter(OptionQuote optionQuote, boolean put) {
        if (isNoZeroInterest() && optionQuote.getOpenInt() < 1) {
            return false;
        }
        if (percentageAboveStrike > 0) {

        }
        if (put && noStrikeBelowCurrent && optionQuote.getStrike() >= optionQuote.getStockPrice()) {
            return false;
        }
        if (!put && noStrikeBelowCurrent && optionQuote.getStrike() <= optionQuote.getStockPrice()) {
            return false;
        }
        return true;
    }

    /**
     * @return the noZeroInterest
     */
    public static boolean isNoZeroInterest() {
        return noZeroInterest;
    }

    /**
     * @param aNoZeroInterest the noZeroInterest to set
     */
    public static void setNoZeroInterest(boolean aNoZeroInterest) {
        noZeroInterest = aNoZeroInterest;
    }

    /**
     * @return the noStrikeBelowCurrent
     */
    public static boolean isNoStrikeBelowCurrent() {
        return noStrikeBelowCurrent;
    }

    /**
     * @param aNoStrikeBelowCurrent the noStrikeBelowCurrent to set
     */
    public static void setNoStrikeBelowCurrent(boolean aNoStrikeBelowCurrent) {
        noStrikeBelowCurrent = aNoStrikeBelowCurrent;
    }

    /**
     * @return the percentageAboveStrike
     */
    public int getPercentageAboveStrike() {
        return percentageAboveStrike;
    }

    /**
     * @param percentageAboveStrike the percentageAboveStrike to set
     */
    public void setPercentageAboveStrike(int percentageAboveStrike) {
        this.percentageAboveStrike = percentageAboveStrike;
    }

}
