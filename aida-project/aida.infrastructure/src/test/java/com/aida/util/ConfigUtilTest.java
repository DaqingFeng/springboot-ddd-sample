package com.aida.util;

import junit.framework.TestCase;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import com.aida.utils.ConfigUtil;

public class ConfigUtilTest extends TestCase {

	public void testFindAsResource() throws IOException {
		URL url = ConfigUtil.findAsResource("log4j.properties");
		System.out.println(url);

		url = ConfigUtil.findAsResource("0opslab-default.properties");
		System.out.println(url);

		url = ConfigUtil.findAsResource("ali.gif");
		System.out.println(url);

		Properties property = ConfigUtil.getConfigProperties("application.properties");

		String strproperty = property.getProperty("title");
		System.out.print(strproperty);
	}

	public void testResourcePath() {
		System.out.println(ConfigUtil.resourcePath(""));
		System.out.println(ConfigUtil.resourcePath("log4j.properties"));
	}

}