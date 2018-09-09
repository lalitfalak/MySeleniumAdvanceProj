package com.accenture.CucumberTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.accenture.pages.HomePage;
import com.accenture.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
   WebDriver driver;
   HomePage h;
   LoginPage L;
   
   
	@Given("^When I am on the Tricentis login page$")
	public void when_I_am_on_the_Tricentis_login_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\pdc2b-training.pdc2b\\Desktop\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com//");
	driver.manage().window().maximize();
	    
	}

	@When("^I give abc and xyz$")
	public void i_give_abc_and_xyz() throws Throwable {
		 h = PageFactory.initElements(driver, HomePage.class);
		 L = PageFactory.initElements(driver, LoginPage.class);
		 h.clickLogin();
		 L.LoginData("lalit","falak");
	    
	}

	@When("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^I am able to login$")
	public void i_am_able_to_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
}
