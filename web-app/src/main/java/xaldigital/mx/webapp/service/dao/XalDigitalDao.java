package xaldigital.mx.webapp.service.dao;

import java.io.FileNotFoundException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import jakarta.servlet.http.HttpServletRequest;
import xaldigital.mx.webapp.logs.Logger;
import xaldigital.mx.webapp.service.api.XalDigitalApi;
import xaldigital.mx.webapp.service.entity.Airline;
import xaldigital.mx.webapp.service.entity.Airport;
import xaldigital.mx.webapp.service.entity.Day;
import xaldigital.mx.webapp.service.entity.OldestAndNewestAnswer;
import xaldigital.mx.webapp.service.entity.Question;
import xaldigital.mx.webapp.service.entity.TotalQuestions;
import xaldigital.mx.webapp.utils.Ipv4Utils;

@Component
public class XalDigitalDao {

    @Autowired
    private XalDigitalApi xalDigitalApi;
 

    public List<Airport> getAirportWithMostMovement(HttpServletRequest req, Integer year) throws FileNotFoundException {

        String clientIp = Ipv4Utils.GetClientIpv4(req);
        List<Airport> airport = null;
        Gson gson = new Gson();

        try {

            Type listType = new TypeToken<ArrayList<Airport>>(){}.getType();
            airport = gson.fromJson(xalDigitalApi.getAirportWithMostMovement(year), listType);

            Logger.printActionLog(this.getClass().getName(), "ACTION",
                    "getAirportWithMostMovement", clientIp, "year=" + year.toString());
        } catch (JsonSyntaxException e) {
            String errorStackAsString = Logger.convertExceptionStackTraceToString(e);
            Logger.printErrorLog(this.getClass().getName(), "ERROR", errorStackAsString,
                    "getAirportWithMostMovement", "500", clientIp, "year=" + year.toString());
        } catch (Exception e) {
            String errorStackAsString = Logger.convertExceptionStackTraceToString(e);
            Logger.printErrorLog(this.getClass().getName(), "ERROR", errorStackAsString,
                    "getAirportWithMostMovement", "500", clientIp, "year=" + year.toString());
        }

        if(airport != null){
            return airport;
        }            
        else    
            return null;                
    }

    public List<Airline> getAirlineWithMostFlights(HttpServletRequest req, Integer year) throws FileNotFoundException {

        String clientIp = Ipv4Utils.GetClientIpv4(req);
        List<Airline> airline = null;
        Gson gson = new Gson();

        try {
            Type listType = new TypeToken<ArrayList<Airline>>(){}.getType();
            airline = gson.fromJson(xalDigitalApi.getAirlineWithMostFlights(year), listType);

            Logger.printActionLog(this.getClass().getName(), "ACTION",
                    "getAirlineWithMostFlights", clientIp, "year=" + year.toString());
        } catch (JsonSyntaxException e) {
            String errorStackAsString = Logger.convertExceptionStackTraceToString(e);
            Logger.printErrorLog(this.getClass().getName(), "ERROR", errorStackAsString,
                    "getAirlineWithMostFlights", "500", clientIp, "year=" + year.toString());
        } catch (Exception e) {
            String errorStackAsString = Logger.convertExceptionStackTraceToString(e);
            Logger.printErrorLog(this.getClass().getName(), "ERROR", errorStackAsString,
                    "getAirlineWithMostFlights", "500", clientIp, "year=" + year.toString());
        }

        if(airline != null){
            return airline;
        }            
        else    
            return null;                
    }
    
    public List<Day> getDayWithMostFlights(HttpServletRequest req, Integer year) throws FileNotFoundException {

        String clientIp = Ipv4Utils.GetClientIpv4(req);
        List<Day> day = null;
        Gson gson = new Gson();

        try {
            Type listType = new TypeToken<ArrayList<Day>>(){}.getType();
            day = gson.fromJson(xalDigitalApi.getDayWithMostFlights(year), listType);

            Logger.printActionLog(this.getClass().getName(), "ACTION",
                    "getDayWithMostFlights", clientIp, "year=" + year.toString());
        } catch (JsonSyntaxException e) {
            String errorStackAsString = Logger.convertExceptionStackTraceToString(e);
            Logger.printErrorLog(this.getClass().getName(), "ERROR", errorStackAsString,
                    "getDayWithMostFlights", "500", clientIp, "year=" + year.toString());
        } catch (Exception e) {
            String errorStackAsString = Logger.convertExceptionStackTraceToString(e);
            Logger.printErrorLog(this.getClass().getName(), "ERROR", errorStackAsString,
                    "getDayWithMostFlights", "500", clientIp, "year=" + year.toString());
        }

        if(day != null){
            return day;
        }            
        else    
            return null;                
    }
    
    public List<Airline> getAirlinesWithMoreThan2Flights(HttpServletRequest req) throws FileNotFoundException {

        String clientIp = Ipv4Utils.GetClientIpv4(req);
        List<Airline> airline = null;
        Gson gson = new Gson();

        try {
            Type listType = new TypeToken<ArrayList<Airline>>(){}.getType();
            airline = gson.fromJson(xalDigitalApi.getAirlinesWithMoreThan2Flights(), listType);

            Logger.printActionLog(this.getClass().getName(), "ACTION",
                    "getAirlinesWithMoreThan2Flights", clientIp, "");
        } catch (JsonSyntaxException e) {
            String errorStackAsString = Logger.convertExceptionStackTraceToString(e);
            Logger.printErrorLog(this.getClass().getName(), "ERROR", errorStackAsString,
                    "getAirlinesWithMoreThan2Flights", "500", clientIp, "");
        } catch (Exception e) {
            String errorStackAsString = Logger.convertExceptionStackTraceToString(e);
            Logger.printErrorLog(this.getClass().getName(), "ERROR", errorStackAsString,
                    "getAirlinesWithMoreThan2Flights", "500", clientIp, "");
        }

        if(airline != null){
            return airline;
        }            
        else    
            return null;                
    }    

    public TotalQuestions getNumberOfAnsweredAndUnansweredQuestions(HttpServletRequest req) throws FileNotFoundException {

        String clientIp = Ipv4Utils.GetClientIpv4(req);
        TotalQuestions totalQuestions = null;
        Gson gson = new Gson();

        try {            
            totalQuestions = gson.fromJson(xalDigitalApi.getNumberOfAnsweredAndUnansweredQuestions(), TotalQuestions.class);

            Logger.printActionLog(this.getClass().getName(), "ACTION",
                    "getNumberOfAnsweredAndUnansweredQuestions", clientIp, "");
        } catch (JsonSyntaxException e) {
            String errorStackAsString = Logger.convertExceptionStackTraceToString(e);
            Logger.printErrorLog(this.getClass().getName(), "ERROR", errorStackAsString,
                    "getNumberOfAnsweredAndUnansweredQuestions", "500", clientIp, "");
        } catch (Exception e) {
            String errorStackAsString = Logger.convertExceptionStackTraceToString(e);
            Logger.printErrorLog(this.getClass().getName(), "ERROR", errorStackAsString,
                    "getNumberOfAnsweredAndUnansweredQuestions", "500", clientIp, "");
        }

        if(totalQuestions != null){
            return totalQuestions;
        }            
        else    
            return null;                
    }  

    public Question getAnswerWithBetterReputation(HttpServletRequest req) throws FileNotFoundException {

        String clientIp = Ipv4Utils.GetClientIpv4(req);
        Question question = null;
        Gson gson = new Gson();

        try {            
            question = gson.fromJson(xalDigitalApi.getAnswerWithBetterReputation(), Question.class);

            Logger.printActionLog(this.getClass().getName(), "ACTION",
                    "getAnswerWithBetterReputation", clientIp, "");
        } catch (JsonSyntaxException e) {
            String errorStackAsString = Logger.convertExceptionStackTraceToString(e);
            Logger.printErrorLog(this.getClass().getName(), "ERROR", errorStackAsString,
                    "getAnswerWithBetterReputation", "500", clientIp, "");
        } catch (Exception e) {
            String errorStackAsString = Logger.convertExceptionStackTraceToString(e);
            Logger.printErrorLog(this.getClass().getName(), "ERROR", errorStackAsString,
                    "getAnswerWithBetterReputation", "500", clientIp, "");
        }

        if(question != null){
            return question;
        }            
        else    
            return null;                
    }  
    
    public Question getAnswerWithLessAmountOfVisits(HttpServletRequest req) throws FileNotFoundException {

        String clientIp = Ipv4Utils.GetClientIpv4(req);
        Question question = null;
        Gson gson = new Gson();

        try {            
            question = gson.fromJson(xalDigitalApi.getAnswerWithLessAmountOfVisits(), Question.class);

            Logger.printActionLog(this.getClass().getName(), "ACTION",
                    "getAnswerWithLessAmountOfVisits", clientIp, "");
        } catch (JsonSyntaxException e) {
            String errorStackAsString = Logger.convertExceptionStackTraceToString(e);
            Logger.printErrorLog(this.getClass().getName(), "ERROR", errorStackAsString,
                    "getAnswerWithLessAmountOfVisits", "500", clientIp, "");
        } catch (Exception e) {
            String errorStackAsString = Logger.convertExceptionStackTraceToString(e);
            Logger.printErrorLog(this.getClass().getName(), "ERROR", errorStackAsString,
                    "getAnswerWithLessAmountOfVisits", "500", clientIp, "");
        }

        if(question != null){
            return question;
        }            
        else    
            return null;                
    }  
    
    public OldestAndNewestAnswer getOldestAndNewestAnswer(HttpServletRequest req) throws FileNotFoundException {

        String clientIp = Ipv4Utils.GetClientIpv4(req);
        OldestAndNewestAnswer oldestAndNewestAnswer = null;
        Gson gson = new Gson();

        try {            
            oldestAndNewestAnswer = gson.fromJson(xalDigitalApi.getOldestAndNewestAnswer(), OldestAndNewestAnswer.class);

            Logger.printActionLog(this.getClass().getName(), "ACTION",
                    "getOldestAndNewestAnswer", clientIp, "");
        } catch (JsonSyntaxException e) {
            String errorStackAsString = Logger.convertExceptionStackTraceToString(e);
            Logger.printErrorLog(this.getClass().getName(), "ERROR", errorStackAsString,
                    "getOldestAndNewestAnswer", "500", clientIp, "");
        } catch (Exception e) {
            String errorStackAsString = Logger.convertExceptionStackTraceToString(e);
            Logger.printErrorLog(this.getClass().getName(), "ERROR", errorStackAsString,
                    "getOldestAndNewestAnswer", "500", clientIp, "");
        }

        if(oldestAndNewestAnswer != null){
            return oldestAndNewestAnswer;
        }            
        else    
            return null;                
    }  
    
    public List<Question> get2To5AnswerList(HttpServletRequest req) throws FileNotFoundException {

        String clientIp = Ipv4Utils.GetClientIpv4(req);
        List<Question> questions = null;
        Gson gson = new Gson();

        try {
            Type listType = new TypeToken<ArrayList<Question>>(){}.getType();
            questions = gson.fromJson(xalDigitalApi.get2To5AnswerList(), listType);

            Logger.printActionLog(this.getClass().getName(), "ACTION",
                    "get2To5AnswerList", clientIp, "");
        } catch (JsonSyntaxException e) {
            String errorStackAsString = Logger.convertExceptionStackTraceToString(e);
            Logger.printErrorLog(this.getClass().getName(), "ERROR", errorStackAsString,
                    "get2To5AnswerList", "500", clientIp, "");
        } catch (Exception e) {
            String errorStackAsString = Logger.convertExceptionStackTraceToString(e);
            Logger.printErrorLog(this.getClass().getName(), "ERROR", errorStackAsString,
                    "get2To5AnswerList", "500", clientIp, "");
        }

        if(questions != null){
            return questions;
        }            
        else    
            return null;                
    }      
}
