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
    "answeredQuestions",
    "unAnsweredQuestions"
})
@Generated("jsonschema2pojo")
public class TotalQuestions {

    @JsonProperty("answeredQuestions")
    private Integer answeredQuestions;
    @JsonProperty("unAnsweredQuestions")
    private Integer unAnsweredQuestions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("answeredQuestions")
    public Integer getAnsweredQuestions() {
        return answeredQuestions;
    }

    @JsonProperty("answeredQuestions")
    public void setAnsweredQuestions(Integer answeredQuestions) {
        this.answeredQuestions = answeredQuestions;
    }

    @JsonProperty("unAnsweredQuestions")
    public Integer getUnAnsweredQuestions() {
        return unAnsweredQuestions;
    }

    @JsonProperty("unAnsweredQuestions")
    public void setUnAnsweredQuestions(Integer unAnsweredQuestions) {
        this.unAnsweredQuestions = unAnsweredQuestions;
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