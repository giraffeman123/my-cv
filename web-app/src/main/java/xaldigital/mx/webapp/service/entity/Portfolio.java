package xaldigital.mx.webapp.service.entity;

import java.util.LinkedHashMap;
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
@JsonPropertyOrder({
        "duration",
        "technologies",
        "description",
        "company",
        "title"
})
@Generated("jsonschema2pojo")
public class Portfolio {

    @JsonProperty("duration")
    private String duration;
    @JsonProperty("technologies")
    private List<String> technologies;
    @JsonProperty("description")
    private String description;
    @JsonProperty("company")
    private String company;
    @JsonProperty("title")
    private String title;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("duration")
    public String getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(String duration) {
        this.duration = duration;
    }

    @JsonProperty("technologies")
    public List<String> getTechnologies() {
        return technologies;
    }

    @JsonProperty("technologies")
    public void setTechnologies(List<String> technologies) {
        this.technologies = technologies;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("company")
    public String getCompany() {
        return company;
    }

    @JsonProperty("company")
    public void setCompany(String company) {
        this.company = company;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
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