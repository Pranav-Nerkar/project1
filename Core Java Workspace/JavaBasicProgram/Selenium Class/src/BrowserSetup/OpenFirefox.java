package BrowserSetup;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) {
		//Absolute path
				String driverPath1="D:\\Acceleration\\Core Java Workspace\\JavaBasicProgram\\Selenium Class\\src\\BrowserSetup\\OpenFirefox.java";
				//or Relative path --> '.' indicate current working dir
				String driverPath2=".\\executables\\geckodriver.exe";
				//or using System class
				String driverPath3=System.getProperty("user.dir")+"\\executables\\geckodriver.exe";
				//Set the driver executable path using System.setProperty(String key,String value)
				System.setProperty("webdriver.gecko.driver", driverPath3);
				//create an instance of required browser class
				FirefoxDriver fdriver=new FirefoxDriver();

	}

}