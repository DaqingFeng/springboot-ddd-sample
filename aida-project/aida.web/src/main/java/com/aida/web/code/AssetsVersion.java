package com.aida.web.code;

import com.aida.util.config.GlobalConfig;

/**
 * Created by fengdaqing on 2018/5/15.
 */
public class AssetsVersion {

    public static String GetCurrentVersion() {
        String version = "1.0";
        try {
            version = GlobalConfig.GetValue("custom-assets-version");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return version;
    }
}
