package FinalKeyword;

public class FinalKeyword3 {
	final int empid = 90;
	double salary = 34400.57;
	void run(){
		System.out.println("empid: " + empid);
	}
	public static void main(String args[]) {
		FinalKeyword3 obj = new FinalKeyword3();//object creation by finalkeyword3
		obj.run();
		System.out.println(obj.salary);
	}
}