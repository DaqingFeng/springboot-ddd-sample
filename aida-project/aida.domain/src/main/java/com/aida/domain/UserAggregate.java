package com.aida.domain;

import java.sql.SQLException;

 
import org.mapstruct.Mappings;
 

import com.aida.dao.UserDao;
import com.aida.dto.user.UserSaveRequest;
import com.aida.entity.User;
 
import com.aida.utils.StringUtil;

public class UserAggregate {

	private static UserAggregate useraggreate = new UserAggregate();

	private UserDao userDaoInstance ;
 
	 
	public static UserAggregate GetInstnace() {
		return useraggreate;
	}

	public Boolean AddUser(UserSaveRequest req) {
		Boolean result = false;
		try {
			User userEntity=new User();
			if (!StringUtil.isEmpty(req.getUserName())) {
				userEntity.setUserName(req.getUserName());
				userDaoInstance=new UserDao();
				userDaoInstance.insert(userEntity);
			}
		} catch (SQLException ex) {

		}
		return result;
	}
}
