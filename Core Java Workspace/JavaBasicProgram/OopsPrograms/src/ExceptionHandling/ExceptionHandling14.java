package ExceptionHandling;
import java.util.Scanner;
public class ExceptionHandling14 {
	// defining a method
		public int divideNum(int m, int n)
		{
			int div = m / n;
			return div;
		}

		// main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionHandling14 obj = new ExceptionHandling14();
		Scanner sc=new Scanner(System.in);	
		int num1,num2;
		System.out.println("Enter two numbers: ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		try {
			System.out.println(obj.divideNum(num1,num2));
		} catch (ArithmeticException e) {
			System.out.println("\nNumber cannot be divided by 0 "+e);
		}
		System.out.println("Rest of the code..");
	}

}
