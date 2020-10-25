package com.autotrader.searchSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MyStepdefs {
	@Given("User is in landing page")
	public void userIsInLandingPage() {
		System.out.println("1");
	}

	@Then("Verify that {string} is present")
	public void verifyThatIsPresent(String arg0) {
		System.out.println("2");
	}

	@And("Verify that search Button is present")
	public void verifyThatSearchButtonIsPresent() {
		System.out.println("3");
	}

	@Then("Verify that {string} and {string}")
	public void verifyThatAnd(String arg0, String arg1) {
		System.out.println("4");
	}
}
