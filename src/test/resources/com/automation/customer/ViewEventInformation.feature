Feature: Verify An Evevent

@test
Scenario: Create an Event
Given user navigates
When user clicks on menu "Login"
When user enters username "kidmend"
And user enters password "kidmend"
And user clicks on button "Login"
Then user logged in successfully as "Add Events"
When user clicks on menu "Events"
Then user is at page "Event Name"
And user clicks on button "Robot Show"
Then value of field "name" equals to "Robot Show"
Then value of field "category" equals to "IT"
Then value of field "location" equals to "ACH5"
Then value of field "startDate" equals to "04/20/2016"
Then value of field "endDate" equals to "04/20/2016"
Then value of field "time" equals to "04:00:00 PM"
Then value of field "description" equals to "Enjoy the exciting show with gigantic robots busily moving around the hall, robot battles, robot parades, dancers, and drum "
