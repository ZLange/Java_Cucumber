# Feature file is like Test Suit

  Feature: Application Login
    Here can be optional description

  # background runs only on this specific feature file
  Background:

    Given setup the entries in DB
    When launch the browser from config variables
    And hit the homepage URL of banking page

  @RegressionTest
  Scenario: Admin page login

    Given User is on NetBanking page
    When User login into application with "admin" and password "1234"
    Then Home page is displayed
    And Cards are displayed

  # Reusable
  @MobileTest
  Scenario: User page login

    Given User is on NetBanking page
    When User login into application with "user" and password "0258"
#    When User login into application with user and password 0258
    Then Home page is displayed
    And Cards are displayed

  # parametrize
  @SmokeTest @RegressionTest
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

  # fill data in more fields
  @SmokeTest
  Scenario: User page Sign Up

    Given User is on Practice page
    When User Signup into application
    | Anne  |
    | Tester |
    | test@test.com |
    | 56545747874444  |
    Then Home page is displayed
    And Cards are displayed