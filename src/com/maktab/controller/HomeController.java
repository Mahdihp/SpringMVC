package com.maktab.controller;

import com.maktab.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/person")
public class HomeController {


    private final PersonService personService;

    @Autowired
    public HomeController(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping(path = "/show")
    public ModelAndView showForm() {
        return new ModelAndView("show-person");
    }

    @RequestMapping(path = "/")
    public ModelAndView homeMethod() {
        return new ModelAndView("index");
    }
}
