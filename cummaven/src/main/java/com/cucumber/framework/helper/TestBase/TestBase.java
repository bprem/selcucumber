package com.cucumber.framework.helper.TestBase;




import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;

import com.cucumber.framework.configreader.ObjectRepo;
import com.cucumber.framework.configreader.ProertyFileReader;
import com.cucumber.framework.configuration.browser.BrowserType;
import com.cucumber.framework.configuration.browser.ChromeBrowser;
import com.cucumber.framework.configuration.browser.FirefoxBrowser;
import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.utility.DateTimeHelper;
import com.cucumber.framework.utility.ResourceHelper;
import com.google.common.base.Function;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TestBase {
	
	private final Logger log =LoggerHelper.getLogger(TestBase.class);
	public static WebDriver driver;
	
	public void waitForElement(WebElement element,int timeOutInSec)
	{
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSec);
		wait.ignoring(NoSuchElementException.class);
		wait.ignoring(ElementNotVisibleException.class);
		wait.ignoring(StaleElementReferenceException.class);
		wait.pollingEvery(250, TimeUnit.MILLISECONDS);
		wait.until(elementLocated(element));
		
	}

	private Function<WebDriver, Boolean> elementLocated(final WebElement element) {
		return new Function<WebDriver, Boolean>() {

			public Boolean apply(WebDriver driver) {
				log.debug("Waiting for Element : " + element);
				return element.isDisplayed();
			}
		};
}
	public void setUpDriver(BrowserType btype) throws Exception
	{
		ObjectRepo.reader = new ProertyFileReader();
		driver =getBrowserObject(btype);
		log.debug("Initializwebdriver:"+ driver.hashCode());
		driver.manage().timeouts().implicitlyWait(ObjectRepo.reader.getImplicitWait(), TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(ObjectRepo.reader.getPageLoadTimeOut(), TimeUnit.SECONDS);
		
	}
	public WebDriver getBrowserObject(BrowserType btype) throws FileNotFoundException, IOException, Exception
	{
		log.info(btype);
		switch(btype)
		{
		case Chrome:
			ChromeBrowser chrome =ChromeBrowser.class.newInstance();
			return chrome.getChromeDriver(chrome.getChromeCapabalities());
		case Firefox:
			FirefoxBrowser firefox = FirefoxBrowser.class.newInstance();
			return firefox.getfirefoxDriver(firefox.getfirefoxCapabalities());
		default:
			throw new Exception("Driver not found :"+ new ProertyFileReader().getBrowser());
		}
		
	}
	public String takeScreenShot(String name) throws IOException {



		File destDir = new File(ResourceHelper.getResourcePath("screenshots/") + DateTimeHelper.getCurrentDate());
		if (!destDir.exists())
			destDir.mkdir();

		File destPath = new File(destDir.getAbsolutePath() + System.getProperty("file.separator") + name + ".jpg");
		try {
			FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), destPath);
		} catch (IOException e) {
			log.error(e);
			throw e;
		}
		log.info(destPath.getAbsolutePath());
		return destPath.getAbsolutePath();
	}
	public boolean IsElementPresentQuick(By locator) {
		boolean flag = driver.findElements(locator).size() >= 1;
		log.info(flag);
		return flag;
}
	public WebElement getElement(By locator) {
		log.info(locator);
		if (IsElementPresentQuick(locator))
			return driver.findElement(locator);

		try {
			throw new NoSuchElementException("Element Not Found : " + locator);
		} catch (RuntimeException re) {
			log.error(re);
			throw re;
		}
	}
	public WebElement getElementWithNull(By locator) {
		log.info(locator);
		try {
			return driver.findElement(locator);
		} catch (NoSuchElementException e) {
			// Ignore
		}
		return null;
}
	@Before
	public void before() throws Exception
	{
		ObjectRepo.reader = new ProertyFileReader();
		setUpDriver(ObjectRepo.reader.getBrowser());
		log.info(ObjectRepo.reader.getBrowser());
	}
	@After
	public void after()
	{
		driver.quit();
		log.info("end");
	}

}
