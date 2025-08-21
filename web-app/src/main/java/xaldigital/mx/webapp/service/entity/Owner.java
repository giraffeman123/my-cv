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
        "reputation",
        "user_id",
        "user_type",
        "accept_rate",
        "profile_image",
        "display_name",
        "link"
})
@Generated("jsonschema2pojo")
public class Owner {

    @JsonProperty("reputation")
    private Integer reputation;
    @JsonProperty("user_id")
    private Integer user_id;
    @JsonProperty("user_type")
    private String user_type;
    @JsonProperty("accept_rate")
    private Integer accept_rate;
    @JsonProperty("profile_image")
    private String profile_image;
    @JsonProperty("display_name")
    private String display_name;
    @JsonProperty("link")
    private String link;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("reputation")
    public Integer getReputation() {
        return reputation;
    }

    @JsonProperty("reputation")
    public void setReputation(Integer reputation) {
        this.reputation = reputation;
    }

    @JsonProperty("user_id")
    public Integer getUserId() {
        return user_id;
    }

    @JsonProperty("user_id")
    public void setUserId(Integer user_id) {
        this.user_id = user_id;
    }

    @JsonProperty("user_type")
    public String getUserType() {
        return user_type;
    }

    @JsonProperty("user_type")
    public void setUserType(String user_type) {
        this.user_type = user_type;
    }

    @JsonProperty("accept_rate")
    public Integer getAcceptRate() {
        return accept_rate;
    }

    @JsonProperty("accept_rate")
    public void setAcceptRate(Integer accept_rate) {
        this.accept_rate = accept_rate;
    }

    @JsonProperty("profile_image")
    public String getProfileImage() {
        return profile_image;
    }

    @JsonProperty("profile_image")
    public void setProfileImage(String profile_image) {
        this.profile_image = profile_image;
    }

    @JsonProperty("display_name")
    public String getDisplayName() {
        return display_name;
    }

    @JsonProperty("display_name")
    public void setDisplayName(String display_name) {
        this.display_name = display_name;
    }

    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
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