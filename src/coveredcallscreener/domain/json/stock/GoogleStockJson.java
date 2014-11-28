
package stockscreener.json.stock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "symbol",
    "exchange",
    "id",
    "t",
    "e",
    "name",
    "f_reuters_url",
    "f_recent_quarter_date",
    "f_annual_date",
    "f_ttm_date",
    "financials",
    "kr_recent_quarter_date",
    "kr_annual_date",
    "kr_ttm_date",
    "keyratios",
    "c",
    "l",
    "cp",
    "ccol",
    "op",
    "hi",
    "lo",
    "vo",
    "avvo",
    "hi52",
    "lo52",
    "mc",
    "pe",
    "fwpe",
    "beta",
    "eps",
    "dy",
    "ldiv",
    "shares",
    "instown",
    "eo",
    "sid",
    "sname",
    "iid",
    "iname",
    "related",
    "summary",
    "management",
    "moreresources",
    "events"
})
public class GoogleStockJson {

    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("exchange")
    private String exchange;
    @JsonProperty("id")
    private String id;
    @JsonProperty("t")
    private String t;
    @JsonProperty("e")
    private String e;
    @JsonProperty("name")
    private String name;
    @JsonProperty("f_reuters_url")
    private String fReutersUrl;
    @JsonProperty("f_recent_quarter_date")
    private String fRecentQuarterDate;
    @JsonProperty("f_annual_date")
    private String fAnnualDate;
    @JsonProperty("f_ttm_date")
    private String fTtmDate;
    @JsonProperty("financials")
    private List<Financial> financials = new ArrayList<Financial>();
    @JsonProperty("kr_recent_quarter_date")
    private String krRecentQuarterDate;
    @JsonProperty("kr_annual_date")
    private String krAnnualDate;
    @JsonProperty("kr_ttm_date")
    private String krTtmDate;
    @JsonProperty("keyratios")
    private List<Keyratio> keyratios = new ArrayList<Keyratio>();
    @JsonProperty("c")
    private String c;
    @JsonProperty("l")
    private String l;
    @JsonProperty("cp")
    private String cp;
    @JsonProperty("ccol")
    private String ccol;
    @JsonProperty("op")
    private String op;
    @JsonProperty("hi")
    private String hi;
    @JsonProperty("lo")
    private String lo;
    @JsonProperty("vo")
    private String vo;
    @JsonProperty("avvo")
    private String avvo;
    @JsonProperty("hi52")
    private String hi52;
    @JsonProperty("lo52")
    private String lo52;
    @JsonProperty("mc")
    private String mc;
    @JsonProperty("pe")
    private String pe;
    @JsonProperty("fwpe")
    private String fwpe;
    @JsonProperty("beta")
    private String beta;
    @JsonProperty("eps")
    private String eps;
    @JsonProperty("dy")
    private String dy;
    @JsonProperty("ldiv")
    private String ldiv;
    @JsonProperty("shares")
    private String shares;
    @JsonProperty("instown")
    private String instown;
    @JsonProperty("eo")
    private String eo;
    @JsonProperty("sid")
    private String sid;
    @JsonProperty("sname")
    private String sname;
    @JsonProperty("iid")
    private String iid;
    @JsonProperty("iname")
    private String iname;
    @JsonProperty("related")
    private List<Related> related = new ArrayList<Related>();
    @JsonProperty("summary")
    private List<Summary> summary = new ArrayList<Summary>();
    @JsonProperty("management")
    private List<Management> management = new ArrayList<Management>();
    @JsonProperty("moreresources")
    private List<Moreresource> moreresources = new ArrayList<Moreresource>();
    @JsonProperty("events")
    private List<Object> events = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The symbol
     */
    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    /**
     * 
     * @param symbol
     *     The symbol
     */
    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * 
     * @return
     *     The exchange
     */
    @JsonProperty("exchange")
    public String getExchange() {
        return exchange;
    }

    /**
     * 
     * @param exchange
     *     The exchange
     */
    @JsonProperty("exchange")
    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The t
     */
    @JsonProperty("t")
    public String getT() {
        return t;
    }

    /**
     * 
     * @param t
     *     The t
     */
    @JsonProperty("t")
    public void setT(String t) {
        this.t = t;
    }

    /**
     * 
     * @return
     *     The e
     */
    @JsonProperty("e")
    public String getE() {
        return e;
    }

    /**
     * 
     * @param e
     *     The e
     */
    @JsonProperty("e")
    public void setE(String e) {
        this.e = e;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The fReutersUrl
     */
    @JsonProperty("f_reuters_url")
    public String getFReutersUrl() {
        return fReutersUrl;
    }

    /**
     * 
     * @param fReutersUrl
     *     The f_reuters_url
     */
    @JsonProperty("f_reuters_url")
    public void setFReutersUrl(String fReutersUrl) {
        this.fReutersUrl = fReutersUrl;
    }

    /**
     * 
     * @return
     *     The fRecentQuarterDate
     */
    @JsonProperty("f_recent_quarter_date")
    public String getFRecentQuarterDate() {
        return fRecentQuarterDate;
    }

    /**
     * 
     * @param fRecentQuarterDate
     *     The f_recent_quarter_date
     */
    @JsonProperty("f_recent_quarter_date")
    public void setFRecentQuarterDate(String fRecentQuarterDate) {
        this.fRecentQuarterDate = fRecentQuarterDate;
    }

    /**
     * 
     * @return
     *     The fAnnualDate
     */
    @JsonProperty("f_annual_date")
    public String getFAnnualDate() {
        return fAnnualDate;
    }

    /**
     * 
     * @param fAnnualDate
     *     The f_annual_date
     */
    @JsonProperty("f_annual_date")
    public void setFAnnualDate(String fAnnualDate) {
        this.fAnnualDate = fAnnualDate;
    }

    /**
     * 
     * @return
     *     The fTtmDate
     */
    @JsonProperty("f_ttm_date")
    public String getFTtmDate() {
        return fTtmDate;
    }

    /**
     * 
     * @param fTtmDate
     *     The f_ttm_date
     */
    @JsonProperty("f_ttm_date")
    public void setFTtmDate(String fTtmDate) {
        this.fTtmDate = fTtmDate;
    }

    /**
     * 
     * @return
     *     The financials
     */
    @JsonProperty("financials")
    public List<Financial> getFinancials() {
        return financials;
    }

    /**
     * 
     * @param financials
     *     The financials
     */
    @JsonProperty("financials")
    public void setFinancials(List<Financial> financials) {
        this.financials = financials;
    }

    /**
     * 
     * @return
     *     The krRecentQuarterDate
     */
    @JsonProperty("kr_recent_quarter_date")
    public String getKrRecentQuarterDate() {
        return krRecentQuarterDate;
    }

    /**
     * 
     * @param krRecentQuarterDate
     *     The kr_recent_quarter_date
     */
    @JsonProperty("kr_recent_quarter_date")
    public void setKrRecentQuarterDate(String krRecentQuarterDate) {
        this.krRecentQuarterDate = krRecentQuarterDate;
    }

    /**
     * 
     * @return
     *     The krAnnualDate
     */
    @JsonProperty("kr_annual_date")
    public String getKrAnnualDate() {
        return krAnnualDate;
    }

    /**
     * 
     * @param krAnnualDate
     *     The kr_annual_date
     */
    @JsonProperty("kr_annual_date")
    public void setKrAnnualDate(String krAnnualDate) {
        this.krAnnualDate = krAnnualDate;
    }

    /**
     * 
     * @return
     *     The krTtmDate
     */
    @JsonProperty("kr_ttm_date")
    public String getKrTtmDate() {
        return krTtmDate;
    }

    /**
     * 
     * @param krTtmDate
     *     The kr_ttm_date
     */
    @JsonProperty("kr_ttm_date")
    public void setKrTtmDate(String krTtmDate) {
        this.krTtmDate = krTtmDate;
    }

    /**
     * 
     * @return
     *     The keyratios
     */
    @JsonProperty("keyratios")
    public List<Keyratio> getKeyratios() {
        return keyratios;
    }

    /**
     * 
     * @param keyratios
     *     The keyratios
     */
    @JsonProperty("keyratios")
    public void setKeyratios(List<Keyratio> keyratios) {
        this.keyratios = keyratios;
    }

    /**
     * 
     * @return
     *     The c
     */
    @JsonProperty("c")
    public String getC() {
        return c;
    }

    /**
     * 
     * @param c
     *     The c
     */
    @JsonProperty("c")
    public void setC(String c) {
        this.c = c;
    }

    /**
     * 
     * @return
     *     The l
     */
    @JsonProperty("l")
    public String getL() {
        return l;
    }

    /**
     * 
     * @param l
     *     The l
     */
    @JsonProperty("l")
    public void setL(String l) {
        this.l = l;
    }

    /**
     * 
     * @return
     *     The cp
     */
    @JsonProperty("cp")
    public String getCp() {
        return cp;
    }

    /**
     * 
     * @param cp
     *     The cp
     */
    @JsonProperty("cp")
    public void setCp(String cp) {
        this.cp = cp;
    }

    /**
     * 
     * @return
     *     The ccol
     */
    @JsonProperty("ccol")
    public String getCcol() {
        return ccol;
    }

    /**
     * 
     * @param ccol
     *     The ccol
     */
    @JsonProperty("ccol")
    public void setCcol(String ccol) {
        this.ccol = ccol;
    }

    /**
     * 
     * @return
     *     The op
     */
    @JsonProperty("op")
    public String getOp() {
        return op;
    }

    /**
     * 
     * @param op
     *     The op
     */
    @JsonProperty("op")
    public void setOp(String op) {
        this.op = op;
    }

    /**
     * 
     * @return
     *     The hi
     */
    @JsonProperty("hi")
    public String getHi() {
        return hi;
    }

    /**
     * 
     * @param hi
     *     The hi
     */
    @JsonProperty("hi")
    public void setHi(String hi) {
        this.hi = hi;
    }

    /**
     * 
     * @return
     *     The lo
     */
    @JsonProperty("lo")
    public String getLo() {
        return lo;
    }

    /**
     * 
     * @param lo
     *     The lo
     */
    @JsonProperty("lo")
    public void setLo(String lo) {
        this.lo = lo;
    }

    /**
     * 
     * @return
     *     The vo
     */
    @JsonProperty("vo")
    public String getVo() {
        return vo;
    }

    /**
     * 
     * @param vo
     *     The vo
     */
    @JsonProperty("vo")
    public void setVo(String vo) {
        this.vo = vo;
    }

    /**
     * 
     * @return
     *     The avvo
     */
    @JsonProperty("avvo")
    public String getAvvo() {
        return avvo;
    }

    /**
     * 
     * @param avvo
     *     The avvo
     */
    @JsonProperty("avvo")
    public void setAvvo(String avvo) {
        this.avvo = avvo;
    }

    /**
     * 
     * @return
     *     The hi52
     */
    @JsonProperty("hi52")
    public String getHi52() {
        return hi52;
    }

    /**
     * 
     * @param hi52
     *     The hi52
     */
    @JsonProperty("hi52")
    public void setHi52(String hi52) {
        this.hi52 = hi52;
    }

    /**
     * 
     * @return
     *     The lo52
     */
    @JsonProperty("lo52")
    public String getLo52() {
        return lo52;
    }

    /**
     * 
     * @param lo52
     *     The lo52
     */
    @JsonProperty("lo52")
    public void setLo52(String lo52) {
        this.lo52 = lo52;
    }

    /**
     * 
     * @return
     *     The mc
     */
    @JsonProperty("mc")
    public String getMc() {
        return mc;
    }

    /**
     * 
     * @param mc
     *     The mc
     */
    @JsonProperty("mc")
    public void setMc(String mc) {
        this.mc = mc;
    }

    /**
     * 
     * @return
     *     The pe
     */
    @JsonProperty("pe")
    public String getPe() {
        return pe;
    }

    /**
     * 
     * @param pe
     *     The pe
     */
    @JsonProperty("pe")
    public void setPe(String pe) {
        this.pe = pe;
    }

    /**
     * 
     * @return
     *     The fwpe
     */
    @JsonProperty("fwpe")
    public String getFwpe() {
        return fwpe;
    }

    /**
     * 
     * @param fwpe
     *     The fwpe
     */
    @JsonProperty("fwpe")
    public void setFwpe(String fwpe) {
        this.fwpe = fwpe;
    }

    /**
     * 
     * @return
     *     The beta
     */
    @JsonProperty("beta")
    public String getBeta() {
        return beta;
    }

    /**
     * 
     * @param beta
     *     The beta
     */
    @JsonProperty("beta")
    public void setBeta(String beta) {
        this.beta = beta;
    }

    /**
     * 
     * @return
     *     The eps
     */
    @JsonProperty("eps")
    public String getEps() {
        return eps;
    }

    /**
     * 
     * @param eps
     *     The eps
     */
    @JsonProperty("eps")
    public void setEps(String eps) {
        this.eps = eps;
    }

    /**
     * 
     * @return
     *     The dy
     */
    @JsonProperty("dy")
    public String getDy() {
        return dy;
    }

    /**
     * 
     * @param dy
     *     The dy
     */
    @JsonProperty("dy")
    public void setDy(String dy) {
        this.dy = dy;
    }

    /**
     * 
     * @return
     *     The ldiv
     */
    @JsonProperty("ldiv")
    public String getLdiv() {
        return ldiv;
    }

    /**
     * 
     * @param ldiv
     *     The ldiv
     */
    @JsonProperty("ldiv")
    public void setLdiv(String ldiv) {
        this.ldiv = ldiv;
    }

    /**
     * 
     * @return
     *     The shares
     */
    @JsonProperty("shares")
    public String getShares() {
        return shares;
    }

    /**
     * 
     * @param shares
     *     The shares
     */
    @JsonProperty("shares")
    public void setShares(String shares) {
        this.shares = shares;
    }

    /**
     * 
     * @return
     *     The instown
     */
    @JsonProperty("instown")
    public String getInstown() {
        return instown;
    }

    /**
     * 
     * @param instown
     *     The instown
     */
    @JsonProperty("instown")
    public void setInstown(String instown) {
        this.instown = instown;
    }

    /**
     * 
     * @return
     *     The eo
     */
    @JsonProperty("eo")
    public String getEo() {
        return eo;
    }

    /**
     * 
     * @param eo
     *     The eo
     */
    @JsonProperty("eo")
    public void setEo(String eo) {
        this.eo = eo;
    }

    /**
     * 
     * @return
     *     The sid
     */
    @JsonProperty("sid")
    public String getSid() {
        return sid;
    }

    /**
     * 
     * @param sid
     *     The sid
     */
    @JsonProperty("sid")
    public void setSid(String sid) {
        this.sid = sid;
    }

    /**
     * 
     * @return
     *     The sname
     */
    @JsonProperty("sname")
    public String getSname() {
        return sname;
    }

    /**
     * 
     * @param sname
     *     The sname
     */
    @JsonProperty("sname")
    public void setSname(String sname) {
        this.sname = sname;
    }

    /**
     * 
     * @return
     *     The iid
     */
    @JsonProperty("iid")
    public String getIid() {
        return iid;
    }

    /**
     * 
     * @param iid
     *     The iid
     */
    @JsonProperty("iid")
    public void setIid(String iid) {
        this.iid = iid;
    }

    /**
     * 
     * @return
     *     The iname
     */
    @JsonProperty("iname")
    public String getIname() {
        return iname;
    }

    /**
     * 
     * @param iname
     *     The iname
     */
    @JsonProperty("iname")
    public void setIname(String iname) {
        this.iname = iname;
    }

    /**
     * 
     * @return
     *     The related
     */
    @JsonProperty("related")
    public List<Related> getRelated() {
        return related;
    }

    /**
     * 
     * @param related
     *     The related
     */
    @JsonProperty("related")
    public void setRelated(List<Related> related) {
        this.related = related;
    }

    /**
     * 
     * @return
     *     The summary
     */
    @JsonProperty("summary")
    public List<Summary> getSummary() {
        return summary;
    }

    /**
     * 
     * @param summary
     *     The summary
     */
    @JsonProperty("summary")
    public void setSummary(List<Summary> summary) {
        this.summary = summary;
    }

    /**
     * 
     * @return
     *     The management
     */
    @JsonProperty("management")
    public List<Management> getManagement() {
        return management;
    }

    /**
     * 
     * @param management
     *     The management
     */
    @JsonProperty("management")
    public void setManagement(List<Management> management) {
        this.management = management;
    }

    /**
     * 
     * @return
     *     The moreresources
     */
    @JsonProperty("moreresources")
    public List<Moreresource> getMoreresources() {
        return moreresources;
    }

    /**
     * 
     * @param moreresources
     *     The moreresources
     */
    @JsonProperty("moreresources")
    public void setMoreresources(List<Moreresource> moreresources) {
        this.moreresources = moreresources;
    }

    /**
     * 
     * @return
     *     The events
     */
    @JsonProperty("events")
    public List<Object> getEvents() {
        return events;
    }

    /**
     * 
     * @param events
     *     The events
     */
    @JsonProperty("events")
    public void setEvents(List<Object> events) {
        this.events = events;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
    @Override
    public String toString() {
      String s=  "symbol:"+symbol+
    " exchange:"+exchange+
    " id:"+id+
    " t:"+t+
    " e:"+e+
    " name:"+name+
    " f_reuters_url:"+fReutersUrl+
    " f_recent_quarter_date:"+fRecentQuarterDate+
    " f_annual_date:"+fAnnualDate+
    " f_ttm_date:"+fTtmDate+
    " financials:"+financials+
    " kr_recent_quarter_date:"+krRecentQuarterDate+
    " kr_annual_date:"+krAnnualDate+
    " kr_ttm_date:"+krTtmDate+
    " keyratios:"+keyratios+
    " c:"+c+
    " l:"+l+
    " cp:"+cp+
    " ccol:"+ccol+
    " op:"+op+
    " hi:"+hi+
    " lo:"+lo+
    " vo:"+vo+
    " avvo:"+avvo+
    " hi52:"+hi52+
    " lo52:"+lo52+
    " mc:"+mc+
    " pe:"+pe+
    " fwpe:"+fwpe+
    " beta:"+beta+
    " eps:"+eps+
    " dy:"+dy+
    " ldiv:"+ldiv+
    " shares:"+shares+
    " instown:"+instown+
    " eo:"+eo+
    " sid:"+sid+
    " sname:"+sname+
    " iid:"+iid+
    " iname:"+iname+
    " related:"+related+
    " summary:"+summary+
    " management:"+management+
    " moreresources:"+moreresources+
    " events:"+events;
      return s;
    }

}
