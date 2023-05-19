package org.example.setp_definition;

import cucumber.api.java.en.Then;
import org.example.driver.DriverManager;
import org.example.pages.LoginPage;

import static org.junit.Assert.assertEquals;

public class LoginSteps extends DriverManager {
    LoginPage loginPage = new LoginPage();
    @Then("^I should see \"([^\"]*)\" text$")
    public void i_should_see_text(String expectedText) throws Throwable {
        String actualText = loginPage.getWelcomeText();

        assertEquals(expectedText, actualText);

    }

    @Then("^the URL should contain \"([^\"]*)\"$")
    public void the_URL_should_contain(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
}
