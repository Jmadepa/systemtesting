Feature: Purchase Ticket

@test
Scenario: User purchase a ticket
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
And user enters in field "count" value "2"
And user clicks on button "Purchase Ticket"
Then user purchased ticket successfully

					

