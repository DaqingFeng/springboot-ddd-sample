package com.aida.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fengdaqing on 2018/5/7.
 */
@Controller
@RequestMapping(value = "Employee")
public class EmployeeController {

    @GetMapping({"/", "/index"})
    public String FreeMk(Model model, @RequestParam(value = "name", required = false) String name) {
        List<String> employess = new ArrayList<>();
        employess.add("Andy");
        employess.add("Jimy");
        employess.add("Anna");
        model.addAttribute("name", name);
        model.addAttribute("Infos", employess);
        return "Employee/index";
    }
}
