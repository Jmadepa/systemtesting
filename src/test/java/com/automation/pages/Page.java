package com.automation.pages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.drivers.WrappedWebDriver;
import com.automation.drivers.WrappedWebElement;

public class Page {
	Map<String, By> element = new HashMap<String, By>();
	WrappedWebDriver driver;
	
	//WebDriver driver;
	public Page(){
	driver = new WrappedWebDriver();
	}
/*	Page(){
		System.setProperty("webdriver.chrome.driver", "H:\\Work\\systemtesting\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	*/
	public void storeWebElement(String webElementName, By elementType){
		element.put(webElementName, elementType);
		
	}
	
	public WrappedWebElement getWebElement(String webElementName){
		return new WrappedWebElement(driver,element.get(webElementName));
				
	}
	 
	public void closeDriver(){
		driver.quit();
	}
	
	public void clickOnMenu(String buttonName){
		driver.findElement(By.xpath("//a[text()='"+buttonName+"']")).click();
	}

}
