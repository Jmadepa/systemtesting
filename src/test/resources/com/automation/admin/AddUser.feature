Feature: Add new user into EMS

@test
Scenario: Add new user
Given user navigates
When user clicks on menu "Login"
When user enters username "adminuser"
And user enters password "adminuser"
And user clicks on button "Login"
And user logged in successfully as "Add User"
And user clicks on button "Add User"
And user enters in field "name" value "Tester"
And user enters in field "username" value "Tester"
And user enters in field "password" value "Testerpassword"
And user enters in field "cpassword" value "Testerpassword"
And user enters in field "email" value "tester@testing.com"
And user enters in field "dateOfBirth" value "01/04/1989"
And user enters in field "phoneNumber" value "1234"
And user enters in field "address" value "1234"
And user enters in field "aboutMe" value "tester"
And user enters in field "role" value "customer"
And user clicks on button "Add User"
Then user created successfully



					

