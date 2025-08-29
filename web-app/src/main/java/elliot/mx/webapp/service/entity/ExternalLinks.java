package elliot.mx.webapp.service.entity;

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
        "youtube",
        "github",
        "bandcamp",
        "linkedin",
        "spotify",
        "facebook"
})
@Generated("jsonschema2pojo")
public class ExternalLinks {

    @JsonProperty("youtube")
    private String youtube;
    @JsonProperty("github")
    private String github;
    @JsonProperty("bandcamp")
    private String bandcamp;
    @JsonProperty("linkedin")
    private String linkedin;
    @JsonProperty("spotify")
    private String spotify;
    @JsonProperty("facebook")
    private String facebook;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("youtube")
    public String getYoutube() {
        return youtube;
    }

    @JsonProperty("youtube")
    public void setYoutube(String youtube) {
        this.youtube = youtube;
    }

    @JsonProperty("github")
    public String getGithub() {
        return github;
    }

    @JsonProperty("github")
    public void setGithub(String github) {
        this.github = github;
    }

    @JsonProperty("bandcamp")
    public String getBandcamp() {
        return bandcamp;
    }

    @JsonProperty("bandcamp")
    public void setBandcamp(String bandcamp) {
        this.bandcamp = bandcamp;
    }

    @JsonProperty("linkedin")
    public String getLinkedin() {
        return linkedin;
    }

    @JsonProperty("linkedin")
    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    @JsonProperty("spotify")
    public String getSpotify() {
        return spotify;
    }

    @JsonProperty("spotify")
    public void setSpotify(String spotify) {
        this.spotify = spotify;
    }

    @JsonProperty("facebook")
    public String getFacebook() {
        return facebook;
    }

    @JsonProperty("facebook")
    public void setFacebook(String facebook) {
        this.facebook = facebook;
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