package com.automation.stepdefinitions;

import junit.framework.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

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


		Assert.assertTrue("user looged in as", login.loggedInSuccessfully(userttype));

	}
	
	@When("^user enters in field \"([^\"]*)\" value \"([^\"]*)\"$")
	public void userEnters(String field, String values){
		login.enterVal(field, values);
		
	}
	
}
