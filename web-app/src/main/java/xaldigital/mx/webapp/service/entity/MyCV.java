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
        "academic_history",
        "profile_img",
        "portfolio",
        "CVID",
        "about_me",
        "languages",
        "external_links",
        "music_projects"
})
@Generated("jsonschema2pojo")
public class MyCV {

    @JsonProperty("academic_history")
    private List<AcademicHistory> academicHistory;
    @JsonProperty("profile_img")
    private String profileImg;
    @JsonProperty("portfolio")
    private List<Portfolio> portfolio;
    @JsonProperty("CVID")
    private String cvid;
    @JsonProperty("about_me")
    private String aboutMe;
    @JsonProperty("languages")
    private List<Language> languages;
    @JsonProperty("external_links")
    private ExternalLinks externalLinks;
    @JsonProperty("music_projects")
    private List<MusicProject> musicProjects;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("academic_history")
    public List<AcademicHistory> getAcademicHistory() {
        return academicHistory;
    }

    @JsonProperty("academic_history")
    public void setAcademicHistory(List<AcademicHistory> academicHistory) {
        this.academicHistory = academicHistory;
    }

    @JsonProperty("profile_img")
    public String getProfileImg() {
        return profileImg;
    }

    @JsonProperty("profile_img")
    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    @JsonProperty("portfolio")
    public List<Portfolio> getPortfolio() {
        return portfolio;
    }

    @JsonProperty("portfolio")
    public void setPortfolio(List<Portfolio> portfolio) {
        this.portfolio = portfolio;
    }

    @JsonProperty("CVID")
    public String getCvid() {
        return cvid;
    }

    @JsonProperty("CVID")
    public void setCvid(String cvid) {
        this.cvid = cvid;
    }

    @JsonProperty("about_me")
    public String getAboutMe() {
        return aboutMe;
    }

    @JsonProperty("about_me")
    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    @JsonProperty("languages")
    public List<Language> getLanguages() {
        return languages;
    }

    @JsonProperty("languages")
    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    @JsonProperty("external_links")
    public ExternalLinks getExternalLinks() {
        return externalLinks;
    }

    @JsonProperty("external_links")
    public void setExternalLinks(ExternalLinks externalLinks) {
        this.externalLinks = externalLinks;
    }

    @JsonProperty("music_projects")
    public List<MusicProject> getMusicProjects() {
        return musicProjects;
    }

    @JsonProperty("music_projects")
    public void setMusicProjects(List<MusicProject> musicProjects) {
        this.musicProjects = musicProjects;
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