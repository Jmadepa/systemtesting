Feature: use case1

@test
Scenario: Create an Event
Given user navigates
When user clicks on menu "Login"
When user enters username "poojarem"
And user enters password "poojarem"
And user clicks on button "Login"
Then user logged in successfully as "Add Event"
When user clicks on menu "Events"
Then user is at page "Event Name"
And user clicks on button "Robot Show"
And user clicks on button "Purchase Ticket"
And user enters in field "count" value "2"
And user clicks on button "Purchase Ticket"

					

