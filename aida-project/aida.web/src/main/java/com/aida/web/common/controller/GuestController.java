package com.aida.web.common.controller;

 
 
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

 
@Controller
@RequestMapping("/Guest/*")
public class GuestController  {
	  
 
	@RequestMapping(value="/Fruit", method=RequestMethod.GET)
	public void Fruit(Model model) throws IOException
	{
		model.addAttribute("foo","grace");
		model.addAttribute("fruit", "苹果");
		model.addAttribute("config", "xxx");
	}
	
	@RequestMapping(value="/Beef", method=RequestMethod.GET)
	public void Beef(Model model)
	{
		model.addAttribute("foo","grace");
		model.addAttribute("fruit", "apple");
		model.addAttribute("config", "apple");
	}
}
