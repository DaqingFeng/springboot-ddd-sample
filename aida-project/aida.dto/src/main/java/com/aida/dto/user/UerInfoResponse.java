package com.aida.dto.user;

import com.aida.dto.basic.BaseQueryResponse;
import com.ctrip.platform.dal.dao.annotation.Type;

import javax.persistence.Column;
import java.sql.Timestamp;
import java.sql.Types;

/**
 * Created by fengdaqing on 2017/12/28.
 */
public class UerInfoResponse extends BaseQueryResponse {

    private String uID;

    private String userID;

    @Column(name="PassWord")
    @Type(value=Types.VARCHAR)
    private String password;


    private Integer sex;


    private Integer age;


    private String mobile;


    private Timestamp birthDay;


    private Timestamp hireDate;


    private String roleIDs;

    @Column(name="UserName")
    @Type(value=Types.VARCHAR)
    private String userName;

    private byte[] enable;

    private Timestamp creationTime;

    private String creationUserID;

    private String remark;

    public String getUID() {
        return uID;
    }

    public void setUID(String uID) {
        this.uID = uID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Timestamp getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Timestamp birthDay) {
        this.birthDay = birthDay;
    }

    public Timestamp getHireDate() {
        return hireDate;
    }

    public void setHireDate(Timestamp hireDate) {
        this.hireDate = hireDate;
    }

    public String getRoleIDs() {
        return roleIDs;
    }

    public void setRoleIDs(String roleIDs) {
        this.roleIDs = roleIDs;
    }

    public byte[] getEnable() {
        return enable;
    }

    public void setEnable(byte[] enable) {
        this.enable = enable;
    }

    public Timestamp getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Timestamp creationTime) {
        this.creationTime = creationTime;
    }

    public String getCreationUserID() {
        return creationUserID;
    }

    public void setCreationUserID(String creationUserID) {
        this.creationUserID = creationUserID;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
