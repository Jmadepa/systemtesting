Feature: Registration

@test
Scenario: Registration unsuccessful when password is blank
Given user navigates
When user clicks on menu "Registration"
And user enters in field "name" value "Tester"
And user enters in field "username" value "Tester"
And user enters in field "password" value ""
And user enters in field "cpassword" value "Testerpassword"
And user enters in field "email" value "tester@testing.com"
And user enters in field "phoneNumber" value "1234"
And user enters in field "address" value "1234"
And user enters in field "aboutMe" value "tester"
And user enters in field "role" value "customer"
And user clicks on button "Register"
Then user not created successfully
And user closes the broswer
					

					