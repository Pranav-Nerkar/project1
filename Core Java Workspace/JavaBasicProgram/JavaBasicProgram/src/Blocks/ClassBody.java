package Blocks;

public class ClassBody {
	//Global Variable ---> Static and non-static global variable
		static int age;
		double salary;
		//blocks---> static and non-static block
		static {
			age=32;
			System.out.println("I am static initilization block or SIB");
		}
		
		{
			salary=55000.45;
			System.out.println("I am non-static initilization block or Instance Initilization block or IIB");
		}
		//constructor ----> can have overloading constructor
		ClassBody(){
			System.out.println("I am zero param constructor of ClassBody..");
		}
		// method or function ---> can have static or non-static method
		static void display() {
			System.out.println("I am static display()");
		}
		void print() {
			System.out.println("I am non-static print()");
		}
		public static void main(String[] args) {
			
		}
	}