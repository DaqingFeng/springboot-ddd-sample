package com.aida.domain;

import java.sql.SQLException;
import java.util.List;


import com.aida.dao.UserDaoExt;
import com.aida.dto.user.UerInfoResponse;
import com.aida.dto.user.UserInfoRequest;
import com.aida.we.implquerySide.UserQuerySide;


import com.aida.dao.UserDao;
import com.aida.dto.user.UserSaveRequest;
import com.aida.entity.User;
 
import com.aida.utils.StringUtil;

public class UserAggregate {

	private static UserAggregate useraggreate = new UserAggregate();

	private UserDao userDaoInstance;

	public static UserAggregate GetInstnace() {
		return useraggreate;
	}

	public Boolean AddUser(UserSaveRequest req) {
		Boolean result = false;
		try {
			User userEntity = new User();
			if (!StringUtil.isEmpty(req.getUserName())) {
				userEntity.setUserID("1111xxxxx");
				userEntity.setUserName(req.getUserName());
				userDaoInstance = new UserDao();
				userDaoInstance.insert(userEntity);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return result;
	}

	public List<UerInfoResponse> QueryUserInfo(UserInfoRequest request) {
		if(StringUtil.isEmpty(request.getUserName())) {
			return  null;
		}
		return UserQuerySide.Instance().getUserInfo(request);
	}

	public  Boolean UpdateUserInfo(UserSaveRequest req)
	{
		boolean result=false;
		try {
			UserDaoExt userDao = new UserDaoExt();
			User updated=new User();
			updated.setUserID(req.getUserId());
			updated.setUserName(req.getUserName());
			result=userDao.UpdateUserInfo(updated)>0;
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
		return  result;
	}
}
