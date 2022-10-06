package Constructor;

class B {
	int i = 10;
	B() {
		System.out.println("Running Class B constructor..");//step 2 and step 4
		i = 23;
	}
}

public class Cons6 {
	public static void main(String args[]) {
		System.out.println("Main() of Class Cons6 is started...");//step 1
		B b1 = new B();//object creation of class B
		//step 3
		System.out.println("Class B global varibale i = " + b1.i);//calling global variable of class B
		System.out.println("======================================");
		B b2 = new B();
		System.out.println("Class B global varibale i = " + b2.i);//step 5
		System.out.println("Main() of Class Cons6 is ends here...");//step 6
	}
}
//constructor overloading & blocks