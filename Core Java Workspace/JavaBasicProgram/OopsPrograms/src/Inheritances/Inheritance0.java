package Inheritances;
class A{
	static int a = 10;
	int b = 20;
	double c = 13.45;
}

class B{
	static int x = 30;
	int y = 40;
	double z = 20.45;
}

class C{
	static int p = 50;
	int q = 60;
	double r = 50.65;
}
public class Inheritance0 {

	public static void main(String[] args) {
		//Access static member
		System.out.println("class A is static variable: " +A.a);
		System.out.println("class B is static variable: " +B.x);
		System.out.println("class c is static variable: " +C.p);
		
		//Access non-static member
		A a1 = new A();
		System.out.println("class A is non-static variable: " +a1.b);
		System.out.println("class A is non-static variable: " +a1.c);
		
		B b1 = new B();
		System.out.println("class B is non-static variable: " +b1.y);
		System.out.println("class B is non-static variable: " +b1.z);
		
		C c1 = new C();
		System.out.println("class C is non-static variable: " +c1.q);
		System.out.println("class C is non-static variable: " +c1.r);

	}
}