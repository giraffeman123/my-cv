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
        "name",
        "album_img",
        "genre",
        "description",
        "href_link",
        "release_date"
})
@Generated("jsonschema2pojo")
public class MusicProject {

    @JsonProperty("name")
    private String name;
    @JsonProperty("album_img")
    private String albumImg;
    @JsonProperty("genre")
    private List<String> genre;
    @JsonProperty("description")
    private String description;
    @JsonProperty("href_link")
    private String hrefLink;
    @JsonProperty("release_date")
    private String releaseDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("album_img")
    public String getAlbumImg() {
        return albumImg;
    }

    @JsonProperty("album_img")
    public void setAlbumImg(String albumImg) {
        this.albumImg = albumImg;
    }

    @JsonProperty("genre")
    public List<String> getGenre() {
        return genre;
    }

    @JsonProperty("genre")
    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("href_link")
    public String getHrefLink() {
        return hrefLink;
    }

    @JsonProperty("href_link")
    public void setHrefLink(String hrefLink) {
        this.hrefLink = hrefLink;
    }

    @JsonProperty("release_date")
    public String getReleaseDate() {
        return releaseDate;
    }

    @JsonProperty("release_date")
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
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