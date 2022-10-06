package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		String currentWorkingDir=System.getProperty("user.dir");/*F:\\JavaWorkspace\\SeleniumClass*/
		String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//ChromeDriver cdriver=new ChromeDriver(); //or
				//creating an instance of Chrome browser and up-casting it to WebDriver interface
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://www.facebook.com/");
				
				//type username as admin
				WebElement username=driver.findElement(By.id("username"));
				/**
				 * Once the WebElement is identified you can perform any of the below mentioned operations depending on 
				 * requirement 
				 * Operation: type  ----------> sendKeys("textToBeTyped");
				 * 			 click  ----------> click();
				 * 			existing delete---> clear()
				 */
				username.clear();
				username.sendKeys("admin");
				//identify password field
				WebElement pwd=driver.findElement(By.name("password"));
				//perform required operation
				pwd.clear();
				pwd.sendKeys("Test@123");
				//identify password field
				WebElement submitBtn=driver.findElement(By.className("buttonBlue"));
				//perform required operation
				submitBtn.click();
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getPageSource().length());
				//close the browser
				driver.close();

	}

}
