package com.autotrader.utilities;

import com.autotrader.utils.MyDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

public class BrowserUtilities {

    /**
     * Clicks on an element using JavaScript
     *
     * @param element
     */
    public static void clickWithJS(WebElement element) {
        ((JavascriptExecutor) MyDriver.get()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) MyDriver.get()).executeScript("arguments[0].click();", element);
    }

    /**
     * Scroll down to the element using JavaScript
     *
     * @param element
     */
    public static void scrollToElement(WebElement element) {
        ((JavascriptExecutor) MyDriver.get()).executeScript("arguments[0].scrollIntoView(true);", element);
    }



}
