package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Room_Book {
	
	@FindBy(id="location")
	private WebElement Location;

	
	public WebDriver driver;
	public Room_Book(WebDriver wb) {
		
		driver=wb;
		PageFactory.initElements(driver, this);
		
		
	}

	public WebElement getLocation() {
		return Location;
	}
	
	@FindBy(id="hotels")
	private WebElement Hotels;

	public WebElement getHotels() {
		return Hotels;
	}
		
	@FindBy(id="room_type")
	private WebElement Room_types;

	public WebElement getRoom_types() {
		return Room_types;
	}
	
	
	
	@FindBy(id="room_nos")
	private WebElement No_of_Rooms;

	public WebElement getNo_of_Rooms() {
		return No_of_Rooms;
	}
	
	
	@FindBy(id="datepick_in")
	private WebElement Check_in_date;

	public WebElement getCheck_in_date() {
		return Check_in_date;
	}
	
	@FindBy(id="datepick_out")
	private WebElement Check_out_date;

	public WebElement getCheck_out_date() {
		return Check_out_date;
	}
	
	@FindBy(id="adult_room")
	private WebElement Adults_per_room;

	public WebElement getAdults_per_room() {
		return Adults_per_room;
	}
	
	@FindBy(id="child_room")
	private WebElement Childer_per_room;

	public WebElement getChilder_per_room() {
		return Childer_per_room;
	}
	
	
	@FindBy(id="Submit")
	private WebElement Search;

	public WebElement getSearch() {
		return Search;
	}
	
	@FindBy(id="Reset")
	private WebElement Reset;

	public WebElement getReset() {
		return Reset;
	}
	
	@FindBy(xpath = "//a[@href=\"SearchHotel.php\"]")
	private WebElement SearchHotels;

	public WebElement getSearchHotels() {
		return SearchHotels;
	}
	
	@FindBy(xpath = "//a[@href=\"BookedItinerary.php\"]")
	private WebElement Booked_Iternary;

	public WebElement getBooked_Iternary() {
		return Booked_Iternary;
	}
	
	@FindBy(xpath = "//a[@href=\"ChangePassword.php\"]")
	private WebElement Change_Password;

	public WebElement getChange_Password() {
		return Change_Password;
	}
	
	
	@FindBy(xpath = "//a[@href=\"Logout.php\"]")
	private WebElement Logout;

	public WebElement getLogout() {
		return Logout;
	}
	

}
