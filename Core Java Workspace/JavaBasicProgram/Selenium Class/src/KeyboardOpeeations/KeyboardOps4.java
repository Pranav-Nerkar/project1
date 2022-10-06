package KeyboardOpeeations;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class KeyboardOps4 {

	public static void main(String[] args) throws InterruptedException {
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//to enter required application URL use get() of WebDriver interface
		driver.get("https://www.flipkart.com/");

		// using Escape of keyboard to avoid login popup
		WebElement element = driver.findElement(By.xpath("//body"));
		element.sendKeys(Keys.ESCAPE);
		//scrolling using page down button
		for (int i = 0; i < 10; i++) {
			element.sendKeys(Keys.PAGE_DOWN);
			Thread.sleep(1500);
		}
		
//		Thread.sleep(1500);
//		//Scrolling - directly goto bottom of the page
//		element.sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
//		Thread.sleep(1500);
//		//Scrolling- directly goto Top of the page
//		element.sendKeys(Keys.chord(Keys.CONTROL,Keys.HOME));

	}

}
