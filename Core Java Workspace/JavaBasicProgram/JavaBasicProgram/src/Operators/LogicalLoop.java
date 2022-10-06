package Operators;

public class LogicalLoop {

	public static void main(String[] args) {
		//Variable Definition and initialization
		int num1=30, num2=20;
		boolean res1,res2;
		res1=(num1!=num2);
		res2=(num1<num2);
		System.out.println("Result1: "+res1);//t
		System.out.println("Result2: "+res2);//f
		
		//Logical AND
		System.out.println("bool1 && bool2 = " +(res1 && res2));//t
		
		//Logical OR
		System.out.println("bool1 || bool2 = " + (res1 || res2));//t
		
		//Logical Not
		System.out.println("!bool1 && bool2 = " + !(res1 && res2));//f
		
	}

}

/**loop 1
LHS & RHS result should be in boolean format
&& --> and

LHS && RHS ---> if both side are having result as true dn its will return true else false
true && true --> true
false && true --> false
true && false --> false

|| --> or

LHS || RHS --> if any one side return true dn the result will be true else false
true || true --> true
false || true --> true
true || false --> true
false || false ---> false

! --> not


*/