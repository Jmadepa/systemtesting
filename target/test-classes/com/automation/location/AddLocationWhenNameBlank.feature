Feature: New Location

@test
Scenario: user should not be able to create a new location
Given user navigates
When user clicks on menu "Login"
When user enters username "adminuser"
And user enters password "adminuser"
And user clicks on button "Login"
Then user logged in successfully as "Add Location"
When user clicks on button "Add Location"
And user enters in field "name" value ""
And user enters in field "address" value "ECS238"
And user enters in field "smallBoothMax" value "5"
And user enters in field "mediumBoothMax" value "1"
And user enters in field "largeBoothMax" value "3"
And user clicks on button "Add Location"
Then location is not added successfully

					

