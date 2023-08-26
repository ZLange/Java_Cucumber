# Feature file is like Test Suit

  Feature: Application Login
    Here can be optional description

  Scenario: Admin page login

  Given User is on NetBanking page
  When User login into application with "admin" and password "1234"
  Then Home page is displayed
  And Cards are displayed

  # Reusable
  Scenario: User page login

  Given User is on NetBanking page
  When User login into application with "user" and password "0258"
  Then Home page is displayed
  And Cards are displayed