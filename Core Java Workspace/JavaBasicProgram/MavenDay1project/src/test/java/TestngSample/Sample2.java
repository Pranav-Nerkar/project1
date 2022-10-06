package TestngSample;

import org.testng.annotations.Test;

public class Sample2 {
	int age = 25;
	@Test
  public void testcase1() {
		  System.out.println("hi");
  }
	@Test
	  public void testCase2() {
		  System.out.println("I am test case2....");
		  System.out.println("age: "+age);
	  }
	@Test
	  public void testCase3() {
		  System.out.println("I am test case3....");
		  System.out.println("age: "+age); 
  }
}