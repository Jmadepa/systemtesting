Feature: Login


@test
Scenario: Logged in as reviewer
Given user navigates
When user clicks on menu "Login"
When user enters username "reviewuser"
And user enters password "reviewuser"
And user clicks on button "Login"
Then user logged in successfully as "Proposals"
And user closes the broswer

					
