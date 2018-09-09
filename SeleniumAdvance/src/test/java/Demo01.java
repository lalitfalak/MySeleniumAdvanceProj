import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Demo01 {
	WebDriver driver;
  @Test
  public void demoTest() {
	  driver.get("http://demowebshop.tricentis.com//");
	  driver.manage().window().maximize();
	  Actions a = new Actions(driver);
	  //does the right click on page
	  //a.contextClick().build().perform();
	  driver.findElement(By.linkText("Log in")).click();
	  WebElement email = driver.findElement(By.id("Email"));
	  //send the text in CAPSss
	  a.moveToElement(email).keyDown(email, Keys.SHIFT).sendKeys("lalit").build().perform();
	  
			  	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\pdc2b-training.pdc2b\\Desktop\\drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  	  
  }

  @AfterTest
  public void afterTest() {
	 // driver.quit();
  }
 
}
