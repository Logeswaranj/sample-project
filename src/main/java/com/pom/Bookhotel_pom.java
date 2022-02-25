package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookhotel_pom {
	public WebDriver driver;
	public Bookhotel_pom(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='first_name']")
	WebElement name;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getName() {
		return name;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAdress() {
		return adress;
	}
	public WebElement getCcno() {
		return ccno;
	}
	public WebElement getCctype() {
		return cctype;
	}
	public WebElement getExpmonth() {
		return expmonth;
	}
	public WebElement getExpyear() {
		return expyear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	

	@FindBy(xpath = "//input[@name='last_name']")
	WebElement lastname;
	@FindBy(xpath = "//textarea[@name='address']")
	WebElement adress;
	@FindBy(xpath = "//input[@name='cc_num']")
	WebElement ccno;
	@FindBy(xpath = "//select[@name='cc_type']")
	WebElement cctype;
	@FindBy(xpath = "//select[@name='cc_exp_month']")
	WebElement expmonth;
	@FindBy(xpath = "//select[@name='cc_exp_year']")
	WebElement expyear;
	@FindBy(xpath = "//input[@name='cc_cvv']")
	WebElement cvv;
	@FindBy(xpath = "//input[@onclick='book_hotel_validate();']")
	WebElement booknow;
	public WebElement getBooknow() {
		return booknow;
	}
	
	
	
	
	
}
