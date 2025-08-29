package elliot.mx.webapp.service.dao;

import java.io.FileNotFoundException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import elliot.mx.webapp.logs.Logger;
import elliot.mx.webapp.service.api.CVApi;
import elliot.mx.webapp.service.entity.MyCV;
import elliot.mx.webapp.utils.Ipv4Utils;
import jakarta.servlet.http.HttpServletRequest;

@Component
public class CVDao {

    @Autowired
    private CVApi cvApi;
 
    
    public MyCV getMyCV(HttpServletRequest req) throws FileNotFoundException {

        String clientIp = Ipv4Utils.GetClientIpv4(req);
        MyCV mycv = null;
        Gson gson = new Gson();

        try {
            mycv = gson.fromJson(cvApi.getMyCV(), MyCV.class);

            Logger.printActionLog(this.getClass().getName(), "ACTION",
                    "getMyCV", clientIp, "");
        } catch (JsonSyntaxException e) {
            String errorStackAsString = Logger.convertExceptionStackTraceToString(e);
            Logger.printErrorLog(this.getClass().getName(), "ERROR", errorStackAsString,
                    "getMyCV", "500", clientIp, "");
        } catch (Exception e) {
            String errorStackAsString = Logger.convertExceptionStackTraceToString(e);
            Logger.printErrorLog(this.getClass().getName(), "ERROR", errorStackAsString,
                    "getMyCV", "500", clientIp, "");
        }

        if(mycv != null){
            return mycv;
        }            
        else    
            return null;                
    }     
}
