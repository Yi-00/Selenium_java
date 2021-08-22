Feature: Login
  Login successful


  Scenario: Login with valid credentials
    Given User is on Login Page
    When User enter valid username
    And User enter valid password
    And User click on Login button
    Then User can visit home page

  Scenario: Login with invalid credentials
    Given User is on Login Page
    When User enter invalid username
    And User enter valid password
    And User click on Login button
    Then User can't visit home page
    And Display an error message