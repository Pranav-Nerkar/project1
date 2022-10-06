package FinalKeyword;

public class FinalKeyword5 {
	int cube(final int n){//final int n = 5;
		System.out.println(n);//5 step 1
		  // n = n+2;  
		   return n*n*n;  
		  }
	public static void main(String args[]) {
		FinalKeyword5 b = new FinalKeyword5 ();//object creation by finalkeyword5
		System.out.println(b.cube(5));//125 step 2
	}
}