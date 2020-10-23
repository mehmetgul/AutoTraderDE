package com.autotrader.searchSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdvancedSearchStepDefs {

    @When("the user clicks on {string} button")
    public void theUserClicksOnButton(String arg0) {
    }

    @And("enters {int} in the Zip Code text box")
    public void entersInTheZipCodeTextBox(int arg0) {
    }

    @And("selects the {string} check box under {string}")
    public void selectsTheCheckBoxUnder(String arg0, String arg1) {
    }

    @And("selects year {string} {int} {string} {int}")
    public void selectsYear(String arg0, int arg1, String arg2, int arg3) {
    }

    @And("selects {string} under {string} from {string}")
    public void selectsUnderFrom(String arg0, String arg1, String arg2) {
    }

    @And("clicks {string} button")
    public void clicksButton(String arg0) {
    }

    @Then("gets search results")
    public void getsSearchResults() {
    }
}
