package com.aida.dto.user;

 
 

public class UserSaveRequest  {

	private String userName;

	private String password;

 
	private Integer sex;

	 
	private Integer age;
 
	 
	private byte[] enable;
 
 
	private String remark;


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


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}
}
