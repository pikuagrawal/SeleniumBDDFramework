package org.example;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.example.driver.DriverManager;

public class Hooks {
    DriverManager driverManager = new DriverManager();
    @Before
    public void setup() throws IllegalAccessException {
        driverManager.openLocalBrowser();
        driverManager.maximisingBrowser();
        driverManager.openURL();
        driverManager.applyImplicitWait();

    }
    @After
    public void tearDown(){
        driverManager.closeBrowser();
    }
}
