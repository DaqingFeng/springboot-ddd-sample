package com.aida.util.ftp;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

import com.aida.utils.OpslabConfig;

/**
 * FTP工具类
 */
public class FTPFactory {


    //获取一个实例
    public static FTPUtil getInstance(String Name) throws IOException {

        String host = OpslabConfig.get(Name + ".host");
        if (host != null) {
            int port = Integer.parseInt(OpslabConfig.get(Name + ".port"));
            String username = OpslabConfig.get(Name + ".username");
            String password = OpslabConfig.get(Name + ".password");
            String remoteDir = OpslabConfig.get(Name + ".remoteDir");
            String localDir = OpslabConfig.get(Name + ".localDir");
            String Encoding = OpslabConfig.get(Name + ".Encoding");
            boolean passiveMode = new Boolean(OpslabConfig.get(Name + ".passiveMode")).booleanValue();
            FTPVo vo = new FTPVo(host, port, username, password, remoteDir, localDir, Encoding, passiveMode);
            return new FTPUtilImpl(vo);
        } else {
            throw new IOException("config error");
        }
    }
}
