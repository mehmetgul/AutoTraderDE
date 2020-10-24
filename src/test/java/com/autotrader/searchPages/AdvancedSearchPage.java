package com.autotrader.searchPages;

import com.autotrader.utils.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdvancedSearchPage extends BasePage {

    public WebElement selectAnAttribute(String attribute){
        return MyDriver.get().findElement(By.xpath("//*[text()='"+attribute+"']"));
    }

    @FindBy(id = "zip")
    public WebElement zipCode;

    public WebElement selectCheckBox(String box){
        return MyDriver.get().findElement(By.xpath("//div[text()='"+box+"']"));
    }

    public WebElement selectFromOrTo(String startOrEnd){
        String fromOrTo=null;
        if (startOrEnd.equals("From")){
            fromOrTo="start";
        }else
            fromOrTo="end";
        return MyDriver.get().findElement(By.xpath("//select[starts-with(@name,'"+fromOrTo+"')]"));
    }

    @FindBy(xpath = "//select[@name='makeFilter0']")
    public WebElement anyMake;

    @FindBy(xpath = "//button[text()='Search']")
    public WebElement search;


    @FindBy(name = "startYear")
    public WebElement startYear;

    @FindBy(name = "endYear")
    public WebElement endYear;








}
