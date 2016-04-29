Feature: Verify An Evevent

@test
Scenario: Create a Booth
Given user navigates
When user clicks on menu "Login"
When user enters username "kidmend"
And user enters password "kidmend"
And user clicks on button "Login"
Then user logged in successfully as "Add Events"
When user clicks on menu "Events"
Then user is at page "Event Name"
And user clicks on button "Robot Show"
And user clicks on button "Book Booth"
And user enters in field "count" value "5"
And user enters in field "dropdownMenu1" value "small"
And user clicks on button "Pay Now"

