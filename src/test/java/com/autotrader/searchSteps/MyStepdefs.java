package com.autotrader.searchSteps;

import com.autotrader.searchPages.BrowseByMakePage;
import com.autotrader.utils.ConfigurationReader;
import com.autotrader.utils.MyDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class MyStepdefs {

	BrowseByMakePage byMakePage=new BrowseByMakePage();


	@Given("User is in landing page")
	public void userIsInLandingPage() {
		MyDriver.get().get(ConfigurationReader.getProperty("url"));
	}

	@Then("Verify that {string} is present")
	public void verifyThatIsPresent(String arg0) {
		ifneededRefreshPage();
		Assert.assertTrue(new BrowseByMakePage().browseBy(arg0).isDisplayed());
	}

	@And("Verify that search Button is present")
	public void verifyThatSearchButtonIsPresent() {
		ifneededRefreshPage();
		Assert.assertTrue(new BrowseByMakePage().browseBy("Search").isDisplayed());
	}

	@Then("Verify that {string} and {string}")
	public void verifyThatAnd(String arg0, String arg1) {
		ifneededRefreshPage();
		Assert.assertTrue(new BrowseByMakePage().modelMakeElement(arg0).isDisplayed());
		ifneededRefreshPage();
		Assert.assertTrue(new BrowseByMakePage().modelMakeElement(arg1).isDisplayed());
	}


	public void ifneededRefreshPage(){
		if(byMakePage.navbar_default.isDisplayed()) {
			MyDriver.get().navigate().back();
			MyDriver.get().navigate().forward();
		}

	}

	@Then("Verify that {string} button is present")
	public void verifyThatButtonIsPresent(String arg0) {
		ifneededRefreshPage();
		Assert.assertTrue(new BrowseByMakePage().advancedSearch.isDisplayed());
	}
}
