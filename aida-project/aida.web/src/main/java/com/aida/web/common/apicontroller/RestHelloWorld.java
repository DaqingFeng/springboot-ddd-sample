package com.aida.web.common.apicontroller;

 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aida.domain.UserAggregate;
import com.aida.dto.user.UserSaveRequest;

 

@RestController
@RequestMapping("/api/RestHelloWorld")
public class RestHelloWorld {
  
 
	@RequestMapping(value="/GetHelloWorld",method=RequestMethod.GET)
	public Boolean GetHelloWorld(@RequestParam String name)
	{
		UserSaveRequest dto=new UserSaveRequest();
		dto.setUserName(name);
		return UserAggregate.GetInstnace().AddUser(dto);
	}
	
	@RequestMapping(value="/GetHelloWorldTXT",method=RequestMethod.GET)
	public String GetHelloWorldTXT(@RequestParam String name)
	{
		return String.format("Hello World %s", name);
	}
}
