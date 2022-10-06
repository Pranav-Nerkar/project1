package testngexamples;

import org.testng.annotations.Test;

public class TestParallelClassTwo {
  @Test
  public void testCaseThree() {
	//Printing class name and Id of the thread on using which test method got executed
			System.out.println("Test Case Three in " + getClass().getSimpleName()
					+ " with Thread Id:- " + Thread.currentThread().getId());
  }
  @Test
	public void testCaseFour() {
		//Printing class name and Id of the thread on using which test method got executed
		System.out.println("Test Case Four in " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
	}
}