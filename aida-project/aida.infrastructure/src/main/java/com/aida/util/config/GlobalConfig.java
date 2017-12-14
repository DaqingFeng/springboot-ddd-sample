package com.aida.util.config;

import java.io.IOException;
import java.util.Properties;

import com.aida.utils.ConfigUtil;

public class GlobalConfig {
  
	private static GlobalConfig global = new GlobalConfig();
	
	private static Properties getProperties() throws IOException
	{
		return ConfigUtil.getConfigProperties("aidaproject.properties");
	}
	
	/**
	 * 当前对象实例
	 */
	public static GlobalConfig Instance()
	{
		return global;
	}
	
    public static String GetTitle() throws IOException{
    	return getProperties().getProperty("Title");
    }
	
}
