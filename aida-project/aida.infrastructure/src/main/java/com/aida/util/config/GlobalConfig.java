package com.aida.util.config;

import com.aida.utils.ConfigUtil;

import java.io.IOException;
import java.util.Properties;

public class GlobalConfig {

    private static GlobalConfig global = new GlobalConfig();

    /**
     * 当前对象实例
     */
    public static GlobalConfig Instance() {
        return global;
    }

    public static Properties projectProperties = null;

    private static Properties getProperties() throws IOException {
        if (projectProperties == null) {
            projectProperties = ConfigUtil.getConfigProperties("aidaproject.properties");
        }
        return projectProperties;
    }

    public static String GetTitle() throws IOException {
        return getProperties().getProperty("Title");
    }

}
