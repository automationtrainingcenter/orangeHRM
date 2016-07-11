Feature: create user  functionality
Background: User is in Admin page

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




