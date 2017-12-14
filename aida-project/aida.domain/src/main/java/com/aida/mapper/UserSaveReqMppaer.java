package com.aida.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.aida.dto.user.UserSaveRequest;
import com.aida.entity.User;

@Mapper 
public interface UserSaveReqMppaer {

	UserSaveReqMppaer INSTANCE = Mappers.getMapper(UserSaveReqMppaer.class);
	 
	User sourceToDestination(UserSaveRequest source);
	 
}
