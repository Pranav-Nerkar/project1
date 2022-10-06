package PropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		
		//Absolute path --> F:\JavaWorkspace\CoreJavaSessions\AppData\SignupDetails.properties
				String filePath = System.getProperty("user.dir") + "\\AppData\\SignupDetails.properties";
				System.out.println("Current Dir: " + filePath);
				// file location and filename
				// Absolute path
				FileInputStream fis = new FileInputStream(
						"D:\\Acceleration\\Core Java Workspace\\JavaBasicProgram\\Selenium Class\\src\\PropertyFile\\ReadPropertyFile.java");
				// or
				FileInputStream fis1 = new FileInputStream(filePath);
				// or relative path
				FileInputStream fis2 = new FileInputStream(".\\AppData\\SignupDetails.properties");

				// Create an instance of Properties class
				Properties prop = new Properties();

				// load property file using load() of properties class
				prop.load(fis2);
				
				//read data from property file using getProperty(string key)
				System.out.println("First Name: "+prop.getProperty("firstname"));
				System.out.println("Last Name: "+prop.getProperty("lastname"));
				System.out.println("Email ID: "+prop.getProperty("emailId"));
				System.out.println("Mobile: "+prop.getProperty("mobileNumber"));
	}

}
