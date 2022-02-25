package hotelbooking;

 

import com.pom.Bookhotel_pom;
import com.pom.Itinary_pom;
import com.pom.Login_pom;
import com.pom.Logout_pom;
import com.pom.Reselect_pom;
import com.pom.Searchhotel_pom;
import com.pom.Select_pom;

import Baseclass.Base_Class;

public class Adactin_main extends Base_Class {
	public static Login_pom login;
	public static Searchhotel_pom search;
	public static Select_pom select;
	public static Bookhotel_pom booknow;
	public static Reselect_pom reselect;
	public static Itinary_pom confirm;
	public static Logout_pom logout;

	public static void main(String[] args) {

		launchbrowser("chrome");
		get("https://adactinhotelapp.com/");
		login = new Login_pom(driver);
		inputkeys(login.getUsername(), "logeswaran");
		inputkeys(login.getPass(), "123456");
		click(login.getClick());

		search = new Searchhotel_pom(driver);
		selectbyindex(search.getLocation(), 8);
		selectbyindex(search.getHotel(), 2);
		selectbyvisibletext(search.getRoom(), "Super Deluxe");
		selectbyvalue(search.getNoofroom(), "2");
		gettext(search.getCheckin());
		gettext(search.getChekout());
		selectbyindex(search.getAdultperroom(), 2);
		selectbyindex(search.getChildperroom(), 0);
		click(search.getSubmit());

		select = new Select_pom(driver);
		click(select.getSelect());
		click(select.getClick());

		booknow = new Bookhotel_pom(driver);
		sendkey(booknow.getName(), "Loges");
		sendkey(booknow.getLastname(), "J");
		sendkey(booknow.getAdress(), "******,##########,$$$$$$");
		sendkey(booknow.getCcno(), "1234567890123456");
		selectbyindex(booknow.getCctype(), 3);
		selectbyindex(booknow.getExpmonth(), 12);
		selectbyvalue(booknow.getExpyear(), "2022");
		sendkey(booknow.getCvv(), "222");
		doubleclick(booknow.getBooknow());
		
		implicit();
		
		confirm = new Itinary_pom(driver);
		click(confirm.getConfirm());
		
		logout = new Logout_pom(driver);
		click(logout.getLogout());
		
		quit(driver);
		
	}

	
}
