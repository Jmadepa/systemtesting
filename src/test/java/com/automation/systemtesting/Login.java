package com.automation.systemtesting;

import org.openqa.selenium.By;

public class Login extends Page{
	
	public void naviagteTo(String url){
		//driver.get(url);
		driver.get("http://www.gmail.com");
	}
	
	public void userLogin(String url, String userName, String password){
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("Hurrayyahh");
		
	}

}
