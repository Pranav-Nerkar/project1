package ExceptionHandling;
import java.util.Scanner;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		System.out.println("program starts from here...");
		//1. abnormal statements
		int i,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first num1: ");
		i=sc.nextInt();
		System.out.println("Enter first num2: ");
		j=sc.nextInt();
		k= i/j;//ArithmeticException
		System.out.println("res: "+k);	
		System.out.println("Programs ends here...");
	}
}
/**
1. try ---> throws some exeception -----> catch() has to catch it
2. try ---> throws some exeception -----> catch() donesn't that type of declaration dn jvm will terminate the program execution
3. try ---> doesn't have any exception -----> dn catch block will not be executed
*/