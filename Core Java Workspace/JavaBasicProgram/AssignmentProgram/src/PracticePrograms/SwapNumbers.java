package PracticePrograms;

public class SwapNumbers {
	public static void main(String[] args) {
		float x = 10.2f;
		float y = 20.5f;
		System.out.println("Program Starts");
		System.out.println("Before Swaping");
		System.out.println("value of x is" +x);
		System.out.println("value of y is" +y);
		//swap (x,y)
		
		float temp = x;
		 x = y;
		y = temp;
		System.out.println("After Swapping");
		System.out.println("value of x is" +x);
		System.out.println("value of y is" +y);
		System.out.println("Program Ends");
	}

}