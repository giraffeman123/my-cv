package xaldigital.mx.webapp.logs;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Timestamp;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Logger {
    
    public static String convertExceptionStackTraceToString(Exception e){        
        
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);

        String estackTraceString = removeSpacesFromString(sw.toString());
        //estackTraceString = estackTraceString.replaceAll("\\s+"," ");

        return estackTraceString;
    }

    private static String removeSpacesFromString(String str){                    
        return str.replaceAll("\\s+"," ");
    }

    public static void printActionLog(String _class, String type, 
        String method, String clientIpv4, String parameters)
    {        
        String timestamp = new Timestamp(System.currentTimeMillis()).toString();
        
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        String jsonLog = gson.toJson(new ServerLog(timestamp,_class, type, method, clientIpv4, parameters));        
        System.out.println(jsonLog);
    }

    public static void printActionLog(String _class, String type, 
        String method, String clientIpv4, Object body)
    {                
        String timestamp = new Timestamp(System.currentTimeMillis()).toString();
        
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        String jsonLog = gson.toJson(new ServerLog(timestamp,_class, type, method, clientIpv4, body));        
        System.out.println(jsonLog);
    }    
    
    public static void printErrorLog(String _class, String type, String error, String method, 
        String errorCode, String clientIpv4, String parameters)
    {        
        String timestamp = new Timestamp(System.currentTimeMillis()).toString();
        
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        String jsonLog = gson.toJson(new ServerLog(timestamp,_class, type, error, method, errorCode, clientIpv4, parameters));
        System.out.println(jsonLog);
    }

    public static void printErrorLog(String _class, String type, String error, String method, 
        String errorCode, String clientIpv4, Object body)
    {        
        String timestamp = new Timestamp(System.currentTimeMillis()).toString();
        
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        String jsonLog = gson.toJson(new ServerLog(timestamp,_class, type, error, method, errorCode, clientIpv4, body));
        System.out.println(jsonLog);
    }    

}

