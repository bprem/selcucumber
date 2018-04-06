package com.cucmber.framework.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"classpath:feature/reg.feature"},glue= {
		"classpath:com.cucmber.framework.stepdefinition",
		"classpath:com.cucumber.framework.helper"},plugin= {"html:target/cucumber-html-report"
				
		})
public class RegFeatureRunner extends AbstractTestNGCucumberTests{

}
