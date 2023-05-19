package org.example.setp_definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.example.pages.HomePage;

public class HomeSteps {
    HomePage homePage = new HomePage();
    @Given("^I am on homepage$")
    public void i_am_on_homepage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^I click on login button on homepage$")
    public void i_click_on_login_button_on_homepage() throws Throwable {
      homePage.clickOnLoginButton();
    }
}
