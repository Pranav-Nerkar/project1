package TestngSample;

import org.testng.annotations.Test;
/**
 * when you catch the exception at test case level
 */
public class Actitime_ExceptionAndTimeout {
  @Test(expectedExceptions=ArithmeticException.class)
  public void dividedByZeroExample1() {
	  System.out.println("Exception test");
		int e = 1/0;
//		int age[]=new int[5];
//		age[5]=100;
		System.out.println("Exception handling done");
	}
	@Test(timeOut=1000) // specify time in milliseconds
	public void executetimeOut() throws InterruptedException{
		//Thread.sleep(3000);
           Thread.sleep(500);
  }
}