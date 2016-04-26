package com.automation.drivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class WrappedWebElement implements WebElement {
	WrappedWebDriver driver = null;
	By by = null;
	
	public WrappedWebElement(WrappedWebDriver driver, By by){
		this.driver = driver;
		this.by = by;
	}

	public void clear() {
		driver.findElement(by).clear();
		
	}

	public void click() {
		// TODO Auto-generated method stub
		
	}

	public WebElement findElement(By arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<WebElement> findElements(By arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAttribute(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCssValue(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Point getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	public Dimension getSize() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTagName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isSelected() {
		// TODO Auto-generated method stub
		return false;
	}

	public void sendKeys(CharSequence... arg0) {
		// TODO Auto-generated method stub
		
	}

	public void submit() {
		// TODO Auto-generated method stub
		
	}

}
