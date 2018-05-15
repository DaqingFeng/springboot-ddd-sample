package com.aida.we.iquerySide;

import com.aida.dto.user.UerInfoResponse;
import com.aida.dto.user.UserInfoRequest;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by fengdaqing on 2017/12/28.
 */
public interface IUserQuerySide {
  List<UerInfoResponse> getUserInfo(UserInfoRequest request) throws SQLException;
}
