package com.accenture.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	WebDriver driver;
	@FindBy(linkText="Log in")
	static WebElement Loginlink;
	public void clickLogin()
	{
		Loginlink.click();
	}
	
	

}
