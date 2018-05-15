package com.aida.dao;

import com.aida.entity.User;
import com.ctrip.platform.dal.dao.DalHints;
import com.ctrip.platform.dal.dao.StatementParameters;

import java.sql.SQLException;
import java.sql.Types;

/**
 * Created by fengdaqing on 2018/1/23.
 */
public class UserDaoExt extends UserDao    {

    private  final  String updateSql="UPDATE tb_user SET UserName=? WHERE UserID=?";

    public UserDaoExt() throws SQLException {
    }

    public  Integer UpdateUserInfo(User updated)
    {
        Integer result = 0;
        try {
            StatementParameters parameters = new StatementParameters();
            int i = 1;
            parameters.set(i++, "UserName", Types.VARCHAR, updated.getUserName());
            parameters.set(i++, "UserID", Types.VARCHAR, updated.getUserID());
            DalHints hints = DalHints.createIfAbsent(null);
            result = client.update(updateSql, parameters, hints);
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        return result;
    }
}
