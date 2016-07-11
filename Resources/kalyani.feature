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
Feature: user management functionality
	verify the user management in Admin page 
Background: user is in Admin page

@tag1
Scenario: create a new User and verify in the User table
validating the UserName available in the table
When User enters the allthe fields with valid data
	And assigning role as Ess
	And Employee name with already existed in PIM module
	And enter the UsernName
	And Status as enabled
	And enter Password in the field
	And enter confirmpassword
Then Click on Save button
	And User will get into the system users Lists 

@tag2
Scenario Outline:  verify User search operation
validating the User present in the System Users List  
When enters the UserName 
And enters the  UserRole 
And enters the  EmployeeName 
And enters the Status as enabled
Then Click on the Search button 
And New User will Appear in the System Users List

@tag3
Scenario Outline:  verify User delete operation in System Users List
validating the User delete operation performed in the System Users List  
When Clicks on the checkbox next to the UserName 
Then Click on the ok button in the Delete Records 
And Succesfully Deleted message appears

@tag4
Scenario Outline: verifing with invalid data
validating the UserName available in the table
When User enters the allthe fields with invalid data
	And assigning role as Ess
	And Employee name with already existed in PIM module
	And enter the UsernName
	And Status as enabled
	And enter Password in the field
	And enters invalid confirmpassword
Then Click on Save button
	And User will ask to enter the valid password/confirm password

@tag5
Scenario Outline:  verify User search operation with invalid data 
When enters the UserName with invalid data 
And enters the  UserRole 
And enters the  EmployeeName 
And enters the Status as enabled
Then Click on the Search button 
And user will get the No Records Found message in the System Users List

@tag6
Scenario Outline:  verify User delete operation in System Users List without selecting
validating the User delete operation performed without selecting the  System Users List  
Then Click on delete operation
And Delete operation not performed without selecting

Examples:
    | name  |value | status |
    | name1 |  5   | success|
    | name2 |  7   | Fail   |
