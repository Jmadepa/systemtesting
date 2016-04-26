package com.automation.drivers;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.automation.configuraion.Config;

public class WrappedWebDriver implements WebDriver{

	//object initilization
	Config config = new Config();
	WebDriver driver = null;

	public WrappedWebDriver(){
		if(Config.get("browser").equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}else if(Config.get("browser").equalsIgnoreCase("ie")){
			driver = new InternetExplorerDriver();

		}else if(Config.get("browser").equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\chromedriver.exe");
			System.out.println(System.getProperty("user.dir")+"\\src\\test\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
		}else{
			//throw new Exception("Please check your browser value in config file");
		}
	}

	public void close() {
		driver.close();

	}

	public WebElement findElement(By arg0) {

		return driver.findElement(arg0);
	}

	public List<WebElement> findElements(By arg0) {

		return driver.findElements(arg0);	
	}

	public void get(String arg0) {
		driver.get(Config.get("url"));

	}

	public String getCurrentUrl() {

		return driver.getCurrentUrl();
	}

	public String getPageSource() {

		return driver.getPageSource();
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public String getWindowHandle() {
		return driver.getWindowHandle();
	}

	public void switchToTheWindow(String windowName){
		Set<String> windowNames = getWindowHandles();
		for(String window : windowNames){
			if(window.equals(windowName)){
				switchTo().window(window);
				break;
			}

		}
	}
	public void returnToDefaultWindow(){
		driver.switchTo().defaultContent();
	}
	public Set<String> getWindowHandles() {

		return getWindowHandles();
	}

	public Options manage() {

		return driver.manage();
	}

	public Navigation navigate() {

		return navigate();
	}

	public void quit() {
		driver.quit();

	}

	public TargetLocator switchTo() {
		return driver.switchTo();
	}


}
