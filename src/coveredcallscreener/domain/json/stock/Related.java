package coveredcallscreener.domain.json.stock;

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
    "id",
    "name",
    "t",
    "e",
    "l",
    "c",
    "mc",
    "cp",
    "ccol"
})
public class Related {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("t")
    private String t;
    @JsonProperty("e")
    private String e;
    @JsonProperty("l")
    private String l;
    @JsonProperty("c")
    private String c;
    @JsonProperty("mc")
    private String mc;
    @JsonProperty("cp")
    private String cp;
    @JsonProperty("ccol")
    private String ccol;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
