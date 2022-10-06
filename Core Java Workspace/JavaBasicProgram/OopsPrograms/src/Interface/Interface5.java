package Interface;
//Interface
interface Animal0 {
	int age=20;//by default public static final
	public void animalSound(); // interface method (does not have a body)
	public void sleep(); // interface method (does not have a body)
}
//Pig "implements" the Animal interface
class Pig7 implements Animal0 {
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	}
	public void sleep() {
		// The body of sleep() is provided here
		System.out.println("Zzz");
	}
}

public class Interface5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pig7 myPig = new Pig7(); // Create a Pig object
		myPig.animalSound();
		myPig.sleep();
		System.out.println(Animal0.age);
		//Animal0.age=200; 

	}

}
