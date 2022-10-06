package BrowserSetup;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class OpenIE {

	public static void main(String[] args) {
	
		//Absolute path
				String driverPath1="D:\\Acceleration\\Core Java Workspace\\JavaBasicProgram\\Selenium Class\\src\\BrowserSetup\\OpenIE.java";
				//or Relative path --> '.' indicate current working dir
				String driverPath2=".\\executables\\IEDriverServer.exe";
				//or using System class
				String driverPath3=System.getProperty("user.dir")+"\\Executables\\IEDriverServer.exe";
				//Set the driver executable path using System.setProperty(String key,String value)
				System.setProperty("webdriver.ie.driver", driverPath3);
				//create an instance of required browser class
				InternetExplorerDriver idriver=new InternetExplorerDriver();
	}
}