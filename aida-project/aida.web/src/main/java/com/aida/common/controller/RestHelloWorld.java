package com.aida.common.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/RestHelloWorld")
public class RestHelloWorld {
  
	@RequestMapping(value="/GetHelloWorld",method=RequestMethod.GET)
	public String GetHelloWorld(@RequestParam String name )
	{
		return String.format("Hello word %s",name);
	}
}
