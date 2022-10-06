package ThisKeyword;

class Student102 {
	int rollno;
	float fee;

	Student102(int rollno) {
		this.rollno = rollno;
	
	}
	Student102(int rollno, float fee) {
		this.fee = fee;
		//this(rollno, name, course);// C.T.Error
	}
	void display() {
		System.out.println(rollno + " " + fee);
	}
}
public class ThisStatement4 {
	public static void main(String args[]) {
		Student102 s1 = new Student102(111);
		Student102 s2 = new Student102(112, 6000f);
		s1.display();
		s2.display();
	}
}