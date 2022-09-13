package com.telran.scheduler.tests;

import com.telran.scheduler.fw.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        app.init();

    }

    @AfterMethod(enabled = false)
    public void tierDown(){
        app.stop();
    }

}

// {
//  "platformName": "Android",
//  "appium:platformVersion": "8.0.0",
//  "appium:deviceName": "qa_mob",
//  "appium:appPackage": "com.example.svetlana.scheduler",
//  "appium:appActivity": ".presentation.splashScreen.SplashScreenActivity"
//}