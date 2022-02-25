package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_pom {
	public WebDriver driver;
	public Logout_pom(WebDriver driver) {
		this .driver= driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Logout")
	WebElement logout;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	
}
