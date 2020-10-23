package com.autotrader.searchSteps;

import com.autotrader.utils.MyDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setup(){
        MyDriver.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


    @After
    public void tearDown(){
       // MyDriver.close();
    }



}
