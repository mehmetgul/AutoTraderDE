package com.autotrader.searchSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MyStepdefs {
	Logger slf4jlogger = LoggerFactory.getLogger(MyStepdefs.class);

	@Given("User is in landing page")
	public void userIsInLandingPage() {

		/**
		 * TODO To use logger in your project. add 2 dependency
		 * slf4j-api and logback-classic dependencies
		 * you can see the type of log details below
		 */
		String title = "This is the title for home page";
		slf4jlogger.info("We landed to Homepage {}",title);
		slf4jlogger.info("Another way of log  " +title);
		slf4jlogger.info("This is without parameter.");
		slf4jlogger.warn("We are warning");
		slf4jlogger.error("This is error");
		slf4jlogger.debug("This is error");


	}

	@Then("Verify that {string} is present")
	public void verifyThatIsPresent(String arg0) {

	}

	@And("Verify that search Button is present")
	public void verifyThatSearchButtonIsPresent() {

	}

	@Then("Verify that {string} and {string}")
	public void verifyThatAnd(String arg0, String arg1) {

	}
}
