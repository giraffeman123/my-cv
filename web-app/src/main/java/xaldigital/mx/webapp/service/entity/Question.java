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
        "tags",
        "owner",
        "is_answered",
        "view_count",
        "closed_date",
        "answer_count",
        "score",
        "last_activity_date",
        "creation_date",
        "last_edit_date",
        "question_id",
        "link",
        "closed_reason",
        "title"
})
@Generated("jsonschema2pojo")
public class Question {

    @JsonProperty("tags")
    private List<String> tags;
    @JsonProperty("owner")
    private Owner owner;
    @JsonProperty("is_answered")
    private Boolean is_answered;
    @JsonProperty("view_count")
    private Integer view_count;
    @JsonProperty("closed_date")
    private Integer closed_date;
    @JsonProperty("answer_count")
    private Integer answer_count;
    @JsonProperty("score")
    private Integer score;
    @JsonProperty("last_activity_date")
    private Integer last_activity_date;
    @JsonProperty("creation_date")
    private Integer creation_date;
    @JsonProperty("last_edit_date")
    private Integer last_edit_date;
    @JsonProperty("question_id")
    private Integer question_id;
    @JsonProperty("link")
    private String link;
    @JsonProperty("closed_reason")
    private String closed_reason;
    @JsonProperty("title")
    private String title;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @JsonProperty("owner")
    public Owner getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @JsonProperty("is_answered")
    public Boolean getIsAnswered() {
        return is_answered;
    }

    @JsonProperty("is_answered")
    public void setIsAnswered(Boolean is_answered) {
        this.is_answered = is_answered;
    }

    @JsonProperty("view_count")
    public Integer getViewCount() {
        return view_count;
    }

    @JsonProperty("view_count")
    public void setViewCount(Integer view_count) {
        this.view_count = view_count;
    }

    @JsonProperty("closed_date")
    public Integer getClosedDate() {
        return closed_date;
    }

    @JsonProperty("closed_date")
    public void setClosedDate(Integer closed_date) {
        this.closed_date = closed_date;
    }

    @JsonProperty("answer_count")
    public Integer getAnswerCount() {
        return answer_count;
    }

    @JsonProperty("answer_count")
    public void setAnswerCount(Integer answer_count) {
        this.answer_count = answer_count;
    }

    @JsonProperty("score")
    public Integer getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Integer score) {
        this.score = score;
    }

    @JsonProperty("last_activity_date")
    public Integer getLastActivityDate() {
        return last_activity_date;
    }

    @JsonProperty("last_activity_date")
    public void setLastActivityDate(Integer last_activity_date) {
        this.last_activity_date = last_activity_date;
    }

    @JsonProperty("creation_date")
    public Integer getCreationDate() {
        return creation_date;
    }

    @JsonProperty("creation_date")
    public void setCreationDate(Integer creation_date) {
        this.creation_date = creation_date;
    }

    @JsonProperty("last_edit_date")
    public Integer getLastEditDate() {
        return last_edit_date;
    }

    @JsonProperty("last_edit_date")
    public void setLastEditDate(Integer last_edit_date) {
        this.last_edit_date = last_edit_date;
    }

    @JsonProperty("question_id")
    public Integer getQuestionId() {
        return question_id;
    }

    @JsonProperty("question_id")
    public void setQuestionId(Integer question_id) {
        this.question_id = question_id;
    }

    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }

    @JsonProperty("closed_reason")
    public String getClosedReason() {
        return closed_reason;
    }

    @JsonProperty("closed_reason")
    public void setClosedReason(String closed_reason) {
        this.closed_reason = closed_reason;
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