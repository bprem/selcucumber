package com.cucmber.framework.stepdefinition;

import org.testng.log4testng.Logger;

import com.cucumber.framework.configuration.browser.BrowserType;
import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.TestBase.TestBase;
import com.cucumber.framework.pageobject.RegPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Regdemoqa {
	private final Logger log = LoggerHelper.getLogger(Regdemoqa.class);
	RegPage reg =new RegPage(TestBase.driver);
	@Given("^navigate to application$")
	public void navigate_to_application() throws Throwable {
		TestBase.driver.get("http://demoqa.com/");
		//TestBase.driver.get();
	}

	@When("^user click on sign in link$")
	public void user_click_on_sign_in_link() throws Throwable {
	 
	   
	}
	@Then("^registration firm open$")
	public void registration_firm_open() throws Throwable {
		 reg.clickRegBtn();
	}
	@Then("^enter first Name \"([^\"]*)\"$")
	public void enter_first_Name(String arg1) throws Throwable {
	reg.setYourFirstName(arg1);
	   
	}

	@Then("^enter last Name \"([^\"]*)\"$")
	public void enter_last_Name(String arg1) throws Throwable {
	   reg.setYourLastName(arg1);
	    
	}
	@Then("^select day \"([^\"]*)\"$")
	public void select_day(String arg1) throws Throwable {
	   reg.setDate(arg1);
	    
	}

	@Then("^select month \"([^\"]*)\"$")
	public void select_month(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   reg.setMonth(arg1);
	}

	@Then("^select year \"([^\"]*)\"$")
	public void select_year(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    reg.setYear(arg1);
	}

	@Then("^enter your Email address \"([^\"]*)\"$")
	public void enter_your_Email_address(String arg1) throws Throwable {
		reg.setEmailAddress(arg1);
	}

	@Then("^enter your address last Name \"([^\"]*)\"$")
	public void enter_your_address_last_Name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   reg.setYourUserName(arg1);
	}

	@Then("^enter your company Name \"([^\"]*)\"$")
	public void enter_your_company_Name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   reg.setAdditionalInformation(arg1);
	}

	@Then("^Select mobile phone nymber \"([^\"]*)\"$")
	public void select_mobile_phone_nymber(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   reg.setHomePhone(arg1);
	}

	@Then("^Assign an address alias \"([^\"]*)\"$")
	public void assign_an_address_alias(String arg1) throws Throwable {
	   reg.setpasswrd(arg1);
	    
	}

	@Then("^click on registration button$")
	public void click_on_registration_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  reg.clickRegistration();
	}

	@Then("^verify Registration success message$")
	public void verify_Registration_success_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}



}
