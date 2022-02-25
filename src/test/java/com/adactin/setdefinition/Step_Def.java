package com.adactin.setdefinition;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import com.adactin.helpers.File_Reader_Manager;
import com.adactin.runner.Runner_class;
import com.pom.Bookhotel_pom;
import com.pom.Itinary_pom;
import com.pom.Login_pom;
import com.pom.Logout_pom;
import com.pom.Searchhotel_pom;
import com.pom.Select_pom;

import Baseclass.Base_Class;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Step_Def extends Base_Class {
	public static WebDriver driver = Runner_class.driver;
	Login_pom login = new Login_pom(driver);

	@Given("^User Launch The Adactin Application$")
	public void user_Launch_The_Adactin_Application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String open_url = File_Reader_Manager.getInstance().getInstanceCR().open_url();
	    get(open_url);
	}

	@When("^User Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String give_name = File_Reader_Manager.getInstance().getInstanceCR().give_name();
		sendkey(login.getUsername(),give_name);
		
	}

	@When("^User Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String give_password = File_Reader_Manager.getInstance().getInstanceCR().give_password();
		sendkey(login.getPass(),give_password);
		
	}

	@Then("^User Click On The Login Button And Adactin Application Navigates To Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_Adactin_Application_Navigates_To_Search_Hotel_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		click(login.getClick());
	}
	Searchhotel_pom hotel = new Searchhotel_pom(driver);
	

	@Given("^User Select The Location Of The Hotel$")
	public void user_Select_The_Location_Of_The_Hotel() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    selectbyindex(hotel.getLocation(), 8);
	}

	@Given("^User Select The Hotel Recuired From The List Of Hotel$")
	public void user_Select_The_Hotel_Recuired_From_The_List_Of_Hotel() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    selectbyindex(hotel.getHotel(), 2);
	}

	@Given("^User Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    selectbyvisibletext(hotel.getRoom(), "Super Deluxe");
	}

	@Given("^User Select Number Of Rooms$")
	public void user_Select_Number_Of_Rooms() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    selectbyvalue(hotel.getNoofroom(), "2");
	}

	@Given("^User Select Check In Date$")
	public void user_Select_Check_In_Date() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    gettext(hotel.getCheckin());
	}

	@Given("^User Select Check out Date$")
	public void user_Select_Check_out_Date() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    gettext(hotel.getChekout());
	}

	@Given("^User Select Adults Per Room$")
	public void user_Select_Adults_Per_Room() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    selectbyindex(hotel.getAdultperroom(), 2);
	}

	@Given("^User Select Childrens Per Room$")
	public void user_Select_Childrens_Per_Room() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    selectbyindex(hotel.getChildperroom(), 0);
	}

	@Then("^User Click On The Search Button And Adactin Application Navigates To Select Hotel Page$")
	public void user_Click_On_The_Search_Button_And_Adactin_Application_Navigates_To_Select_Hotel_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    click(hotel.getSubmit());
	}

	Select_pom select = new Select_pom(driver);
	
	@Given("^User Select The Hotel From The List Of Hotel$")
	public void user_Select_The_Hotel_From_The_List_Of_Hotel() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    click(select.getSelect());
	}

	@When("^User Click The Continue Button And Adactin Application Navigates To Book A Hotel Page$")
	public void user_Click_The_Continue_Button_And_Adactin_Application_Navigates_To_Book_A_Hotel_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   click(select.getClick());
	}
	Bookhotel_pom hotelbooking = new Bookhotel_pom(driver);

	@Given("^User Enter The First Name In  First Name Field$")
	public void user_Enter_The_First_Name_In_First_Name_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  sendkey(hotelbooking.getName(),"Loges");
	}

	@Given("^User Enter The Last Name In  Last Name Field$")
	public void user_Enter_The_Last_Name_In_Last_Name_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    sendkey(hotelbooking.getLastname(), "J");
	}

	@Given("^User Enter The Address In  Billing Address Field$")
	public void user_Enter_The_Address_In_Billing_Address_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    sendkey(hotelbooking.getAdress(),"******,##########,$$$$$$");
	}

	@Given("^User Enter The Credit Card No On Credit Card No Field$")
	public void user_Enter_The_Credit_Card_No_On_Credit_Card_No_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    sendkey(hotelbooking.getCcno(), "1234567890123456");
	}

	@Given("^User Select The Credit Card Type$")
	public void user_Select_The_Credit_Card_Type() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   selectbyindex(hotelbooking.getCctype(), 3);
	}

	@Given("^User Select The Expiry Date$")
	public void user_Select_The_Expiry_Date() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    selectbyindex(hotelbooking.getExpmonth(), 12);
	}
	@Given("^User Select The Expiry Year$")
	public void user_Select_The_Expiry_Year() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   selectbyvalue(hotelbooking.getExpyear(), "2022");
	}

	@Given("^User Enter The Cvv No On Cvv Number Field$")
	public void user_Enter_The_Cvv_No_On_Cvv_Number_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    sendkey(hotelbooking.getCvv(), "222");
	}

	@Then("^User Click The Book Now Button And Adactin Application Navigates To Booking Confirmation Page$")
	public void user_Click_The_Book_Now_Button_And_Adactin_Application_Navigates_To_Booking_Confirmation_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    click(hotelbooking.getBooknow());
	    implicit();
	}
	

	Itinary_pom itrate = new Itinary_pom(driver);
	
	@Given("^User Verify The Hotel And Click My Itinerary Button$")
	public void user_Verify_The_Hotel_And_Click_My_Itinerary_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   click(itrate.getConfirm());
	}
	
	Logout_pom lout = new Logout_pom(driver);
	

	@Given("^User Click The Logout Button$")
	public void user_Click_The_Logout_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    click(lout.getLogout());
	
	}
}

