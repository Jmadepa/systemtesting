Feature: Login

@test
Scenario: user should not logged in when wrong password applied
Given user navigates
When user clicks on menu "Login"
When user enters username "poojarem"
And user enters password ""
And user clicks on button "Login"
Then user not loggedin "Logoff"
And user closes the broswer


