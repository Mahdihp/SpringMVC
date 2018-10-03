package com.maktab.controller;

import com.maktab.model.Person;
import com.maktab.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/persons")
public class HomeController {


    private final PersonService personService;

    @Autowired
    public HomeController(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping(path = "/add-person")
//    public String addPerson(@ModelAttribute Person(name ="person" person) {
    public String addPerson(@ModelAttribute Person person) {
        person.setId(1L);
        System.out.println(person);
       personService.save(person);
        return "index";
    }

    @RequestMapping(path = "/show-person")
    public String showForm(Model model) {

        model.addAttribute("person",new Person());
        return "show-person";
    }

    @RequestMapping(path = "/")
    public ModelAndView homeMethod() {
        return new ModelAndView("index");
    }
}
