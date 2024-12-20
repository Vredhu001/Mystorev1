package com.mystore.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties properties;
	//String path = "\\Users\\HP\\Desktop\\Automation\\mystorev1\\src\\com\\mystore\\utilities\\ReadConfig.java";
	String path = "C:\\Users\\HP\\Desktop\\Automation\\mystorev1\\Configuration\\config.properties";
	
	public ReadConfig() {
		 properties = new Properties();
		try {
		
			FileInputStream fis = new FileInputStream(path);
			properties.load(fis);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public String getBaseUrl()
	{
		String value = properties.getProperty("baseUrl");
		
			return value;
		
	}
	
	public String getBrowser()
	{
		String value = properties.getProperty("browser");
			return value;
	}
	
	public String getUserName() {
		
		String value = properties.getProperty("username");
		return value;
		
	}
 
public String getUserPassword() {
		
		String value = properties.getProperty("password");
		return value;
		
	}
	
	
	
}
