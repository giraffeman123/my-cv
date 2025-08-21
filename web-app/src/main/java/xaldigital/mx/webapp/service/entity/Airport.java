package xaldigital.mx.webapp.service.entity;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AirportName",
    "TotalMovements"
})
@Generated("jsonschema2pojo")
public class Airport {

    @JsonProperty("AirportName")
    private String AirportName;
    @JsonProperty("TotalMovements")
    private Integer TotalMovements;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("AirportName")
    public String getAirportName() {
        return AirportName;
    }

    @JsonProperty("AirportName")
    public void setAirportName(String AirportName) {
        this.AirportName = AirportName;
    }

    @JsonProperty("TotalMovements")
    public Integer getTotalMovements() {
        return TotalMovements;
    }

    @JsonProperty("TotalMovements")
    public void setTotalMovements(Integer TotalMovements) {
        this.TotalMovements = TotalMovements;
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
