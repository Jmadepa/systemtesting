package com.automation.pages;

import org.openqa.selenium.By;

public class Login extends Page{
	public Login(){
		super();
		storeWebElement("loginButton", By.id("logIn"));
	}
	
	public void naviagteTo(String url){
		//driver.get(url);
		driver.get("http://ec2-54-191-253-30.us-west-2.compute.amazonaws.com:8080/demo/");
		
		
		
	}
	
	public void userLogin(String button){
		driver.findElement(By.xpath("//*[@id='user']/button")).click();
		
	}
	

	
	public void enterValueuserName(String value){
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(value);
	}
	
	public void enterValueuserPassword(String value){
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(value);
	}
	
	public boolean loggedInSuccessfully(String message){
		try{
		 driver.findElement(By.xpath("//*[contains(text(),'"+message+"')]"));
		 return true;
		}catch(Exception e){
			return false;
		}
		
		
		
		//*[@id="name"]
	}
	public void enterVal(String fields,String value){
		driver.findElement(By.id(fields)).sendKeys(value);;
		
	}

}
