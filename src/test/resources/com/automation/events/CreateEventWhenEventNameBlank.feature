Feature: Event Creation

@test
Scenario: Create an Event not successful when category is blank
Given user navigates
When user clicks on menu "Login"
When user enters username "poojarem"
And user enters password "poojarem"
And user clicks on button "Login"
Then user logged in successfully as "Add Events"
When user clicks on button "Add Events"
And user enters in field "name" value ""
And user enters in field "location" value "Test Location"
And user enters in field "category" value "IT"
And user enters date as today date for "startDate"
And user enters date as today date for "endDate"
And user enters date as today date for "time"
And user enters in field "ticketPrice" value "50"
And user enters in field "description" value "Test Description"
And user clicks on button "create"
Then event is not created successfully

					

