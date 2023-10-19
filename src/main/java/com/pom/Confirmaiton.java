package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmaiton {
	
		
	
	@FindBy(id="radiobutton_0")
	private WebElement Selected_Hotels;
	
	public WebDriver driver;
	
	public Confirmaiton(WebDriver wb) {
		driver=wb;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSelected_Hotels() {
		return Selected_Hotels;
	}

	@FindBy (id="continue")
	private WebElement Continue;

	public WebElement getContinue() {
		return Continue;
	}
	
	@FindBy (id="cancel")
	private WebElement Cancel;

	public WebElement getCancel() {
		return Cancel;
	}

}
