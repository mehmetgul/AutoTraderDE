package com.autotrader.seachPages;

import com.autotrader.searchSteps.MyStepdefs;
import com.autotrader.utils.MyDriver;
import io.github.bonigarcia.wdm.SeleniumServerStandaloneManager;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdvancePage extends Base {
	Logger logger= LoggerFactory.getLogger(AdvancePage.class);


	/**
	 * Title
	 * Browse By Make
	 * Nrowse by Style
	 * Advanced Search
	 * Dropdown => Make and Model
	 *
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


	public void verification(String expected){

		if(expected.equalsIgnoreCase(browseByMake.getText())){
			String actual=browseByMake.getText();
			Assert.assertEquals(expected,actual);
			logger.info("Expected result : {}",expected);
			logger.info("Actual result : {}",actual);


		}else if(expected.equalsIgnoreCase(browseByStyle.getText())){
			String actual=browseByStyle.getText();
			Assert.assertEquals(expected,actual);
			logger.info("Expected result : {}",expected);
			logger.info("Actual result : {}",actual);

		}else{
			String actual=advanceSearch.getText();
			Assert.assertEquals(expected,actual);
			logger.info("Expected result : {}",expected);
			logger.info("Actual result : {}",actual);

		}

	}

	public void verifySearchButton(){
		Assert.assertTrue(searchButton.isDisplayed() && searchButton.isEnabled());
		logger.info("Search button is visible and enabled ");

	}


	public void verifyMakeAndModel(String make, String model) {
		//By Make is Displayed and Enabled
		Assert.assertTrue(filterByMake.isDisplayed() && filterByMake.isEnabled());
		logger.info("{} is Enabled nad Visible", make);

		//By Model is dependent on Make. By Model is displayed but not enabled.
		Assert.assertTrue(filterByModel.isDisplayed() && !filterByModel.isEnabled());
		logger.info("{} is Enabled nad Visible",model);
	}
}
