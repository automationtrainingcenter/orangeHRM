@important
Feature: login with multiple users

  Scenario: verify login with multiple users
    Given user is in hrm home page
    When user enters username and password and click on login link
      | userName | password |
      | Admin    | admin    |
      | Admin    | Adminn   |
      | admin    | adminn   |
      | Adminm   | adminn   |
