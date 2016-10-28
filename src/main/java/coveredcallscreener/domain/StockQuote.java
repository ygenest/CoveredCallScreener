/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coveredcallscreener.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yves
 */
public class StockQuote {

    private double ask;
    private double bid;
    private double dividendAmount;
    private char dividendFrequency;
    private double dividendYield;
    private double last;
    private double peRatio;
    private String marketCap;
    public String getMarketCap() {
		return marketCap;
	}
	public void setMarketCap(String marketCap) {
		this.marketCap = marketCap;
	}
	public double getPeRatio() {
		return peRatio;
	}
	public void setPeRatio(double peRatio) {
		this.peRatio = peRatio;
	}

	private String name;
    private String symbol;
    private List<OptionQuote> optionQuotes=new ArrayList<OptionQuote>();

    public double getDividendPerMonth() {
       return last*(dividendYield/100)/12;
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
     * @return the dividend_amount
     */
    public double getDividendAmount() {
        return dividendAmount;
    }

    /**
     * @param dividendAmount the dividend amount to set
     */
    public void setDividendAmount(double dividendAmount) {
        this.dividendAmount = dividendAmount;
    }

    /**
     * @return the dividend_frequency
     */
    public char getDividendFrequency() {
        return dividendFrequency;
    }

    /**
     * @param dividend_frequency the dividend_frequency to set
     */
    public void setDividendFrequency(char dividend_frequency) {
        this.dividendFrequency = dividend_frequency;
    }

    /**
     * @return the dividend_yield
     */
    public double getDividendYield() {
        return dividendYield;
    }

    /**
     * @param dividend_yield the dividend_yield to set
     */
    public void setDividendYield(double dividend_yield) {
        this.dividendYield = dividend_yield;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the symbol
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * @param symbol the symbol to set
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * @return the optionQuotes
     */
    public List<OptionQuote> getOptionQuotes() {
        return optionQuotes;
    }

    /**
     * @param optionQuotes the optionQuotes to set
     */
    public void setOptionQuotes(List<OptionQuote> optionQuotes) {
        this.setOptionQuotes(optionQuotes);
    }


}
