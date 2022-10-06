package KeyboardOpeeations;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOps2 {

	public static void main(String[] args) throws InterruptedException {
		
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//to enter required application URL use get() of WebDriver interface
		driver.get("https://demo.actitime.com/login.do");
		
		//login in actitime application using Enter key
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
	}
}