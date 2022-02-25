Feature: Hotel Booking In Adactin Application 
Scenario: Login Page 
	Given User Launch The Adactin Application 
	When User Enter The Username In Username Field 
	And User Enter The Password In Password Field 
	Then User Click On The Login Button And Adactin Application Navigates To Search Hotel Page 
	
Scenario: Search Hotel Page 
	Given User Select The Location Of The Hotel 
	And User Select The Hotel Recuired From The List Of Hotel 
	And User Select The Room Type 
	And User Select Number Of Rooms 
	And User Select Check In Date 
	And User Select Check out Date 
	And User Select Adults Per Room 
	And User Select Childrens Per Room 
	Then User Click On The Search Button And Adactin Application Navigates To Select Hotel Page 
	
Scenario: Select Hotel Page 
	Given User Select The Hotel From The List Of Hotel 
	When  User Click The Continue Button And Adactin Application Navigates To Book A Hotel Page 
	
Scenario: Book A Hotel Page 
	Given User Enter The First Name In  First Name Field 
	And  User Enter The Last Name In  Last Name Field 
	And User Enter The Address In  Billing Address Field 
	And User Enter The Credit Card No On Credit Card No Field 
	And User Select The Credit Card Type 
	And User Select The Expiry Date 
	And User Select The Expiry Year 
	And User Enter The Cvv No On Cvv Number Field 
	Then User Click The Book Now Button And Adactin Application Navigates To Booking Confirmation Page 
	
Scenario: Confirm The Hotel Booking 
	Given User Verify The Hotel And Click My Itinerary Button 
	
	
Scenario: Logout Page 
	Given User Click The Logout Button 
	
	
   