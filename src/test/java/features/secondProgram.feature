# Feature file is like Test Suit

Feature: Application Login
  Here can be optional description

  #Before -> Background -> Scenario -> After
  Background:

    When launch the browser from config variables
    And hit the homepage URL of banking page

  # Reusable
  @RegressionTest @NetBanking
  Scenario: User page login

    Given User is on NetBanking page
    When User login into application with "user" and password "0258"
#    When User login into application with user and password 0258
    Then Home page is displayed
    And Cards are displayed

  # parametrize
  @SmokeTest @RegressionTest @Mortgage
  Scenario Outline: User page login

    Given User is on NetBanking page
    When User login into application with <Username> and password <Password> combination
    Then Home page is displayed
    And Cards are displayed
  # data that will be inserted in params
    Examples:
      | Username  | Password  |
      | debituser | hello15822 |
      | credituser | 46464465b |

