
package stockscreener.json.option;

import java.util.HashMap;
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
    "cid",
    "name",
    "s",
    "e",
    "p",
    "c",
    "b",
    "a",
    "oi",
    "vol",
    "strike",
    "expary",
    "expiry"
})
public class Put {

    @JsonProperty("cid")
    private String cid;
    @JsonProperty("name")
    private String name;
    @JsonProperty("s")
    private String s;
    @JsonProperty("e")
    private String e;
    @JsonProperty("p")
    private String p;
    @JsonProperty("c")
    private String c;
    @JsonProperty("b")
    private String b;
    @JsonProperty("a")
    private String a;
    @JsonProperty("oi")
    private String oi;
    @JsonProperty("vol")
    private String vol;
    @JsonProperty("strike")
    private String strike;
    @JsonProperty("expary")
    private String expary;
    @JsonProperty("expiry")
    private String expiry;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The cid
     */
    @JsonProperty("cid")
    public String getCid() {
        return cid;
    }

    /**
     * 
     * @param cid
     *     The cid
     */
    @JsonProperty("cid")
    public void setCid(String cid) {
        this.cid = cid;
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
     *     The s
     */
    @JsonProperty("s")
    public String getS() {
        return s;
    }

    /**
     * 
     * @param s
     *     The s
     */
    @JsonProperty("s")
    public void setS(String s) {
        this.s = s;
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
     *     The p
     */
    @JsonProperty("p")
    public String getP() {
        return p;
    }

    /**
     * 
     * @param p
     *     The p
     */
    @JsonProperty("p")
    public void setP(String p) {
        this.p = p;
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
     *     The b
     */
    @JsonProperty("b")
    public String getB() {
        return b;
    }

    /**
     * 
     * @param b
     *     The b
     */
    @JsonProperty("b")
    public void setB(String b) {
        this.b = b;
    }

    /**
     * 
     * @return
     *     The a
     */
    @JsonProperty("a")
    public String getA() {
        return a;
    }

    /**
     * 
     * @param a
     *     The a
     */
    @JsonProperty("a")
    public void setA(String a) {
        this.a = a;
    }

    /**
     * 
     * @return
     *     The oi
     */
    @JsonProperty("oi")
    public String getOi() {
        return oi;
    }

    /**
     * 
     * @param oi
     *     The oi
     */
    @JsonProperty("oi")
    public void setOi(String oi) {
        this.oi = oi;
    }

    /**
     * 
     * @return
     *     The vol
     */
    @JsonProperty("vol")
    public String getVol() {
        return vol;
    }

    /**
     * 
     * @param vol
     *     The vol
     */
    @JsonProperty("vol")
    public void setVol(String vol) {
        this.vol = vol;
    }

    /**
     * 
     * @return
     *     The strike
     */
    @JsonProperty("strike")
    public String getStrike() {
        return strike;
    }

    /**
     * 
     * @param strike
     *     The strike
     */
    @JsonProperty("strike")
    public void setStrike(String strike) {
        this.strike = strike;
    }

    /**
     * 
     * @return
     *     The expary
     */
    @JsonProperty("expary")
    public String getExpary() {
        return expary;
    }

    /**
     * 
     * @param expary
     *     The expary
     */
    @JsonProperty("expary")
    public void setExpary(String expary) {
        this.expary = expary;
    }

    /**
     * 
     * @return
     *     The expiry
     */
    @JsonProperty("expiry")
    public String getExpiry() {
        return expiry;
    }

    /**
     * 
     * @param expiry
     *     The expiry
     */
    @JsonProperty("expiry")
    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
