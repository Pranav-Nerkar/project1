package Constructor;

public class Cons3 {
	
	int roll;
	double salary;
	Cons3(int r , double s){
		roll = r;
		salary = s;
	}
	void display() {
		System.out.println(roll + " " + salary );
	}
	public static void main (String[] args) {
		Cons3 c1 = new Cons3(101,22.345);//constructor calling
		c1.display();//calling a display method of cons3
		Cons3 c2 = new Cons3(201,34.456);
		c2.display();

	}	
}

/*
parameterized constructor: is used to initialize different values non-static variable at the time of object creation

*/