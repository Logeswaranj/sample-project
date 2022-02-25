package com.adactin.runner;

import org.junit.AfterClass;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.helpers.File_Reader_Manager;

import Baseclass.Base_Class;
import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\Login.feature",
glue = "com.adactin.setdefinition",
plugin = {"html:Report/Adactin","pretty","json:Report/Cucumber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html"})
@RunWith(Cucumber.class)


public class Runner_class {
	public static WebDriver driver;
	
	@BeforeClass
	public static  void startbrowser() throws Throwable {
		String open_browser = File_Reader_Manager.getInstance().getInstanceCR().open_browser();
		driver = Base_Class.launchbrowser(open_browser);
		
	}
	@AfterClass
	public static void closebrowser()  {
		
		driver.close();
		
	}  
	

}
