package xaldigital.mx.webapp.service.api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import xaldigital.mx.webapp.config.ApiConfig;

@Component
public class XalDigitalApi {

    @Autowired
    private ApiConfig apiConfig;

    private static final String AIRPORT_MOST_MOVEMENT_PATH = "/flights/airport/most-movement";    
    private static final String AIRLINE_MOST_FLIGHTS_PATH = "/flights/airline/most-flights";    
    private static final String DAY_MOST_FLIGHTS_PATH = "/flights/day/most-flights";      
    private static final String AIRLINE_MORE_THAN_2_PATH = "/flights/airline/more-than-2-flights";    

    private static final String TOTAL_ANSWERED_AND_UNANSWERED_PATH = "/answers/answered-and-unanswered";    
    private static final String ANSWER_WITH_BETTER_REPUTATION_PATH = "/answers/better-reputation";    
    private static final String ANSWER_WITH_LESS_AMOUNT_VISITS_PATH = "/answers/less-amount-of-visits";      
    private static final String OLDEST_AND_NEWEST_ANSWERS_PATH = "/answers/oldest-and-newest";    
    private static final String ANSWERS_2_TO_5_PATH = "/answers/two-to-five";    

    public String getAirportWithMostMovement(Integer year) throws Exception {
        
        if (year == null)
            return null;       

        final String USER_AGENT = "Mozilla/5.0";

        String url = "";
        String api = apiConfig.getBaseUrl();
        String servicio = AIRPORT_MOST_MOVEMENT_PATH;

        String charset = "UTF-8";
        String query = String.format("?year=%s", 
                   URLEncoder.encode(year.toString(), charset));
                   
        url= api+servicio+query;
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

    public String getAirlineWithMostFlights(Integer year) throws Exception {
        
        if (year == null)
            return null;       

        final String USER_AGENT = "Mozilla/5.0";

        String url = "";
        String api = apiConfig.getBaseUrl();
        String servicio = AIRLINE_MOST_FLIGHTS_PATH;

        String charset = "UTF-8";
        String query = String.format("?year=%s", 
                   URLEncoder.encode(year.toString(), charset));
                   
        url= api+servicio+query;
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
    
    public String getDayWithMostFlights(Integer year) throws Exception {
        
        if (year == null)
            return null;       

        final String USER_AGENT = "Mozilla/5.0";

        String url = "";
        String api = apiConfig.getBaseUrl();
        String servicio = DAY_MOST_FLIGHTS_PATH;

        String charset = "UTF-8";
        String query = String.format("?year=%s", 
                   URLEncoder.encode(year.toString(), charset));
                   
        url= api+servicio+query;
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
    
    public String getAirlinesWithMoreThan2Flights() throws Exception {
        
        final String USER_AGENT = "Mozilla/5.0";

        String url = "";
        String api = apiConfig.getBaseUrl();
        String servicio = AIRLINE_MORE_THAN_2_PATH;

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

    public String getNumberOfAnsweredAndUnansweredQuestions() throws Exception {
        
        final String USER_AGENT = "Mozilla/5.0";

        String url = "";
        String api = apiConfig.getBaseUrl();
        String servicio = TOTAL_ANSWERED_AND_UNANSWERED_PATH;

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

    public String getAnswerWithBetterReputation() throws Exception {
        
        final String USER_AGENT = "Mozilla/5.0";

        String url = "";
        String api = apiConfig.getBaseUrl();
        String servicio = ANSWER_WITH_BETTER_REPUTATION_PATH;

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
    
    public String getAnswerWithLessAmountOfVisits() throws Exception {
        
        final String USER_AGENT = "Mozilla/5.0";

        String url = "";
        String api = apiConfig.getBaseUrl();
        String servicio = ANSWER_WITH_LESS_AMOUNT_VISITS_PATH;

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
    
    public String getOldestAndNewestAnswer() throws Exception {
        
        final String USER_AGENT = "Mozilla/5.0";

        String url = "";
        String api = apiConfig.getBaseUrl();
        String servicio = OLDEST_AND_NEWEST_ANSWERS_PATH;

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
    
    public String get2To5AnswerList() throws Exception {
        
        final String USER_AGENT = "Mozilla/5.0";

        String url = "";
        String api = apiConfig.getBaseUrl();
        String servicio = ANSWERS_2_TO_5_PATH;

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
