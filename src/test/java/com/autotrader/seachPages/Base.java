package com.autotrader.seachPages;



import com.autotrader.utils.MyDriver;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Base {
	public Base() {
		PageFactory.initElements(MyDriver.get(), this);
	}

	public void waitForElement(Long miliSeconds)
	{
		try {
			Thread.sleep(miliSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	public void deleteCookies(){
		MyDriver.get().manage().deleteAllCookies();
	}

	/**
	 *  this script must scroll, until link element is visible
	 *  once link element visible, it will stop scrolling
	 *  arguments[0] = means first webelement after comma (link)
	 *  arguments it's an array of webelements after comma
	 *  arguments[0] = link web element, it can be any web element
	 */
	public void scrollDown(WebElement str) {
		waitSomeTime(2000L);
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) MyDriver.get();

		javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)",str);
		//js.executeScript("window.scrollBy(0,50)");

		waitSomeTime(2000L);

	}

	public  void waitSomeTime(Long miliSeconds) {

		try {
			Thread.sleep(miliSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}


}
