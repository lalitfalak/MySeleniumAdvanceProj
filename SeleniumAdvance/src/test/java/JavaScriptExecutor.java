import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class JavaScriptExecutor {
	WebDriver driver;
	
  @Test()
  public void JavaScriptExec() throws InterruptedException {
	  driver.get("http://demowebshop.tricentis.com//");
	  driver.manage().window().maximize();
	  JavascriptExecutor j=(JavascriptExecutor)driver;
	  j.executeScript("window.scroll(0,800)");
	  Thread.sleep(5000);
	  j.executeScript("alert('Hi')");

		 
	  
	  
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
