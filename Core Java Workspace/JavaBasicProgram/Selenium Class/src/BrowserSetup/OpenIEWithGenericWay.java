package BrowserSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class OpenIEWithGenericWay {

	public static void main(String[] args) {
		//Absolute path
				String driverPath1="D:\\Acceleration\\Core Java Workspace\\JavaBasicProgram\\Selenium Class\\src\\BrowserSetup\\OpenIEWithGenericWay.java";
				//or Relative path --> '.' indicate current working dir
				String driverPath2=".\\Executables\\IEDriverServer.exe";
				//or using System class
				String driverPath3=System.getProperty("user.dir")+"\\Executables\\IEDriverServer.exe";
				//Set the driver executable path using System.setProperty(String key,String value)
				System.setProperty("webdriver.ie.driver", driverPath3);
				//create an instance of required browser class
				WebDriver driver=new InternetExplorerDriver();

	}

}
