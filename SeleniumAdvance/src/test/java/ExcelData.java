import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ExcelData {
WebDriver driver;
  @Test
  public void dataExcel() throws InterruptedException, IOException {
	  
	  driver.get("http://demowebshop.tricentis.com//");
	  driver.manage().window().maximize();
	  FileInputStream fin = new FileInputStream("C:\\Lalit_Selenium_Advace\\SeleniumAdvance\\Logindetails.xlsx");
	  XSSFWorkbook H = new XSSFWorkbook(fin); 
	  XSSFSheet s = H.getSheetAt(0);
	  
	  System.out.println("Test Excel");
	  int rowcount = s.getLastRowNum();
	  	 
	  for(int i=1;i<=rowcount;i++)
	  {
		  String Username = s.getRow(i).getCell(0).getStringCellValue();
		  String Password = s.getRow(i).getCell(1).getStringCellValue();
		  logintest(Username,Password);
		  try
		  {
			driver.findElement(By.linkText("Log out")).click();  
		  }catch (Exception e) {
			
		}
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
  
  public void logintest(String username, String password) throws InterruptedException
  {
	  driver.findElement(By.className("ico-login")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.id("Email")).sendKeys("myemail");
	  driver.findElement(By.id("Password")).sendKeys("mypass");
	  driver.findElement(By.className("button-1 login-button")).click();
  }

}
