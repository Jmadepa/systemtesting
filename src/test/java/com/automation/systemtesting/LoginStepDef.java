package com.automation.systemtesting;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginStepDef extends Definition{
	
	@Given("^user navigates$")
	public void user_navigates() {
	    login.naviagteTo("");
	}
	@When("^Hello$")
	public void hello(){
		
	}
}
