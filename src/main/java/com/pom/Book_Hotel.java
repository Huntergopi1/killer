package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	@FindBy (id="first_name")
	private WebElement First_name;
	
	
	public WebDriver driver;
	
	public Book_Hotel(WebDriver wb) {
		
		driver= wb;
		PageFactory.initElements(driver,this);		
		
	}

	public WebElement getFirst_name() {
		return First_name;
	}
	
	@FindBy(id="last_name")
	private WebElement Last_name;

	public WebElement getLast_name() {
		return Last_name;
	}
	
	@FindBy(id="address")
	private WebElement Billing_Address;

	public WebElement getBilling_Address() {
		return Billing_Address;
	}
	
	@FindBy (id="cc_num")
	private WebElement Credit_Card_no;

	public WebElement getCredit_Card_no() {
		return Credit_Card_no;
	}
	
	
	@FindBy(id="cc_type")
	private WebElement Credit_card_type;

	public WebElement getCredit_card_type() {
		return Credit_card_type;
	}
	
	@FindBy (id="cc_exp_month")
	private WebElement Expire_date;

	public WebElement getExpire_date() {
		return Expire_date;
	}
	
	
	@FindBy(id="cc_exp_year")
	private WebElement Expire_year;

	public WebElement getExpire_year() {
		return Expire_year;
	}
	
	
	@FindBy(id="cc_cvv")
	private WebElement Cvv_number;

	public WebElement getCvv_number() {
		return Cvv_number;
	}
	
	
	@FindBy(id="book_now")
	private WebElement Book_new;

	public WebElement getBook_new() {
		return Book_new;
	}
	
	
	
}
