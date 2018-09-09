package com.accenture.tests;

import org.testng.annotations.Test;

import com.accenture.pages.HomePage;
import com.accenture.pages.LoginPage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class Login {
WebDriver driver;	
HomePage h;
LoginPage L;

  @Test
  public void testLogin() {
	  driver.get("http://demowebshop.tricentis.com//");
	  driver.manage().window().maximize();
	  h.clickLogin();
	  L.LoginData("lalit","falak");
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\pdc2b-training.pdc2b\\Desktop\\drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  h = PageFactory.initElements(driver, HomePage.class);
	  L = PageFactory.initElements(driver, LoginPage.class);
	  
	  	  
  }


}
