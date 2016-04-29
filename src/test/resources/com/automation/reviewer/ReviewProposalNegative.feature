Feature: Review the proposal

@test
Scenario: Review proposal not successful
Given user navigates
When user clicks on menu "Login"
When user enters username "reviewer"
And user enters password "reviewer"
And user clicks on button "Login"
Then user logged in successfully as "Proposals"
When user clicks on button "Proposals"
When user clicks on button "Uber is hiring FIU Engineers"
And user enters in field "comments" value ""
And user clicks on button "Accept"
Then user not reviewed successfully
And user closes the broswer
					

