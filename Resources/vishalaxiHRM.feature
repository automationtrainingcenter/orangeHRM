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
@tag
Feature: create user  functionality
Background: Admin is in Admin page

Scenario: Add user  with valid credentials
validating user functionality with valid username fields
 
When admin enters vaid username fields
And click on save
Then admin will get added user in user table


Scenario: Add user  with invalid credentials
validating user functionality with invalid username fields
 
When admin enters invaid username fields
Then System displays error message
And asks admin to enter valid data
