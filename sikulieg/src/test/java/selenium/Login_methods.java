package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_methods extends FirstPage{
	
	public void launchBro()
	{
		driver= new FirefoxDriver();
	}
	
	public void getURL(String url)
	{
		driver.get(url);
	}
	

}
