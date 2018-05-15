package com.aida.util.config;

import com.aida.utils.ConfigUtil;

import java.io.IOException;
import java.util.Properties;

public class GlobalConfig {

    public static Properties projectProperties = null;

    private static Properties getProperties() throws IOException {
        if (projectProperties == null) {
            projectProperties = ConfigUtil.getConfigProperties("application.properties");
        }
        return projectProperties;
    }

    public static String GetValue(String prefix) throws IOException {
        return getProperties().getProperty(prefix);
    }
}
