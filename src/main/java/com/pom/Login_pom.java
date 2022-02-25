package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_pom {
	public WebDriver driver;
	public Login_pom(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")
	WebElement username;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getClick() {
		return click;
	}

	@FindBy(xpath  = "//input[@type='password']")
	WebElement pass;
	@FindBy(xpath = "//input[@type='Submit']")
	WebElement click;
	
	
	
	

}
