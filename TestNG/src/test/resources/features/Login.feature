Feature: Login
  Login successful

  Background: User is on Login Page

  Scenario: Login with valid credentials
    When User enter valid username
    And User enter valid password
    And User click on Login button
    Then User can visit home page

  Scenario: Login with invalid credentials
    When User enter invalid username
    And User enter valid password
    And User click on Login button
    Then User can't visit home page
    And Display an error message