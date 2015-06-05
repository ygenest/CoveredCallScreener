package coveredcallscreener.domain.json.stock;

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
    "f_type",
    "url",
    "f_figures"
})
public class Financial {

    @JsonProperty("f_type")
    private String fType;
    @JsonProperty("url")
    private String url;
    @JsonProperty("f_figures")
    private List<FFigure> fFigures = new ArrayList<FFigure>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The fType
     */
    @JsonProperty("f_type")
    public String getFType() {
        return fType;
    }

    /**
     * 
     * @param fType
     *     The f_type
     */
    @JsonProperty("f_type")
    public void setFType(String fType) {
        this.fType = fType;
    }

    /**
     * 
     * @return
     *     The url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The fFigures
     */
    @JsonProperty("f_figures")
    public List<FFigure> getFFigures() {
        return fFigures;
    }

    /**
     * 
     * @param fFigures
     *     The f_figures
     */
    @JsonProperty("f_figures")
    public void setFFigures(List<FFigure> fFigures) {
        this.fFigures = fFigures;
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
