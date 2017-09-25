package com.aida.common.controller;

 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

 
@Controller
@RequestMapping("/HelloWorld/*")
public class HelloWorld  {
	@RequestMapping(value="/Fruit", method=RequestMethod.GET)
	public void usingRequestToViewNameTranslator(Model model) {
		model.addAttribute("foo", "bar");
		model.addAttribute("fruit", "apple");
	}
}
