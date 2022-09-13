package com.telran.scheduler.tests;

import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void loginPositiveTest(){
        app.getUser().login("erster@gmail.com", "Erster111");
    }
}
