
@P1
Feature: Facebook page login function
    Scenario: To validate FB page login function with invalid credentials
    Given User launch the browser
    And User enters the url	
    When User enters the username and password
    When User Clicks the login button
    Then User navigates to login failure page
 
