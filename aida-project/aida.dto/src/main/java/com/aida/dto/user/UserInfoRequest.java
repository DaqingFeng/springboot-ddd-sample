package com.aida.dto.user;

import com.aida.dto.basic.BaseQueryRequest;

import java.sql.Types;

/**
 * Created by fengdaqing on 2017/12/28.
 */
public class UserInfoRequest extends BaseQueryRequest {

    private String userName;

    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
