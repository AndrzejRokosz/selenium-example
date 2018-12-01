
@tag
Feature: Flight reservation
  I want to login and reserve some flight

  @tag1
  Scenario: login to the app
    Given I open main page
    When I fill the login form with login "adamdz" and pass "qwe123"
    Then I should see the flight reservation form
    
	Scenario: simple reservation process
		
		When I click one way button
		And  I choose "1" passenger
		And I fly from "Paris"
		And I choose day "3" "23"
		And I fly to "London"
		And I fly bussines class
		And I fly with "Blue Skies Airlines"
		And I click button
		Then I should see next page