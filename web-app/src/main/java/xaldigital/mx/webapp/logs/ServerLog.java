package xaldigital.mx.webapp.logs;

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
        "time",
        "_class",
        "user",
        "type",
        "error",
        "method",
        "errorCode",
        "clientIpv4",
        "parameters",
        "body"
})
@Generated("jsonschema2pojo")
public class ServerLog {

    @JsonProperty("time")
    private String time;
    @JsonProperty("_class")
    private String _class;    
    @JsonProperty("type")
    private String type;
    @JsonProperty("error")
    private String error;
    @JsonProperty("method")
    private String method;
    @JsonProperty("errorCode")
    private String errorCode;
    @JsonProperty("clientIpv4")
    private String clientIpv4;
    @JsonProperty("parameters")
    private String parameters;
    @JsonProperty("body")
    private Object body;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public ServerLog(String time, String _class, String type, 
            String method, String clientIpv4, Object body) 
    {
        this.time = time;
        this._class = _class;        
        this.type = type;
        this.error = null;
        this.method = method;
        this.errorCode = null;
        this.clientIpv4 = clientIpv4;
        this.parameters = null;        
        this.body = body;
    }

    public ServerLog(String time, String _class, String type, 
            String error, String method, String errorCode, String clientIpv4, Object body) {
        this.time = time;
        this._class = _class;             
        this.type = type;
        this.error = error;
        this.method = method;
        this.errorCode = errorCode;
        this.clientIpv4 = clientIpv4;
        this.parameters = null;        
        this.body = body;    
    }    

    public ServerLog(String time, String _class, String type, 
            String method, String clientIpv4, String parameters) 
    {
        this.time = time;
        this._class = _class;        
        this.type = type;
        this.error = null;
        this.method = method;
        this.errorCode = null;
        this.clientIpv4 = clientIpv4;
        this.parameters = parameters;    
        this.body = null;    
    }

    public ServerLog(String time, String _class, String type, 
            String error, String method, String errorCode, String clientIpv4, String parameters) {
        this.time = time;
        this._class = _class;                
        this.type = type;
        this.error = error;
        this.method = method;
        this.errorCode = errorCode;
        this.clientIpv4 = clientIpv4;
        this.parameters = parameters;        
        this.body = null;    
    }

    public ServerLog(String time, String _class, String type, String error, String method, String errorCode,
            String clientIpv4, String parameters, Map<String, Object> additionalProperties) {
        this.time = time;
        this._class = _class;
        this.type = type;
        this.error = error;
        this.method = method;
        this.errorCode = errorCode;
        this.clientIpv4 = clientIpv4;
        this.parameters = parameters;
        this.body = null;    
        this.additionalProperties = additionalProperties;
    }


    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    @JsonProperty("_class")
    public String getClass_() {
        return _class;
    }

    @JsonProperty("_class")
    public void setClass_(String _class) {
        this._class = _class;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("error")
    public String getError() {
        return error;
    }

    @JsonProperty("error")
    public void setError(String error) {
        this.error = error;
    }

    @JsonProperty("method")
    public String getMethod() {
        return method;
    }

    @JsonProperty("method")
    public void setMethod(String method) {
        this.method = method;
    }

    @JsonProperty("errorCode")
    public String getErrorCode() {
        return errorCode;
    }

    @JsonProperty("errorCode")
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @JsonProperty("clientIpv4")
    public String getClientIpv4() {
        return clientIpv4;
    }

    @JsonProperty("clientIpv4")
    public void setClientIpv4(String clientIpv4) {
        this.clientIpv4 = clientIpv4;
    }

    @JsonProperty("parameters")
    public String getParameters() {
        return parameters;
    }

    @JsonProperty("parameters")
    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    @JsonProperty("body")
    public Object getBody() {
        return body;
    }

    @JsonProperty("body")
    public void setBody(Object body) {
        this.body = body;
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