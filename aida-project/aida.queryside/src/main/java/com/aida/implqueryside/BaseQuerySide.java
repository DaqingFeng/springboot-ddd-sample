package com.aida.implqueryside;

import com.ctrip.platform.dal.common.enums.DatabaseCategory;
import com.ctrip.platform.dal.dao.DalQueryDao;
import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created by fengdaqing on 2017/12/29.
 */
public class BaseQuerySide {
    public static final String DATA_BASE = "AIDA";
    public  static  final DatabaseCategory  dbCategory=DatabaseCategory.MySql;
    public DalQueryDao queryDao = new DalQueryDao(DATA_BASE);
}
