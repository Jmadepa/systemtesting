Feature: Book a booth

@test
Scenario: Booth should not be created when value is blank
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
And user enters in field "count" value ""
And user clicks on button "Pay Now"
Then booth is not created successfully
And user closes the broswer
