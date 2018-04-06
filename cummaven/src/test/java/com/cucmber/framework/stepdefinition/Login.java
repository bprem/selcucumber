package com.cucmber.framework.stepdefinition;

import org.openqa.selenium.By;

import com.cucumber.framework.helper.TestBase.TestBase;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	@Given("^user navigate to facebook\\.com$")
	public void user_navigate_to_facebook_com() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		TestBase.driver.get("https://www.facebook.com/");
	   
	}

	@When("^user enter username as \"([^\"]*)\" and pwd as \"([^\"]*)\"$")
	public void user_enter_username_as_and_pwd_as(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		TestBase.driver.findElement(By.xpath("//*[@id='email']")).sendKeys(arg1);
		TestBase.driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(arg2);
	    
	}

	@When("^some other action$")
	public void some_other_action() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//	TestBase.driver.findElement(By.id("loginbutton")).click();
		TestBase.driver.findElement(By.id("u_0_j")).sendKeys("234");
	   
	}

	@Then("^Login should successfull$")
	public void login_should_successfull() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		TestBase.driver.findElement(By.id("u_0_h")).sendKeys("123");
	  
	}


}
