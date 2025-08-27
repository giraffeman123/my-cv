package xaldigital.mx.webapp.service.api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import xaldigital.mx.webapp.config.ApiConfig;

@Component
public class XalDigitalApi {

    @Autowired
    private ApiConfig apiConfig;
  
    private static final String MYCV_PATH = "/mycv";        

    public String getMyCV() throws Exception {
        
        final String USER_AGENT = "Mozilla/5.0";

        String url = "";
        String api = apiConfig.getBaseUrl();
        String servicio = MYCV_PATH;

        String charset = "UTF-8";
                   
        url= api+servicio;
        URL obj = new URL(url);

        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        //add request header
        con.setRequestProperty("User-Agent", USER_AGENT);

        //add charset
        con.setRequestProperty("Accept-Charset", charset);

        // optional default is GET
        con.setRequestMethod("GET");

        int responseCode = con.getResponseCode();

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        return response.toString();

    }        
}
