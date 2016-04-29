Feature: use case1

@test
Scenario: Create an Event
Given user navigates
When user clicks on menu "Login"
When user enters username "jagmadepalle"
And user enters password "jagmadepalle"
And user clicks on button "Login"
Then user logged in successfully as "Add User"
When user clicks on button "Add User"
And user enters in field "name" value "Tester"
And user enters in field "username" value "Tester"
And user enters in field "password" value "Testerpassword"
And user enters in field "cpassword" value "Testerpassword"
And user enters in field "email" value "tester@testing.com"
And user enters in field "dateOfBirth" value "01/04/0989"
And user enters in field "phoneNumber" value "1234"
And user enters in field "address" value "1234"
And user enters in field "aboutMe" value "tester"
And user enters in field "role" value "tester"
And user clicks on button "Add User"

					

