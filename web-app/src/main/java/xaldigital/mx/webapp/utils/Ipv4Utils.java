package xaldigital.mx.webapp.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import jakarta.servlet.http.HttpServletRequest;

public class Ipv4Utils {

    public static String GetClientIpv4(HttpServletRequest req) {        
        String clientIpHeader = req.getRemoteAddr() != null ? req.getRemoteAddr() 
                    : (req.getHeader("X-Forwarded-For") != null ? req.getHeader("X-Forwarded-For") 
                        : req.getHeader("x-original-forwarded-for"));

        return CleanIpHeader(clientIpHeader);
    }

    private static String CleanIpHeader(String clientIpHeader){
        // example of an Ipv4 embedded in Ipv6 -> 2001:db8:122:344::192.0.2.33
        Pattern ipv4Pattern = Pattern.compile("(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)");
        
        Matcher matcher = ipv4Pattern.matcher(clientIpHeader);
        if (matcher.find()) {
            String ipv4 = matcher.group();
            return ipv4;
        }else   
            return "Ip Retrieval Error";
    }
}
