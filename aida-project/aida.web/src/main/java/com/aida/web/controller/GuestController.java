package com.aida.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/Guest")
public class GuestController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String Index() {
        return "Guest/index";
    }

    @RequestMapping(value = "/Fruit", method = RequestMethod.GET)
    public ModelAndView Fruit(Model model) {
        ModelAndView modelView = new ModelAndView("Guest/Fruit");
        modelView.addObject("foo", "grace");
        modelView.addObject("fruit", "苹果");
        modelView.addObject("config", "xxx");
        return modelView;
    }

    @RequestMapping(value = "/Beef", method = RequestMethod.GET)
    public ModelAndView Beef(Model model) {
        ModelAndView modelView = new ModelAndView("Guest/Beef");
        modelView.addObject("foo", "grace");
        modelView.addObject("fruit", "apple");
        modelView.addObject("config", "pineapple");
        return modelView;
    }
}
