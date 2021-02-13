package com.autotrader.seachPages;

import com.autotrader.searchSteps.MyStepdefs;
import com.autotrader.utils.MyDriver;
import io.github.bonigarcia.wdm.SeleniumServerStandaloneManager;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class AdvancePage extends Base {
	Logger logger = LoggerFactory.getLogger(AdvancePage.class);


	/**
	 * Title
	 * Browse By Make
	 * Nrowse by Style
	 * Advanced Search
	 * Dropdown => Make and Model
	 */
	@FindBy(xpath = "//button[contains(text(),'Browse by Make')]")
	public WebElement browseByMake;

	@FindBy(xpath = "//button[contains(text(),'Browse by Style')]")
	public WebElement browseByStyle;

	@FindBy(xpath = "//a[contains(text(),'Advanced Search')]")
	public WebElement advanceSearch;

	@FindBy(xpath = "//button[@id='search']")
	public WebElement searchButton;

	@FindBy(xpath = "//select[@id='makeCode']")
	public WebElement filterByMake;
	@FindBy(xpath = "//select[@id='ModelCode']")
	public WebElement filterByModel;

	@FindBy(xpath = "//input[contains(@name,'zip')]")
	public WebElement zipCode;

	@FindBy(xpath = "//div[contains(text(),'Certified')]")
	public WebElement certified;

	@FindBy(xpath = "//div[contains(text(),'Convertible')]")
	public WebElement convertible;

	@FindBy(xpath = "//select[contains(@name,'startYear')]")
	public WebElement startYear;

	@FindBy(xpath = "//select[contains(@name,'endYear')]")
	public WebElement endYear;

	@FindBy(xpath = "//select[contains(@name,'makeFilter0')]")
	public WebElement anyMakeAdvanceSearch;

	@FindBy(xpath = "//button[contains(text(),'Search')]")
	public WebElement advanceSearchButton;


	public void verification(String expected) {

		if (expected.equalsIgnoreCase(browseByMake.getText())) {
			String actual = browseByMake.getText();
			Assert.assertEquals(expected, actual);
			logger.info("Expected result : {}", expected);
			logger.info("Actual result : {}", actual);


		} else if (expected.equalsIgnoreCase(browseByStyle.getText())) {
			String actual = browseByStyle.getText();
			Assert.assertEquals(expected, actual);
			logger.info("Expected result : {}", expected);
			logger.info("Actual result : {}", actual);

		} else {
			String actual = advanceSearch.getText();
			Assert.assertEquals(expected, actual);
			logger.info("Expected result : {}", expected);
			logger.info("Actual result : {}", actual);

		}

	}

	public void verifySearchButton() {
		Assert.assertTrue(searchButton.isDisplayed() && searchButton.isEnabled());
		logger.info("Search button is visible and enabled ");

	}


	public void verifyMakeAndModel(String make, String model) {
		//By Make is Displayed and Enabled
		Assert.assertTrue(filterByMake.isDisplayed() && filterByMake.isEnabled());
		logger.info("{} is Enabled nad Visible", make);

		//By Model is dependent on Make. By Model is displayed but not enabled.
		Assert.assertTrue(filterByModel.isDisplayed() && !filterByModel.isEnabled());
		logger.info("{} is Enabled nad Visible", model);
	}

	public void verifyAdvanceSearch() {

		MyDriver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		waitSomeTime(7000L);
		MyDriver.get().manage().deleteAllCookies();
		advanceSearch.click();


	}

	public void veryZipCode(String zip) {
		MyDriver.get().manage().deleteAllCookies();
		zipCode.clear();
		zipCode.sendKeys(zip);
		logger.info("{} has entered as Zip Code", zip);
	}

	public void checkCertifiedAndConvertableOption(String str) {
		try {
			if (str.equalsIgnoreCase(certified.getText())) {
				scrollDown(certified);
				certified.click();
			} else {

				scrollDown(convertible);
				convertible.click();
			}
		} catch (Exception e) {
			logger.error("We cauth error  ");
		}
	}


	public void selectYears(String fromYear, String toYear) {
		scrollDown(startYear);  //optional olarak koyduk
		Select selectFrom = new Select(startYear);
		selectFrom.selectByValue(fromYear);

		Select selectTo = new Select(endYear);
		selectTo.selectByValue(toYear);
		waitSomeTime(3000L);

		logger.info("Successfully {} and {} chosen", fromYear, toYear);
	//	MyDriver.get().manage().deleteAllCookies();
	}

	public void selectModel(String model) {
		scrollDown(anyMakeAdvanceSearch); // optional
		Select select = new Select(anyMakeAdvanceSearch);
		select.selectByValue(model);
		waitSomeTime(3000L);

	}

	public void clickSearchButton() {

		scrollDown(advanceSearchButton);

		advanceSearchButton.click();
	}
}
