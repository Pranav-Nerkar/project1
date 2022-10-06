package Constructor;
class A {
	int i = 10;
	A() {
		System.out.println("Running Class A constructor.."); // 2
	}
	void display() {
		System.out.println("I am display() of class A.");//3
	}
}
class X {
	int j = 10;
	X() {
		System.out.println("Running Class X constructor..");//5
	}
	void display() {
		System.out.println("I am display() of class X.");//6
	}
}
public class Cons4 {
	void display() {
		System.out.println("I am display() of class Cons4.");//8
	}
	public static void main(String args[]) {
		System.out.println("Main() of Class Cons4 is started..."); //1
//		When we create object then at that time constructor gets called
		A a1 = new A(); // object creation of class A
		a1.display(); // calling display method of class A
//		4th step
		System.out.println("Class A global varibale i = " + a1.i); // calling global variable of class A
		X x1 = new X();
		x1.display(); 
		System.out.println("Class X global varibale j = " + x1.j);//7
		Cons4 c1 = new Cons4();
		c1.display();
		System.out.println("Main() of Class Cons4 is ends here...");//9
	}

}