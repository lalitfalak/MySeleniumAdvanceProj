import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class RobotDemo {
WebDriver driver;
	
  @Test(enabled=false)
  public void demoRobot() throws AWTException {
	  
	  Robot r = new Robot();
	  // For Pressing Key
	  r.keyPress(KeyEvent.VK_WINDOWS);
	  // For releasing Key
	  r.keyRelease(KeyEvent.VK_WINDOWS);
	  
  }
  @Test
  public void Robotfileupload() throws AWTException, InterruptedException {
	  driver.get("https://www.timesjobs.com/candidate/register.html?pageFlow=TJ_HOME");
	  driver.findElement(By.id("resumeFile_basic")).click();
	  
	  Robot r = new Robot();
	  SetClipboarddata("C:\\Users\\pdc2b-training.pdc2b\\Downloads\\DeepikaFalak_Resume.doc");
	  Thread.sleep(1000);
	  r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_V);
	  
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  r.keyRelease(KeyEvent.VK_V);
	  
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
  }
  public void SetClipboarddata(String s)
  {
	  StringSelection S1 = new StringSelection(s);
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(S1, null);
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

