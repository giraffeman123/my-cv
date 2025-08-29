package elliot.mx.webapp.service.entity;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class MyCV {

    @SerializedName("academic_history")
    @Expose
    private List<AcademicHistory> academicHistory;
    @SerializedName("profile_img")
    @Expose
    private String profileImg;
    @SerializedName("portfolio")
    @Expose
    private List<Portfolio> portfolio;
    @SerializedName("CVID")
    @Expose
    private String cvid;
    @SerializedName("about_me")
    @Expose
    private String aboutMe;
    @SerializedName("languages")
    @Expose
    private List<Language> languages;
    @SerializedName("external_links")
    @Expose
    private ExternalLinks externalLinks;
    @SerializedName("music_projects")
    @Expose
    private List<MusicProject> musicProjects;

    public List<AcademicHistory> getAcademicHistory() {
        return academicHistory;
    }

    public void setAcademicHistory(List<AcademicHistory> academicHistory) {
        this.academicHistory = academicHistory;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    public List<Portfolio> getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(List<Portfolio> portfolio) {
        this.portfolio = portfolio;
    }

    public String getCvid() {
        return cvid;
    }

    public void setCvid(String cvid) {
        this.cvid = cvid;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    public ExternalLinks getExternalLinks() {
        return externalLinks;
    }

    public void setExternalLinks(ExternalLinks externalLinks) {
        this.externalLinks = externalLinks;
    }

    public List<MusicProject> getMusicProjects() {
        return musicProjects;
    }

    public void setMusicProjects(List<MusicProject> musicProjects) {
        this.musicProjects = musicProjects;
    }

}