
package coveredcallscreener.domain.json.option;


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
    "expary",
    "expirations",
    "puts",
    "calls",
    "underlying_id",
    "underlying_price"
})
public class GoogleOptionsJson {

    @JsonProperty("expary")
    private Expary expary;
    @JsonProperty("expirations")
    private List<Expiration> expirations = new ArrayList<Expiration>();
    @JsonProperty("puts")
    private List<Put> puts = new ArrayList<Put>();
    @JsonProperty("calls")
    private List<Call> calls = new ArrayList<Call>();
    @JsonProperty("underlying_id")
    private String underlyingId;
    @JsonProperty("underlying_price")
    private Double underlyingPrice;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The expary
     */
    @JsonProperty("expary")
    public Expary getExpary() {
        return expary;
    }

    /**
     * 
     * @param expary
     *     The expary
     */
    @JsonProperty("expary")
    public void setExpary(Expary expary) {
        this.expary = expary;
    }

    /**
     * 
     * @return
     *     The expirations
     */
    @JsonProperty("expirations")
    public List<Expiration> getExpirations() {
        return expirations;
    }

    /**
     * 
     * @param expirations
     *     The expirations
     */
    @JsonProperty("expirations")
    public void setExpirations(List<Expiration> expirations) {
        this.expirations = expirations;
    }

    /**
     * 
     * @return
     *     The puts
     */
    @JsonProperty("puts")
    public List<Put> getPuts() {
        return puts;
    }

    /**
     * 
     * @param puts
     *     The puts
     */
    @JsonProperty("puts")
    public void setPuts(List<Put> puts) {
        this.puts = puts;
    }

    /**
     * 
     * @return
     *     The calls
     */
    @JsonProperty("calls")
    public List<Call> getCalls() {
        return calls;
    }

    /**
     * 
     * @param calls
     *     The calls
     */
    @JsonProperty("calls")
    public void setCalls(List<Call> calls) {
        this.calls = calls;
    }

    /**
     * 
     * @return
     *     The underlyingId
     */
    @JsonProperty("underlying_id")
    public String getUnderlyingId() {
        return underlyingId;
    }

    /**
     * 
     * @param underlyingId
     *     The underlying_id
     */
    @JsonProperty("underlying_id")
    public void setUnderlyingId(String underlyingId) {
        this.underlyingId = underlyingId;
    }

    /**
     * 
     * @return
     *     The underlyingPrice
     */
    @JsonProperty("underlying_price")
    public Double getUnderlyingPrice() {
        return underlyingPrice;
    }

    /**
     * 
     * @param underlyingPrice
     *     The underlying_price
     */
    @JsonProperty("underlying_price")
    public void setUnderlyingPrice(Double underlyingPrice) {
        this.underlyingPrice = underlyingPrice;
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
