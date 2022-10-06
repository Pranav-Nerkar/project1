package KeyboardOpeeations;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboardops3 {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//to enter required application URL use get() of WebDriver interface
		driver.get("http://demo.automationtesting.in/Register.html");
		
		//identify first name input field
		WebElement firstName=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		//type first name as admin and use ctrl+a
		firstName.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));//type admin and select all
		//in first name field use ctrl+c
		firstName.sendKeys(Keys.chord(Keys.CONTROL,"c"));//copy the content
		//in last name field use ctrl+v
		driver.findElement(By.cssSelector("input[placeholder='Last Name']"))
					.sendKeys(Keys.chord(Keys.CONTROL,"v"));//paste the first name in the last name field
		

	}
}