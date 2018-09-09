import org.testng.annotations.Test;




import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ScreenShot {

	WebDriver driver;
	
  @Test
  public void TakeScreenshot() throws IOException {
	  driver.get("http://demowebshop.tricentis.com//");
	  TakesScreenshot t =(TakesScreenshot)driver;
	  File f = t.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(f,new File("C:\\Lalit_Selenium_Advace\\SeleniumAdvance\\Screenshot\\sample.jpg") );
	
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
