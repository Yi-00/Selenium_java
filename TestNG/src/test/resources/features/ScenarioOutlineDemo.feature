Feature: Login

  Scenario Outline: Login with  invalid credentials

    Given Load URL
    When user input "<username>" And "<password>"
    And user click on login button
    Examples:
      | username | password |
      | Admin1   | admin123 |
      | Admin    | admin123 |

#  Scenario: DataTable Example
#    Given The following users exists
#      | Name | Email          | Twitter |
#      | John | John@gmail.com | @John   |
#      | Tom  | Tom@gmail.com  | @Tom    |