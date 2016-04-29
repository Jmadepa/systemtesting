Feature: Verify An Evevent

@test
Scenario: Create a Booth
Given user navigates
When user clicks on menu "Login"
When user enters username "pooja"
And user enters password "pooja"
And user clicks on button "Login"
Then user logged in successfully as "Booths"
When user clicks on menu "Events"
Then user is at page "Event Name"
And user clicks on button "Robot Show"
And user clicks on button "Book Booth"
And user select size as "small"
And user enters in field "count" value "5"
And user clicks on button "Pay Now"
Then booth is created successfully
And user closes the broswer
