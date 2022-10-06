package ThisKeyword;
class A2 {
	A2() {
		this(5);
		System.out.println("hello a");
	}
	A2(int x) {
		System.out.println(x);
	}
}

public class ThisStatement2 {
	public static void main(String args[]) {
		A2 a = new A2(10);
	}
}