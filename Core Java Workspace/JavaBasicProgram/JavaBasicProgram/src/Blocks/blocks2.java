package Blocks;

public class blocks2 {
	int age = 24;
	double salary = 25000.00;
	float Acc = 12345.67f;
	double phone = 333456786;

	void display() {
		System.out.println("age : " + age);
		System.out.println("salary: " + salary);
	}
void print(){
System.out.println("Acc :" + Acc);
	System.out.println("phone : " + phone);
}
public static void main(String args[]) {
	System.out.println("main() Starts.. ");
	blocks2 b1 = new blocks2();
	b1.display();
	blocks2 b2 = new blocks2();
	b2.print();
	System.out.println("main() ends...");
	
}
/* non-static block or IIB*/
{
	salary=45000.32;
}
}