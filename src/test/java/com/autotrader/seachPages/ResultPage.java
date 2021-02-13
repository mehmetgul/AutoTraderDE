package com.autotrader.seachPages;

import com.autotrader.utils.MyDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ResultPage  extends Base{

	Logger logger = LoggerFactory.getLogger(ResultPage.class);

	@FindBy( tagName= "title")
	WebElement title;

	@FindBy(xpath = "//div[contains(@data-cmp,'inventoryListing')]")
	WebElement numberOfBMWListing;

	@FindBy(xpath = "//h2[contains(@data-cmp,'subheading')]")
	WebElement onlyBMWCars;

//div[contains(text(),'1-8 of 8 Results')]

	String expected="Certified BMW Convertibles for Sale in Alpharetta, GA (with Photos) - Autotrader";
	public void verifyTitle(){

		waitSomeTime(3000L);
		String actual= MyDriver.get().getTitle();

		logger.info("Verifying the page title");
		logger.info("Actual Page tile is : {}",actual);
		logger.info("Expected Page tile is : {}",expected);
		Assert.assertEquals(expected,actual);
		logger.info("Assertion successful");
	}

	public void verifyOnlyBMWListing(String car) {
		List<WebElement> list=MyDriver.get().findElements(By.xpath("//h2[contains(@data-cmp,'subheading')]"));

		int count=0;
		int nonBMWcount=0;
		for(WebElement each : list){
			if(!each.getText().contains(car)){
				nonBMWcount++;
				logger.warn("We have found {} listing which is not {} ",nonBMWcount,car);

			}
			count++;
		}
		logger.info("We have found {} BMW listing inclunding sponsors",count);
		logger.info("We didn't find any non {} listing",car);

		/*List<WebElement> list=MyDriver.get().findElements(By.xpath("//div[contains(@data-cmp,'inventoryListing')]"));
		logger.info("Number of BMWs are {} ",list.size());
		int actual=list.size();
*/

	}
}
