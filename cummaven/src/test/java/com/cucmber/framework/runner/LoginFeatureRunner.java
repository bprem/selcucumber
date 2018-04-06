package com.cucmber.framework.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"classpath:feature/facebooklogin.feature"},glue= {
		"classpath:com.cucmber.framework.stepdefinition",
		"classpath:com.cucumber.framework.helper"},plugin= {"pretty",
				"json:target/facebookfeaturerunner.json"
				
		})
public class LoginFeatureRunner extends AbstractTestNGCucumberTests
{

}
