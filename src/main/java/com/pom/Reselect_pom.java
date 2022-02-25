package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reselect_pom {
	public WebDriver driver;
	
	public Reselect_pom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//input[@name='radiobutton_0']")
	WebElement selectbutton;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getSelectbutton() {
		return selectbutton;
	}
	public WebElement getContinuebutton() {
		return continuebutton;
	}

	@FindBy(xpath = "//input[@name='continue']")
	WebElement continuebutton;
	
	
	

}
