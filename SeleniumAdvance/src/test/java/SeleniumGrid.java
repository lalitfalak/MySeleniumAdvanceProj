import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class SeleniumGrid {
	RemoteWebDriver driver;
	
  @Test
  public void f() {
	  driver.get("http://demowebshop.tricentis.com//");
	  driver.manage().window().maximize();
	  
  }
  @BeforeTest
  public void setup() throws MalformedURLException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\pdc2b-training.pdc2b\\Desktop\\drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  DesiredCapabilities dc = new DesiredCapabilities();
	  dc.setBrowserName("chrome");
	  dc.setPlatform(Platform.WINDOWS);
	  RemoteWebDriver d = new RemoteWebDriver(new URL("http://192.168.56.1:4340/wd/hub"), dc);
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
