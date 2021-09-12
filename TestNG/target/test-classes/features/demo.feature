Feature: Roller - Checkout
  #env = sbase_roller_check

  Background:
    Given clear all data

  Scenario: Checkout successfully in case - total amount = 0
    Given open shop on storefront
    And add products "Bikini" to cart then checkout
    When input Customer information
    | Email            | First Name | Last Name | Address           | Country       | City         | Zip code | State      | Phone      |
    | @mailtothis.com@ | Shop       | Base      | 100 Wilshire Blvd | United States | Santa Monica | 90401    | California | 2025550147 |
    And choose shipping method ""
    And verify thank you page then get all information
    Given user login to shopbase dashboard
    And user navigate to "Orders" screen
    Given click on order name in unfulfilled orders list
    Then verify order detail on dashboard
    And close browser