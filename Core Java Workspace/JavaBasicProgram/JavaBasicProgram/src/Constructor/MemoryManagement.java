package Constructor;

public class MemoryManagement {
	static int salary;
	int empId;	
	void display() {
		System.out.println("I am display()...");//step 4 ,step 8
	}
	static void print() {
		System.out.println("I am print()...");//step2
	}
	public static void main(String[] args) {
		//access static members---> static variable and method
		System.out.println("static variable salary: "+MemoryManagement.salary);//0 step1
		MemoryManagement.print();		
		//access non static members---> non-static variable and method
		MemoryManagement m1=new MemoryManagement();//object creation of memory management
		System.out.println("non-static variable empId: "+m1.empId);//0 step3
		m1.display();		
		//update static member
		MemoryManagement.salary=25000;
		System.out.println("update static variable salary: "+MemoryManagement.salary);//25000 step5
		//update non-static member
		m1.empId=205;
		System.out.println("update non-static variable empId: "+m1.empId);//205	 step6	
		MemoryManagement m2=new MemoryManagement();//object creation of memory management
		System.out.println("2nd instance non-static variable empId: "+m2.empId);//0 step7
		m2.display();
	}

}
