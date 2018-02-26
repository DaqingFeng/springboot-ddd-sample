package com.aida.web.common.apicontroller;


import com.aida.domain.UserAggregate;
import com.aida.dto.user.UerInfoResponse;
import com.aida.dto.user.UserInfoRequest;
import com.aida.dto.user.UserSaveRequest;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


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
    public List<UerInfoResponse> GetUserInfo(@RequestBody UserInfoRequest req) {
        return UserAggregate.GetInstnace().QueryUserInfo(req);
    }

    @RequestMapping(value = "UpdateUserInfo", method = RequestMethod.POST)
    @ResponseBody
    public Boolean UpdateUserInfo(@RequestBody UserSaveRequest req) {
        return UserAggregate.GetInstnace().UpdateUserInfo(req);
    }

    @GetMapping("/GetHelloWorldTXT")
    public String GetHelloWorldTXT(@RequestParam String name) {
        return String.format("Hello World %s", name);
    }

    @PostMapping("/UserInfo")
    public List<UerInfoResponse> UserInfo(@RequestBody UserSaveRequest req) {

        List<UerInfoResponse> userList = new ArrayList<>();
        UerInfoResponse resposne = new UerInfoResponse();
        resposne.setUserName("fengdaqing");
        resposne.setAge(10);

        UerInfoResponse resposne1 = new UerInfoResponse();
        resposne1.setUserName("daqing");
        resposne1.setAge(11);

        UerInfoResponse resposne2 = new UerInfoResponse();
        resposne2.setUserName(req.getUserName());
        resposne2.setAge(req.getAge());

        userList.add(resposne);
        userList.add(resposne1);
        userList.add(resposne2);
        Stream<UerInfoResponse> result = userList.stream().filter(item-> item.getAge() == 30);
        boolean isExist=userList.stream().anyMatch(item->item.getAge()==30);
        if (result != null) {
            userList = result.collect(Collectors.toList());
        }
        userList.sort(Comparator.comparingInt(UerInfoResponse::getAge));
        return userList;
    }
}
