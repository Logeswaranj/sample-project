package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itinary_pom{
	public WebDriver driver;
	public Itinary_pom(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@value='My Itinerary']")
	WebElement confirm;
	WebElement clear;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getConfirm() {
		return confirm;
	}
	
	
	
	
	
	
}
