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
    "title",
    "recent_quarter",
    "annual",
    "ttm"
})
public class Keyratio {

    @JsonProperty("title")
    private String title;
    @JsonProperty("recent_quarter")
    private String recentQuarter;
    @JsonProperty("annual")
    private String annual;
    @JsonProperty("ttm")
    private String ttm;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The recentQuarter
     */
    @JsonProperty("recent_quarter")
    public String getRecentQuarter() {
        return recentQuarter;
    }

    /**
     * 
     * @param recentQuarter
     *     The recent_quarter
     */
    @JsonProperty("recent_quarter")
    public void setRecentQuarter(String recentQuarter) {
        this.recentQuarter = recentQuarter;
    }

    /**
     * 
     * @return
     *     The annual
     */
    @JsonProperty("annual")
    public String getAnnual() {
        return annual;
    }

    /**
     * 
     * @param annual
     *     The annual
     */
    @JsonProperty("annual")
    public void setAnnual(String annual) {
        this.annual = annual;
    }

    /**
     * 
     * @return
     *     The ttm
     */
    @JsonProperty("ttm")
    public String getTtm() {
        return ttm;
    }

    /**
     * 
     * @param ttm
     *     The ttm
     */
    @JsonProperty("ttm")
    public void setTtm(String ttm) {
        this.ttm = ttm;
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
