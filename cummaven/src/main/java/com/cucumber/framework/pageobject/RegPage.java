package com.cucumber.framework.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

import com.cucumber.framework.configreader.ObjectRepo;
import com.cucumber.framework.helper.Dropdown.DropdownHelper;
import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.WaitHelper.WaitHelper;

public class RegPage {
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(RegPage.class);
	WaitHelper waitHelper;
	DropdownHelper dropdwn;
	@FindBy(xpath = "//*[@id='menu-item-374']")
	WebElement RegButton;

	@FindBy(xpath = ".//*[@id='name_3_firstname']")
	WebElement FirstName;

	@FindBy(xpath = "//*[@id='name_3_lastname']")
	WebElement lastName;

	@FindBy(xpath = "//*[@id='username']")
	WebElement username;

	@FindBy(xpath = "//*[@id='email_1']")
	WebElement emailAddress;

	@FindBy(xpath = "//*[@id='profile_pic_10']")
	WebElement profilePic;

	@FindBy(xpath = "//*[@id='mm_date_8']")
	WebElement month;

	@FindBy(xpath = "//*[@id='dd_date_8']")
	WebElement days;

	@FindBy(xpath = "//*[@id='yy_date_8']")
	WebElement year;
	@FindBy(xpath = "//*[@id='dropdown_7']")
	WebElement country;

	@FindBy(xpath = "//*[@id='description']")
	WebElement description;

	@FindBy(xpath = "//*[@id='password_2']")
	WebElement password;

	@FindBy(xpath = "//*[@id='confirm_password_password_2']")
	WebElement confirmPassword;


	@FindBy(xpath = "//*[@id='phone_9']")
	WebElement mobilePhone;


	@FindBy(xpath = "//*[@name='pie_submit']")
WebElement SubmitButn;
	
	public RegPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void clickRegBtn() {
		log.info("Click on reg" );
		this.RegButton.click();
		waitHelper = new WaitHelper(driver);
		waitHelper.waitForElement(driver, FirstName, ObjectRepo.reader.getExplicitWait());
	}
	public void setYourFirstName(String yourFirstName) {
		log.info("entering yourAddressFirstName.." + yourFirstName);
		this.FirstName.sendKeys(yourFirstName);
	}

	public void setYourLastName(String yourLastName) {
		log.info("entering yourAddressLastName.." + yourLastName);
		this.lastName.sendKeys(yourLastName);
	}

	public void setYourUserName(String setYourUserName) {
		log.info("entering yourAddressCompany.." + setYourUserName);
		this.username.sendKeys(setYourUserName);
}
	public void setEmailAddress(String emailAddress) {
		log.info("entering emailAddress.." + emailAddress);
		this.emailAddress.sendKeys(emailAddress);
	}

	
	public void setAdditionalInformation(String additionalInformation) {
		log.info("entering additionalInformation.." + additionalInformation);
		this.description.sendKeys(additionalInformation);
	}

	public void setHomePhone(String homePhone) {
		log.info("entering homePhone.." + homePhone);
		this.mobilePhone.sendKeys(homePhone);
	}

	public void setpasswrd(String pwd) {
		log.info("entering mobilePhone.." + pwd);
		this.password.sendKeys(pwd);
	}

	public void setconfirmpasswrd(String confirmpwd) {
		log.info("entering addressAlias.." + confirmpwd);
		this.confirmPassword.sendKeys(confirmpwd);
}
	public void clickRegistration() {
		log.info("clicked on registration.." + SubmitButn);
		this.SubmitButn.click();
}
	public void setDate(String date)
	{
		dropdwn = new DropdownHelper(driver);
		dropdwn.SelectUsingVisibleValue(days, date);
	}
	public void setMonth(String mon)
	{
		dropdwn = new DropdownHelper(driver);
		dropdwn.SelectUsingVisibleValue(month, mon);
	}
	public void setYear(String yr)
	{
		dropdwn = new DropdownHelper(driver);
		dropdwn.SelectUsingVisibleValue(year, yr);
	}

}
