package Inheritances;
//parent class
class fruit{
	fruit(){
		System.out.println("fruit class cons...");
	}
	public void taste() {
		System.out.println("fruits are sweet");
	}
}
//child class
class apple extends fruit{
	apple(){
		//super(); //java compiler will write default super()
		System.out.println("apple class cons...");
	}
	public void shape() {
		System.out.println("shape is circle");
	}
}
public class Inheritance2 {
	public static void main(String[] args) {
		apple fr = new apple();//object of child class
		fr.taste();//call method child class
		fr.shape();//call method parent class	
	}
}