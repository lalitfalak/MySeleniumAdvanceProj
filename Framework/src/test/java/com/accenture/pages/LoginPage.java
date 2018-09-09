package com.accenture.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	@FindBy(id="Email")
	static WebElement TextBox_username;
	@FindBy(id="Password")
	static WebElement TextBox_password;
	
	
	public void LoginData(String u,String p)
	{
		TextBox_username.sendKeys(u);
		TextBox_password.sendKeys(p);
	}
	
		

}
