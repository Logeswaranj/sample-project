package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_pom {
	WebDriver driver;
	public Select_pom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	@FindBy(xpath = "//input[@name='radiobutton_0']")
	WebElement select;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getSelect() {
		return select;
	}
	public WebElement getClick() {
		return click;
	}


	@FindBy(xpath = "//input[@type='submit']")
	WebElement click;
	
	
	
	
	
	
	
	

}
