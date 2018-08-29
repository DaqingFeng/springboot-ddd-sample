package com.aida.we.implquerySide;

import com.aida.dto.user.UerInfoResponse;
import com.aida.dto.user.UserInfoRequest;
import com.aida.we.iquerySide.IUserQuerySide;
import com.ctrip.platform.dal.dao.*;
import com.ctrip.platform.dal.dao.helper.DalDefaultJpaMapper;
import com.ctrip.platform.dal.dao.sqlbuilder.FreeSelectSqlBuilder;

import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

/**
 * Created by fengdaqing on 2017/12/28.
 */
public class UserQuerySide extends BaseQuerySide implements IUserQuerySide {

    private final String getUserInfoScript = "SELECT * FROM tb_user where UserName=? ";

    private static UserQuerySide queryside = null;
    private static final Object locks = new Object();

    public static UserQuerySide Instance() {
        if (queryside == null) {
            synchronized (locks) {
                if (queryside == null) {
                    queryside = new UserQuerySide();
                }
            }
        }
        return queryside;
    }

    public List<UerInfoResponse> getUserInfo(UserInfoRequest request)   {
        List<UerInfoResponse> response=null;
        try {
            FreeSelectSqlBuilder<List<UerInfoResponse>> builder = new FreeSelectSqlBuilder<>(dbCategory);
            builder.setTemplate(getUserInfoScript);

            int i = 1;
            StatementParameters paramater = new StatementParameters();
            paramater.set(i++, "UserName", Types.VARCHAR, request.getUserName());
            DalHints hints = DalHints.createIfAbsent(null).allowPartial();

            DalRowMapper<UerInfoResponse> userinfoRowMapper = new DalDefaultJpaMapper<>(UerInfoResponse.class);
            builder.mapWith(userinfoRowMapper);

            response= queryDao.query(builder, paramater, hints);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return  response;
    }

}
