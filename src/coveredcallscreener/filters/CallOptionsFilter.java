/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coveredcallscreener.filters;

import coveredcallscreener.domain.OptionQuote;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
    private static Calendar expDate;

    public static boolean filter(OptionQuote optionQuote, boolean put) {
         if (expDate != null) {
             Date d1 = expDate.getTime();
             Date d2 = optionQuote.getExparyDate();
             if (!d1.equals(d2)) {
                 return false;
             }
         }

        
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
    public void setExparyMonth(String expMonth) {
        
    }
    
     public static void setExpMonth(String sdate) {
         int year = Integer.parseInt(sdate.substring(0, 4));
         int month = Integer.parseInt(sdate.substring(4, 6)) - 1;
         Calendar c = new GregorianCalendar(year, month, 1);
         int sat3 = 0;
         while (sat3 != 3) {
             if (c.get(Calendar.DAY_OF_WEEK) == 6) {
                 ++sat3;
             }
             c.add(Calendar.DATE, 1);
         }
         c.add(Calendar.DATE, -1);
         expDate = c;

     }


}
