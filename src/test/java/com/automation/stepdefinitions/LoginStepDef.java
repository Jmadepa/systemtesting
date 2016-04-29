package com.automation.stepdefinitions;


import junit.framework.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@SuppressWarnings("deprecation")
public class LoginStepDef extends Definition{

	@Given("^user navigates$")
	public void user_navigates() {
		login.naviagteTo("http://ec2-54-191-253-30.us-west-2.compute.amazonaws.com:8080/demo/");
	}
	@When("^user closes the broswer$")
	public void hello(){
		login.closeDriver();	
	}

	@When("^user enters username \"([^\"]*)\"$")
	public void user_entersusername(String arg1) throws Throwable {

		login.enterValueuserName(arg1);
	}
	
	@When("^user enters password \"([^\"]*)\"$")
	public void user_enterspassword(String arg1) throws Throwable {

		login.enterValueuserPassword(arg1);
	}

	@When("^user clicks on menu \"([^\"]*)\"$")
	public void user_clicks(String buttonName) throws Throwable {
		login.clickOnMenu(buttonName);

	}
	
	@When("^user clicks on button \"([^\"]*)\"$")
	public void user_clicks_login(String buttonName) throws Throwable {
		login.userLogin(buttonName);

	}

	@SuppressWarnings("deprecation")
	@Then("^user logged in successfully as \"([^\"]*)\"$")
	public void user_logged_in_successfully(String userttype) throws Throwable {

      Thread.sleep(2000);
		Assert.assertTrue("user not looged in as "+userttype, login.loggedInSuccessfully(userttype));

	}
	
	@Then("^user not loggedin \"([^\"]*)\"$")
	public void usernotloggedin(String userttype) throws Throwable {


		Assert.assertFalse("user looged in as", login.loggedInSuccessfully(userttype));

	}
	
	@When("^user enters in field \"([^\"]*)\" value \"([^\"]*)\"$")
	public void userEnters(String field, String values){
		login.enterVal(field, values);
		
	}
	@When("^user enters date as today date for \"([^\"]*)\"$")
	public void enterToday(String field){
		login.enterDate(field);
		
	}
	
	@SuppressWarnings("deprecation")
	@Then("^user is at page \"([^\"]*)\"$")
	public void user_isAtPage(String userttype) throws Throwable {

      Thread.sleep(2000);
		Assert.assertTrue("user is not at page "+userttype, login.loggedInSuccessfully(userttype));

	}
	@Then("^value of field \"([^\"]*)\" equals to \"([^\"]*)\"$")
	public void verifyTheValueInField(String fields, String value) throws Throwable {

      Thread.sleep(2000);
		Assert.assertTrue("Field value is not equal "+value, login.verifyValues(fields,value));

	}
	
	@Then("^user waits for \"([^\"]*)\" sec$")
	public void hardwait(String waitTime) throws Throwable {

      Thread.sleep(Integer.parseInt(waitTime)*30);
		

	}
	
	@Then("user created successfully")
	public void usercreatedsuccessfully(){
		Assert.assertTrue("User not created successfully ", login.userCreatedSuccessfully());
		
	}
	
	@Then("user not created successfully")
	public void usernotcreatedsuccessfully(){
		Assert.assertFalse("User created successfully ", login.userCreatedSuccessfully());
		
	}
	
	@Then("location is added successfully")
	public void location(){
		Assert.assertTrue("location not added successfully ", login.locationCreatedSuccessfully());
	}
	
	@Then("location is not added successfully")
	public void locationNotAdded(){
		Assert.assertTrue("location added successfully ", login.locationCreatedSuccessfully());
	}
	
	@Then("event is created successfully")
	public void eventcreatedsuccessfully(){
		Assert.assertTrue("User not created successfully ", login.eventCreatedSuccessfully());
		
	}
	
	@Then("event is not created successfully")
	public void eventnotcreatedsuccessfully(){
		Assert.assertFalse("User not created successfully ", login.eventCreatedSuccessfully());
		
	}
	 
	
}
