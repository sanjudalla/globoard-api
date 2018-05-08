@user-service 
Feature: verify user is able to access user service features
  
 Scenario: Verify registration of user
	When user hits the Registeration api
	And user provides username,password and name
	Then verify the status code is 200
	And user should get id in the response
	
 