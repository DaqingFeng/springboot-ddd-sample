package com.aida.web.common.apicontroller;


import com.aida.domain.UserAggregate;
import com.aida.dto.user.UerInfoResponse;
import com.aida.dto.user.UserInfoRequest;
import com.aida.dto.user.UserSaveRequest;

import com.aida.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/RestHelloWorld")
public class RestHelloWorld {


    @RequestMapping(value = "/GetHelloWorld", method = RequestMethod.GET)
    public Boolean GetHelloWorld(@RequestParam String name) {
        UserSaveRequest dto = new UserSaveRequest();
        dto.setUserName(name);
        return UserAggregate.GetInstnace().AddUser(dto);
    }

    @RequestMapping(value = "/GetUserInfo", method = RequestMethod.POST)
    @ResponseBody
    public List<UerInfoResponse> GetUserInfo(@RequestBody UserInfoRequest req)
    {
        return UserAggregate.GetInstnace().QueryUserInfo(req);
    }
   @RequestMapping(value = "UpdateUserInfo",method =RequestMethod.POST)
   @ResponseBody
   public Boolean UpdateUserInfo(@RequestBody UserSaveRequest req)
   {
     return   UserAggregate.GetInstnace().UpdateUserInfo(req );
   }

    @RequestMapping(value = "/GetHelloWorldTXT", method = RequestMethod.GET)
    public String GetHelloWorldTXT(@RequestParam String name) {
        return String.format("Hello World %s", name);
    }
}
