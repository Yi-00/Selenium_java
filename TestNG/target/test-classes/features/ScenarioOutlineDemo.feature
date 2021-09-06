Feature: Login
  Scenario Outline: Login with  invalid credentials
    Given User is on Login Page "<url>"
    When user input "<username>" And "<password>"
    And user click on Login button
    Examples:
      | url                                   | username                | password        |
      | https://accounts.shopbase.com/sign-in | shopbase1@beeketing.net | dw9^            |
      | https://accounts.shopbase.com/sign-in | shopbase1@beeketing.net | dw9^12Hm[!p^mD% |

#  Scenario: DataTable Example
#    Given The following users exists
#      | Name | Email          | Twitter |
#      | John | John@gmail.com | @John   |
#      | Tom  | Tom@gmail.com  | @Tom    |