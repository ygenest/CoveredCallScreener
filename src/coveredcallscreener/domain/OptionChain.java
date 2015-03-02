/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coveredcallscreener.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Yves
 */
@XmlRootElement(name = "optionChain")
public class OptionChain {

    @XmlAttribute(name = "symbol")
    protected String symbol;
    @XmlAttribute(name = "expiration")
    protected String expiration;
    @XmlElement(name = "option")
    protected List<OptionQuote> option = new ArrayList<OptionQuote>();

    public boolean equals(String symb) {

        if (symb.equalsIgnoreCase(symbol)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String str = symbol + " exp=" + expiration + "\n";
        for (OptionQuote o : option) {
            str = str + o.toString();
        }
        return str;
    }
}
