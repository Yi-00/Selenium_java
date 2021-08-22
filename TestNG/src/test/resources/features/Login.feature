Feature: Lofin
  Scenario: Login with valid credentials
    Given User is on Login Page
    When User enter username
    And User enter password
    And User click on Login button
    Then User can visit home page