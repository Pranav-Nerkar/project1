package overridings;
class Animal1{
	Animal1(){
		
	}
	public void move() {
		System.out.println("Animals are move");
	}
}
class dog extends Animal1{
	dog(){
		//super();
	}
	public void move() {
		System.out.println("Dogs can walk and run");
	}
public void bark() {
	System.out.println("Dogs can bark");
}
}
public class Overridings {

	public static void main(String[] args) {
		Animal1 a = new Animal1();//Animal references and object
		a.move();
		dog b = new dog();//Dog references but dog object
		b.move();
		b.bark();
		System.out.println("*******************************");
		Animal1 a1 = new dog();//you will get dog class move(),bark()
		a1.move();
		//a1.bark(); // a1 compile time error since b's reference type Animal doesn't
	}
	}