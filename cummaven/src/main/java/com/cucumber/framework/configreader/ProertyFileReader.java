package com.cucumber.framework.configreader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Level;

import com.cucumber.framework.configuration.browser.BrowserType;
import com.cucumber.framework.utility.ResourceHelper;

public class ProertyFileReader implements ConfigReader {
	private Properties prop =null;
	
	public ProertyFileReader() throws FileNotFoundException, IOException
	{
		prop= new Properties();
		prop.load(ResourceHelper.getResourcePathInputStream("/src/main/resources/configfile/config.properties"));
	}
	
	public String getUsername()
	{
		return prop.getProperty("username");
	}
	public String getpassword()
	{
		return prop.getProperty("password");
	}
	public String getWebSite()
	{
		return prop.getProperty("website");
	}
	public int getPageLoadTimeOut()
	{
		return Integer.parseInt(prop.getProperty("PageLoadTimeOut"));
	}
	public int getImplicitWait()
	{
		return Integer.parseInt(prop.getProperty("ImpliciWait"));
	}
	public int getExplicitWait()
	{
		return Integer.parseInt(prop.getProperty("ExplicitWait"));
	}
	public BrowserType getBrowser()
	{
		return BrowserType.valueOf(prop.getProperty("Browser"));
	}
	public Level getLoggerLevel()
	{
		switch(prop.getProperty("Logger.level"))
		{
		case "DEBUG":
		return Level.DEBUG;
		case "INFO":
		return Level.INFO;
		case "WARN":
			return Level.WARN;
		case "ERROR":
			return Level.ERROR;
		case "FATAL":
			return Level.FATAL;
		
		}
		return Level.ALL;
	}
	

}
