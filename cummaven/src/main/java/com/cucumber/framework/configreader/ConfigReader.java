package com.cucumber.framework.configreader;

import org.apache.log4j.Level;

import com.cucumber.framework.configuration.browser.BrowserType;

public interface ConfigReader {
	public String getUsername();
	public String getpassword();
	public String getWebSite();
	public int getPageLoadTimeOut();
	public int getImplicitWait();
	public int getExplicitWait();
	public Level getLoggerLevel();
	public BrowserType getBrowser();

}
