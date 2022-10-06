package testngexamples;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import Utilities.SeleniumUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestParallelExecution extends SeleniumUtility{
  @Test
  public void testLoginOfVtiger() {
	  WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		/*implicit wait*/
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*maximize browser window*/
		driver.manage().window().maximize();
			driver.get("https://demo.vtiger.com/vtigercrm/index.php");
			driver.findElement(By.id("username")).clear();
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("Test@123");
			driver.findElement(By.id("password")).sendKeys(Keys.ENTER); 
  }
  @Test
	public void testLoginOfActitime() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		/*implicit wait*/
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*maximize browser window*/
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");		 
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
			driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys(Keys.ENTER);
	}
}
