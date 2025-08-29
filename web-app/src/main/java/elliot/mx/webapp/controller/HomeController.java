package elliot.mx.webapp.controller;

import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.google.gson.Gson;

import elliot.mx.webapp.service.ServiceLocator;
import elliot.mx.webapp.service.entity.MyCV;
import jakarta.servlet.http.HttpServletRequest;


@Controller
public class HomeController {
    
    @Autowired
    private ServiceLocator serviceLocator;

    @GetMapping("/home")
    public String home(Model model, HttpServletRequest request) {        
        return "/home";
    }    

    @GetMapping("/mycv")
    public String mycv(Model model, HttpServletRequest request) throws FileNotFoundException  {        
        MyCV mycv = serviceLocator.getInstanceCVDao().getMyCV(request);

        Gson gson = new Gson();
        model.addAttribute("mycv", mycv);
        model.addAttribute("musicProjects", gson.toJson(mycv.getMusicProjects()));
        model.addAttribute("externalLinks", gson.toJson(mycv.getExternalLinks()));
        model.addAttribute("portfolio", gson.toJson(mycv.getPortfolio()));
        return "/mycv";
    }        
}
