package com.autotrader.searchPages;

import com.autotrader.utils.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(MyDriver.get(), this);
    }

    public WebElement browseBy(String by){
        return MyDriver.get().findElement(By.xpath("//*[text()='"+by+"']"));
    }

    @FindBy(xpath = "//a[text()='Advanced Search']")
    public WebElement advancedSearch;

    public WebElement modelMakeElement(String str){
        return MyDriver.get().findElement(By.xpath("//option[text()='"+str+"']"));
    }

    @FindBy(id = "makeCode")
    public WebElement makeCode;

    @FindBy(id = "modelCode")
    public WebElement modelCode;

    @FindBy(id = "ae-userStateStore")
    public WebElement iframe;

    @FindBy(xpath = "//body[@class='ae-lang-en ae-device-desktop']")
    public WebElement navbar_default;




}
