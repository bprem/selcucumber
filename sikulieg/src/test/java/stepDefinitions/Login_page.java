package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import selenium.Login_methods;

public class Login_page {
	Login_methods lo =new Login_methods();
	@Given("I launch Chrome browser")
	public void i_launch_Chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Hi");
	   lo.launchBro();
	}

	@When("I open {string} Homepage")
	public void i_open_Google_Homepage(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("how");
	   lo.getURL(string);
	}

	@Then("I verify that the page displays search text box")
	public void i_verify_that_the_page_displays_search_text_box() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("you");
	}

	@Then("the page displays Google Search button")
	public void the_page_displays_Google_Search_button() {
	    // Write code here that turns the phrase above into concrete actions
	 
	}

	@Then("the page displays Im Feeling Lucky button")
	public void the_page_displays_Im_Feeling_Lucky_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
