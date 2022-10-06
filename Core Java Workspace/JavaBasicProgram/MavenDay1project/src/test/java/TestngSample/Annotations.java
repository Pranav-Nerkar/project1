package TestngSample;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Annotations {
  @Test
  public void taskCreation() {
	  System.out.println("Create new task");
  }
  @BeforeTest
  public void setUp() {
	  System.out.println("Open browser and login into application");
  }

  @AfterTest
  public void cleanUp() {
	  System.out.println("logout and close browser");
  }
}