package com.aida.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.ctrip.platform.dal.dao.annotation.Database;
import com.ctrip.platform.dal.dao.annotation.Sensitive;
import com.ctrip.platform.dal.dao.annotation.Type;
import java.sql.Types;
import java.sql.Timestamp;

import com.ctrip.platform.dal.dao.DalPojo;

@Entity
@Database(name="AIDA Project")
@Table(name="tb_user")
public class User implements DalPojo {

	@Id
	@Column(name="UID")
	@Type(value=Types.VARCHAR)
	private String uID;

	@Column(name="UserID")
	@Type(value=Types.VARCHAR)
	private String userID;

	@Column(name="UserName")
	@Type(value=Types.VARCHAR)
	private String userName;

	@Column(name="Password")
	@Type(value=Types.VARCHAR)
	private String password;

	@Column(name="Sex")
	@Type(value=Types.INTEGER)
	private Integer sex;

	@Column(name="Age")
	@Type(value=Types.INTEGER)
	private Integer age;

	@Column(name="Mobile")
	@Type(value=Types.VARCHAR)
	private String mobile;

	@Column(name="BirthDay")
	@Type(value=Types.TIMESTAMP)
	private Timestamp birthDay;

	@Column(name="HireDate")
	@Type(value=Types.TIMESTAMP)
	private Timestamp hireDate;

	@Column(name="RoleIDs")
	@Type(value=Types.VARCHAR)
	private String roleIDs;

	@Column(name="Enable")
	@Type(value=Types.BIT)
	private byte[] enable;

	@Column(name="CreationTime")
	@Type(value=Types.TIMESTAMP)
	private Timestamp creationTime;

	@Column(name="CreationUserID")
	@Type(value=Types.VARCHAR)
	private String creationUserID;

	@Column(name="Remark")
	@Type(value=Types.VARCHAR)
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