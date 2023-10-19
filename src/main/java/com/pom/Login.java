package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy(id="username")
	private WebElement user;

	public WebDriver driver;
	
	public Login(WebDriver wb) {
		
	driver=wb;
	PageFactory.initElements(driver,this);				
	}

	public WebElement getUser() {
		return user;
	}
	@FindBy(id="password")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	@FindBy(id="login")
	private WebElement loginpage;

	public WebElement getLoginpage() {
		return loginpage;
	}

}
