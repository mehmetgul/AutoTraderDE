package com.autotrader.seachPages;

import com.autotrader.utils.MyDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
	public Base(){
		PageFactory.initElements(MyDriver.get(),this);
	}
}
