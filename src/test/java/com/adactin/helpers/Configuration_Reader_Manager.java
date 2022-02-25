package com.adactin.helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

public class Configuration_Reader_Manager {
	public Properties include;

	public Configuration_Reader_Manager() throws Throwable {
		File hide = new File(
				"C:\\Users\\Dell\\eclipse-workspace\\hotelbooking\\src\\test\\java\\com\\adactin\\propertyfile\\Data_alagation.properties");
		FileInputStream files = new FileInputStream(hide);
		include = new Properties();
		include.load(files);

	}
public  String open_browser() {
	String property = include.getProperty("browser");
	return property;
}
public String open_url() {
	String property_one = include.getProperty("link");
	return property_one;
}
public  String give_name() {
	String property_two = include.getProperty("name");
	return property_two;
}
public  String give_password() {
	String property_three = include.getProperty("password");
	return property_three;
	
}

}
