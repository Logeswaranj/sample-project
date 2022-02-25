package com.pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Searchhotel_pom {
	public WebDriver driver;
	public Searchhotel_pom(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//select[@name='location']")
	WebElement location;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoom() {
		return room;
	}
	public WebElement getNoofroom() {
		return noofroom;
	}
	public WebElement getCheckin() {
		return checkin;
	}
	public WebElement getChekout() {
		return chekout;
	}
	public WebElement getAdultperroom() {
		return adultperroom;
	}
	public WebElement getChildperroom() {
		return childperroom;
	}
	public WebElement getSubmit() {
		return submit;
	}
	@FindBy(xpath = "//select[@name='hotels']")
	WebElement hotel;
	@FindBy(xpath = "//select[@name='room_type']")
	WebElement room;
	@FindBy(xpath = "//select[@name='room_nos']")
	WebElement noofroom;
	@FindBy(xpath = "//input[@name='datepick_in']")
	WebElement checkin;
	@FindBy(xpath = "//input[@name='datepick_out']")
	WebElement chekout;
	@FindBy(xpath = "//select[@name='adult_room']")
	WebElement adultperroom;
	@FindBy(xpath = "//select[@name='child_room']")
	WebElement childperroom;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement submit;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
