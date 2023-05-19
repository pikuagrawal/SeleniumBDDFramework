package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DriverManager {
    @FindBy(xpath = "//div[@class = 'page-title']/h1")
    WebElement welcomeText;

    public String getWelcomeText() throws InterruptedException {
        String actualText = welcomeText.getText();
        Thread.sleep(5000);
        return actualText;

    }
}
