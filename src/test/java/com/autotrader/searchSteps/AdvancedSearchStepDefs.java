package com.autotrader.searchSteps;
import com.autotrader.searchPages.AdvancedSearchPage;
import com.autotrader.utilities.BrowserUtilities;
import com.autotrader.utils.MyDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdvancedSearchStepDefs {
    AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage();

    public AdvancedSearchStepDefs() {
    }

    @When("the user clicks on {string} button")
    public void theUserClicksOnButton(String arg0) {
        MyDriver.get().manage().deleteAllCookies();
        //Just because of the problem with Advanced Search following line is commented out!
        //this.advancedSearchPage.advancedSearch.click();
    }

    @And("enters {int} in the Zip Code text box")
    public void entersInTheZipCodeTextBox(int zipcode) {
        MyDriver.get().manage().deleteAllCookies();
        this.advancedSearchPage.zipCode.sendKeys(new CharSequence[]{String.valueOf(zipcode)});
    }

    @And("selects the {string} check box under {string}")
    public void selectsTheCheckBoxUnder(String arg0, String box) {
        MyDriver.get().manage().deleteAllCookies();
        BrowserUtilities.scrollToElement(this.advancedSearchPage.selectCheckBox(arg0));
        this.advancedSearchPage.selectCheckBox(arg0).click();
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
