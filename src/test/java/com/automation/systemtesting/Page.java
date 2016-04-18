package com.automation.systemtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Page {
	
	WebDriver driver;
	Page(){
		System.setProperty("webdriver.chrome.driver", "H:\\Work\\systemtesting\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	 

}
