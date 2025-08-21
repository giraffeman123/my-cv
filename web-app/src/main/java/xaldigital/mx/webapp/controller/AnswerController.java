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
import xaldigital.mx.webapp.service.entity.OldestAndNewestAnswer;
import xaldigital.mx.webapp.service.entity.Question;
import xaldigital.mx.webapp.service.entity.TotalQuestions;


@Controller
public class AnswerController {

    @Autowired
    private ServiceLocator serviceLocator;

    @GetMapping("/home/answers")
    public String answers(Model model, HttpServletRequest request) throws FileNotFoundException  {        
        TotalQuestions totalQuestions = serviceLocator.getInstanceXalDigitalDao().getNumberOfAnsweredAndUnansweredQuestions(request);
        Question questionWithBetterReputation = serviceLocator.getInstanceXalDigitalDao().getAnswerWithBetterReputation(request);
        Question questionWithLessAmountVisits = serviceLocator.getInstanceXalDigitalDao().getAnswerWithLessAmountOfVisits(request);
        OldestAndNewestAnswer oldestAndNewestQuestion = serviceLocator.getInstanceXalDigitalDao().getOldestAndNewestAnswer(request);
        List<Question> questions2To5 = serviceLocator.getInstanceXalDigitalDao().get2To5AnswerList(request);

        model.addAttribute("TotalQuestions", totalQuestions);
        model.addAttribute("QuestionWithBetterReputation", questionWithBetterReputation);
        model.addAttribute("QuestionWithLessAmountVisits", questionWithLessAmountVisits);
        model.addAttribute("OldestAndNewestQuestion", oldestAndNewestQuestion);
        model.addAttribute("Questions2To5", questions2To5);
        return "/answers";
    }        

}