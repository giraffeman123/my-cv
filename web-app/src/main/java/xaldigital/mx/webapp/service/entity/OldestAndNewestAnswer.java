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
    "oldestAnswer",
    "newestAnswer"
})
@Generated("jsonschema2pojo")
public class OldestAndNewestAnswer {

    @JsonProperty("oldestAnswer")
    private Question oldestAnswer;
    @JsonProperty("newestAnswer")
    private Question newestAnswer;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("oldestAnswer")
    public Question getOldestAnswer() {
        return oldestAnswer;
    }

    @JsonProperty("oldestAnswer")
    public void setOldestAnswer(Question oldestAnswer) {
        this.oldestAnswer = oldestAnswer;
    }

    @JsonProperty("newestAnswer")
    public Question getNewestAnswer() {
        return newestAnswer;
    }

    @JsonProperty("newestAnswer")
    public void setNewestAnswer(Question newestAnswer) {
        this.newestAnswer = newestAnswer;
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