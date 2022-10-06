package Blocks;

class Demo {
	// global variable ---> Static and non static global variable
	static int age;
	double salary;
	//constructor ----> can have overloading constructor
	Demo(){
		System.out.println("I am zero param constructor of ClassBody..");
	}
	// blocks -----> static and non-static block
	static {
		age = 34;
		System.out.println("I am Static block");
	}
	{
		salary = 345555.90;
		System.out.println("I am non-static block");
	}

	// method or function -----> can have static or non-static static method with
	// local variables
	static void display() {
		System.out.println("I am static display");
	}

	void print() {
		System.out.println("I am non static print");
	}

	// method overloading
	public void age(int number) {
		System.out.println("age : " + age);
	}

	public class Classbody2 {
		// global variable ---> Static and non static global variable
		int rollno;
		double phoneno;
		//constructor ----> can have overloading constructor
		Classbody2(){
			System.out.println("I am a zero-parameterized constructor");
		}
		// blocks -----> static and non-static block
		{
			rollno = 20;
			System.out.println("I am Static block");
		}
		{
			phoneno = 345555.90;
			System.out.println("I am non-static block");
		}

		// method or function -----> can have static or non-static static method with
		// local variables
		void display() {
			System.out.println("I am static display");
		}

		void print() {
			System.out.println("I am non static print");
		}

		// method overloading
		public void phoneno(int number) {
			System.out.println("rollno : " + rollno);
		}

		public void phoneno(float number) {
			System.out.println("phoneno : " + phoneno);
		}
	}

	public static void main(String args[]) {
		age = 24;
		System.out.println("value of age is : " +age);
		System.out.println("I am non-static block");
		
	}
}