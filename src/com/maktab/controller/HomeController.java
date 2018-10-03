package com.maktab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/person")
public class HomeController {

    @RequestMapping(path = "/test")
    public ModelAndView homeMethod() {
        System.out.println("Test Controller");
        return new ModelAndView("index");
    }
}
