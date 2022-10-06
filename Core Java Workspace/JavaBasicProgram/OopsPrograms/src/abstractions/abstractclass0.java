package abstractions;
abstract class Demo3 {// 50% abstract
	abstract void print();//abstract method/incomplete method
	void display() {// normal or non-abstract or concrete method or complete method
		System.out.println("I am a non-abstract method display()..");
	}
}
abstract class Demo {//0% abstract
	void display() {
		System.out.println("I am a non-abstract method display()..");
	}
	void display2() {
		System.out.println("I am a non-abstract method display()..");
	}
}
abstract class Demo2 {//100% abstract
	abstract void print();
	abstract void print1();
	abstract void print2();
}
public class abstractclass0 {

	public static void main(String[] args) {
		

	}

}
/**
 * class declared with Abstract keyword known as abstract class, 0 to 100% abstract
 * it will have
 * 			- abstract method ----> method declared with abstract keyword without body
 * 			- non-abstract method --> normal method/concrete method
 * 			- constructor
 *  		- static method
 *  		- global
**/