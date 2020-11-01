package com.autotrader.seachPages;



import com.autotrader.utils.MyDriver;
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
}
