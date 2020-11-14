package com.autotrader.searchSteps;

import com.autotrader.seachPages.AdvancePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdvanceSearchSteps {
	//Logger objecti olusturuyoruz.
	Logger logger = LoggerFactory.getLogger(AdvanceSearchSteps.class);
	AdvancePage advancePage = new AdvancePage();

	@Given("User click Advance Search link on the home page")
	public void userClickAdvanceSearchlinkOnTheHomePage() {
		//advancePage.verifyAdvanceSearch();
		logger.info("Entering Advance Search Page");

	}

	@Then("User enter {string} in the zip code text box")
	public void user_enter_in_the_zip_code_text_box(String zipCode) {
		advancePage.veryZipCode(zipCode);

	}

	@Then("User select {string} check box under {string}")
	public void user_select_check_box_under(String str, String str1) {
		 advancePage.checkCertifiedAndConvertableOption(str);



	}


	@Then("user update Year {string} to {string}")
	public void user_update_Year_to(String fromYear, String toYear) {

		advancePage.selectYears(fromYear,toYear);



	}

	@Then("user select {string} car from Make,Model and Trim section")
	public void user_select_car_from_Make_Model_and_Trim_section(String model) {
		advancePage.selectModel(model);

	}

	@Then("User clicks Search button")
	public void user_clicks_Search_button() {
		advancePage.clickSearchButton();

	}

	@Then("User verifies that he is in result page")
	public void user_verifies_that_he_is_in_result_page() {

	}

	@Then("User verifies that he sees only {string} cars in listing")
	public void user_verifies_that_he_sees_only_cars_in_listing(String string) {

	}

	@Then("Display in console, the number of cars listed in result page")
	public void display_in_console_the_number_of_cars_listed_in_result_page() {

	}


}
