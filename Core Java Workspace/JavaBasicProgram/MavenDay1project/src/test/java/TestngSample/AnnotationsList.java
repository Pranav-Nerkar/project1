package TestngSample;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsList {
  @Test
  public void f1() {
  }
  @BeforeMethod
  public void f2() {
  }

  @AfterMethod
  public void f3() {
  }

  @BeforeClass
  public void f4() {
  }

  @AfterClass
  public void f5() {
  }

  @BeforeTest
  public void f6() {
  }

  @AfterTest
  public void f7() {
  }

  @BeforeSuite
  public void f8() {
  }

  @AfterSuite
  public void f9() {
  }
}