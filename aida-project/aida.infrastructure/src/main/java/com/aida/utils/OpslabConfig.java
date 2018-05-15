package com.aida.utils;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by fengdaqing on 2018/2/24.
 */
public class OpslabConfig {

    private static OpslabConfig global = new OpslabConfig();

    public static OpslabConfig Instance() {
        return global;
    }

    public static Properties projectProperties = null;

    private static Properties getProperties() throws IOException {
        if (projectProperties == null) {
            projectProperties = ConfigUtil.getConfigProperties("aidaproject.properties");
        }
        return projectProperties;
    }


    public static String get(String keys) {
        String value= Constant.EMPTY_STRING;
        try {
            Properties properties = getProperties();
            value = properties.getProperty(keys);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return value;
    }
}
