package com.cucumber.framework.configuration.browser;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.cucumber.framework.utility.ResourceHelper;

public class FirefoxBrowser {
	public Capabilities getfirefoxCapabalities()
	{
		FirefoxProfile option = new FirefoxProfile();
		DesiredCapabilities firefox =DesiredCapabilities.firefox();
		option.setAcceptUntrustedCertificates(true);
		option.setAssumeUntrustedCertificateIssuer(true);
		firefox.setCapability(FirefoxDriver.PROFILE, option);
		return firefox;
	}
	public WebDriver getfirefoxDriver(Capabilities cap)
	{
		System.setProperty("webdriver.gecko.driver", ResourceHelper.getResourcePath("/src/main/resources/driver/chromedriver.exe"));
		return new FirefoxDriver(cap);
	}

}
