package com.aida.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by fengdaqing on 2018/5/15.
 */
@Controller
public class HomeController {
    @RequestMapping({"/"})
    public String Index() {
        return "Home/index";
    }
}
