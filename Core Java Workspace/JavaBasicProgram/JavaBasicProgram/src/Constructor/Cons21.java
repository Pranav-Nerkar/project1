package Constructor;

public class Cons21 {
	int age;
	double salary;
	Cons21() {
		//step 1
		System.out.println("**********User Defined Zero-Param Constructor, start from here****************");
		age=25;
		salary=32506.56;
		//step 2
		System.out.println("**********User Defined Zero-Param Constructor, ends here****************");
	}
	public static void main(String[] args) {
		Cons21 c1 = new Cons21();
		System.out.println(c1.age);// 25
		System.out.println(c1.salary);// 0.0
	}
}
/*
as we learn, constructor is used to initialize non-static members of the class hence here we can 
see age variable value is getting initialize by constructor
*/