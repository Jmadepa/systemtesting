Feature: Purchase Ticket

@test
Scenario: User not be able to purchase a ticket when count is blank
Given user navigates
When user clicks on menu "Login"
When user enters username "pooja"
And user enters password "pooja"
And user clicks on button "Login"
Then user logged in successfully as "Booths"
When user clicks on menu "Events"
Then user is at page "Event Name"
And user clicks on button "Robot Show"
And user clicks on button "Purchase Ticket"
And user enters in field "count" value ""
And user clicks on button "Purchase Ticket"
Then user purchased ticket successfully

					

