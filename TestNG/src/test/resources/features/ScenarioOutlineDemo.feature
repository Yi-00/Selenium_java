Feature: Login

  Scenario Outline: Login with  invalid credentials

    Given Load URL
    When I enter invalid "<username>" in username textbox
    And I enter invalid "<password>" in password textbox
    And I click on login in button
    Then I can see Home page
    Examples:
      | username | password |  |
      | Admin1   | admin123 |  |
      | Admin2   | admin123 |  |

  Scenario: DataTable Example
    Given The following users exists
      | Name | Email          | Twitter |
      | John | John@gmail.com | @John   |
      | Tom  | Tom@gmail.com  | @Tom    |