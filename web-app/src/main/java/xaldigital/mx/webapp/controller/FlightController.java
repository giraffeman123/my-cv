package xaldigital.mx.webapp.controller;

import java.io.FileNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import xaldigital.mx.webapp.service.ServiceLocator;
import xaldigital.mx.webapp.service.entity.Airline;
import xaldigital.mx.webapp.service.entity.Airport;
import xaldigital.mx.webapp.service.entity.Day;


@Controller
public class FlightController {

    @Autowired
    private ServiceLocator serviceLocator;

    @GetMapping("/home/flights")
    public String flights(Model model, HttpServletRequest request) throws FileNotFoundException  {        
        List<Airport> airportsWithMostMovement = serviceLocator.getInstanceXalDigitalDao().getAirportWithMostMovement(request, 2021);
        List<Airline> airlinesWithMostFlights = serviceLocator.getInstanceXalDigitalDao().getAirlineWithMostFlights(request, 2021);
        List<Day> daysWithMostFlights = serviceLocator.getInstanceXalDigitalDao().getDayWithMostFlights(request, 2021);
        List<Airline> airlinesWithMoreThan2Flights = serviceLocator.getInstanceXalDigitalDao().getAirlinesWithMoreThan2Flights(request);

        model.addAttribute("AirportsWithMostMovement", airportsWithMostMovement);
        model.addAttribute("AirlinesWithMostFlights", airlinesWithMostFlights);
        model.addAttribute("DaysWithMostFlights", daysWithMostFlights);
        model.addAttribute("AirlinesWithMoreThan2Flights", airlinesWithMoreThan2Flights);                
        return "/flights";
    }          
}