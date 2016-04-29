Feature: Login as Admin

@test
Scenario: user logged in as admin
Given user navigates
When user clicks on menu "Login"
When user enters username "adminuser"
And user enters password "adminuser"
And user clicks on button "Login"
Then user logged in successfully as "Add User"
And user closes the broswer
					
