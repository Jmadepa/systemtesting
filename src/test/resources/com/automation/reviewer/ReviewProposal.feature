Feature: Review the proposal

@test
Scenario: Review proposal
Given user navigates
When user clicks on menu "Login"
When user enters username "reviewer"
And user enters password "reviewer"
And user clicks on button "Login"
Then user logged in successfully as "Proposals"
When user clicks on button "Proposals"
When user clicks on button "Uber is hiring FIU Engineers"
And user enters in field "comments" value "good"
And user clicks on button "Accept"
Then user reviewed successfully
And user closes the broswer
					

