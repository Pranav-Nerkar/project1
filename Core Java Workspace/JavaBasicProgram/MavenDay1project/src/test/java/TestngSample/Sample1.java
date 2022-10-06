package TestngSample;

import org.testng.annotations.Test;

public class Sample1 {
	int age = 25;
  @Test
  public void testcase1() {
	  System.out.println("I am test case1....");
	  String age = null;
	System.out.println("age: "+age);
	// display();
  }
}