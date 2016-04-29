package com.automation.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class Login extends Page{
	public Login(){
		super();
		storeWebElement("loginButton", By.id("logIn"));
	}
	
	public void naviagteTo(String url){
		//driver.get(url);
		driver.get("http://ec2-54-191-253-30.us-west-2.compute.amazonaws.com:8080/demo/");
		driver.manage().window().maximize();
		
		
		
	}
	
	public void userLogin(String button){
		try{
		driver.findElement(By.xpath("//*[@id='user']/button")).click();
		}catch(Exception e){
			try{
			driver.findElement(By.xpath("//*[contains(text(),'"+button+"')]")).click();;
			}catch(Exception e1){
				driver.findElement(By.xpath("//button[text()='"+button+"']")).click();
				
			}
			
				}
			}
	

	
	public void enterValueuserName(String value) throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
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
	
	public boolean verifyValues(String fields,String value){
		
		
		if(driver.findElement(By.id(fields)).getAttribute("value").equalsIgnoreCase(value))
			return true;
		else
			return false;
		
		
	}
	
	public void selectSize(String type){
		driver.findElement(By.id("dropdownMenu1")).click();
		driver.findElement(By.xpath("//*[text()='"+type+"']")).click();
		
	}
	public void enterVal(String fields,String value){
		try{
		driver.findElement(By.id(fields)).clear();
		driver.findElement(By.id(fields)).sendKeys(value);;
		}catch(Exception e){
			driver.findElement(By.id(fields)).sendKeys(value);;
		}
		
	}
	
	public void enterDate(String fieldName){
		driver.findElement(By.xpath("//div[@data-link-field='"+fieldName+"']")).click();
		
		List<WebElement> todays = driver.findElements(By.xpath("//*[text()='Today']"));
		for(WebElement today : todays){
			if(today.isDisplayed()){
				today.click();
			}
		}
		
	}
	
	public boolean userCreatedSuccessfully(){
		try{
		driver.findElement(By.id("cpassword"));
		return false;
		}catch(Exception e){
			return true;
		}
		
	}
	
	public boolean locationCreatedSuccessfully(){
		try{
		driver.findElement(By.xpath("//*[contains(text(),' New Location')]"));
		return false;
		}catch(Exception e){
			return true;
		}
		
	}
	
	public boolean eventCreatedSuccessfully(){
		try{
		driver.findElement(By.id("category"));
		return false;
		}catch(Exception e){
			return true;
		}
		
	}
	
	public boolean boothCreatedSuccessfully(){
		try{
		driver.findElement(By.xpath("//*[contains(text(),'Book Booth')]"));
		return true;
		}catch(Exception e){
			return false;
		}
		
	}
	
	public boolean ticketPurchasedSuccessfully(){
		try{
		driver.findElement(By.xpath("//*[contains(text(),'Book Booth')]"));
		return true;
		}catch(Exception e){
			return false;
		}
		
	}
	
	public boolean reviewSuccessfully(){
		try{
		driver.findElement(By.xpath("//button[text()='Accept']"));
		return true;
		}catch(Exception e){
			return false;
		}
		
	}
	
	

}
