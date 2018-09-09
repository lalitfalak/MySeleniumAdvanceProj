import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Cookies {
	WebDriver driver;
  @Test
  public void Cookie1() {
	  
	  driver.get("http://demowebshop.tricentis.com//");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  Cookie c = new Cookie("User","Tricentis");
	  driver.manage().addCookie(c);
	  Set<Cookie> cookiesdetails = driver.manage().getCookies();
	  for(Cookie s:cookiesdetails)
	  {
		  System.out.println(s.getExpiry());
		  System.out.println(s.getName());
		  System.out.println(s.getDomain());
	  }
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\pdc2b-training.pdc2b\\Desktop\\drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
  }

}
