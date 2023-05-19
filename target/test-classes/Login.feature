@Test
Feature: login feature
  As a user
  I want to add login functionality
  So that customer can use it

  Scenario: Validating sign in text on login page
    Given I am on homepage
    When I click on login button on homepage
    Then I should see "Welcome, Please Sign In!" text
    And the URL should contain "/login"
