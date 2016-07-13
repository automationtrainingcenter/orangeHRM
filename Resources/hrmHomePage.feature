#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Login Functionality
  verify Login fuctionality as an admin

  Background: User is in HRM home page

  Scenario: Login with valid credentials
    validating login functionality with valid username and valid password

    When user enters "Admin" in username
    And enters "admin" as password
    And click on loginlink
    Then User will get Admin Home page
    And User will get logout link
	@multiple
  Scenario Outline: Login with invlaid Credentials
    When user enters "<userName>" in username
    But enters "<password>" as password
    And click on loginlink
    Then User will ask to enter valid username/password

    Examples: 
      | userName | password |
      | Admin    | adminn   |
      | admin    | admin    |
      | admin    | adminnnn |
