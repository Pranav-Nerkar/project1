package Constructor;
class C {
	double i;
	C(double j) {
		System.out.println("Running Class C constructor..");//(step 2 and step 5) 
		i = j;
	}
}

public class Cons5 {
	public static void main(String args[]) {
		System.out.println("Main() of Class Cons5 is started...");//1
		C b1 = new C(25.34);//object creation of class c 
		//step 3
		System.out.println("Class C global varibale i = " + b1.i);//calling global variable of class c
		b1.i=14.65;
		System.out.println("Class C global varibale i = " + b1.i);//step 4
		System.out.println("======================================");
		C b2 = new C(55.32);
		System.out.println("Class C global varibale i = " + b2.i);// step 6
		System.out.println("Main() of Class Cons5 is ends here...");//step 7
	}
}
/*
what is the use of parameterized constructor?
with the help of parameterized constructor, for every instance we can initialize different value of non-static variables

*/