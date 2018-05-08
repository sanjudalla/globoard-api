@user-service 
Feature: verify user is able to access user service features
 
 @register 
 Scenario: Verify registration of user
 	Given user has registeration endpoint with headers
	When user provides username,password and name
	When user hits the Registeration api
	Then verify status code is 200
	Then verify response has id
	
@search	@smoke @regression
Scenario: Verify information of registered user
	Given user has search endpoint with headers
	When user provides username
	When user hits search api
	Then verify status code is 200
	Then verify response has id
	
 