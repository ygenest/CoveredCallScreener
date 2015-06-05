/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coveredcallscreener.domain;

import java.util.Date;

/**
 *
 * @author Yves
 */
public class OptionQuote {

    private static final int UNDEFINED = -1;
    private double ask;
    private double bid;
    private Date exparyDate;
    private double last;
    private long openInt;
    private double strike;
    private long volume;
    private double stockPrice;

    private double getPriceToCalculateYield() {
        double priceToCalculateYield;
        if (this.getBid() != UNDEFINED && this.getAsk() != UNDEFINED) {
            priceToCalculateYield = (this.getAsk() + this.getBid()) / 2d;
        } else {
            priceToCalculateYield = this.getLast();
        }
        return priceToCalculateYield;
    }

    public int getDaysBeforeExpiry() {
        Date now = new Date();
        return this.daysBetween(now, exparyDate);
    }

    public double getCallYield() {
        return this.getPriceToCalculateYield() / this.getStockPrice() * 100;
    }

    public double getCapGainYield() {
        return (this.getStrike() - this.getStockPrice()) / this.getStockPrice() * 100;
    }

    public double getTotalYieldAnnualize() {
        return 0;
    }

    public double getDistrPerMonth() {
        return 0;
    }

    /**
     * @return the ask
     */
    public double getAsk() {
        return ask;
    }

    /**
     * @param ask the ask to set
     */
    public void setAsk(double ask) {
        this.ask = ask;
    }

    /**
     * @return the bid
     */
    public double getBid() {
        return bid;
    }

    /**
     * @param bid the bid to set
     */
    public void setBid(double bid) {
        this.bid = bid;
    }

    /**
     * @return the exparyDate
     */
    public Date getExparyDate() {
        return exparyDate;
    }

    /**
     * @param exparyDate the exparyDate to set
     */
    public void setExparyDate(Date exparyDate) {
        this.exparyDate = exparyDate;
    }

    /**
     * @return the last
     */
    public double getLast() {
        return last;
    }

    /**
     * @param last the last to set
     */
    public void setLast(double last) {
        this.last = last;
    }

    /**
     * @return the openInt
     */
    public long getOpenInt() {
        return openInt;
    }

    /**
     * @param openInt the openInt to set
     */
    public void setOpenInt(long openInt) {
        this.openInt = openInt;
    }

    /**
     * @return the strike
     */
    public double getStrike() {
        return strike;
    }

    /**
     * @param strike the strike to set
     */
    public void setStrike(double strike) {
        this.strike = strike;
    }

    /**
     * @return the volume
     */
    public long getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(long volume) {
        this.volume = volume;
    }

    /**
     * @return the stockPrice
     */
    public double getStockPrice() {
        return stockPrice;
    }

    /**
     * @param stockPrice the stockPrice to set
     */
    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
    }

    private int daysBetween(Date d1, Date d2) {
        return (int) ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
    }
}
