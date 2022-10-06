package ThisKeyword;

	class A {
		void m() {
			System.out.println("hello m");//step4
		}

		void n() {
			System.out.println("hello n");//step3
			// m();//same as this.m()
			this.m();
			//m();
		}
	}
	class ThisKeyword3 {

		void methodOne() {
			System.out.println("Inside Method ONE");//step 1
		}
		void methodTwo() {
			System.out.println("Inside Method TWO");//step 2
			this.methodOne();// same as calling methodOne()
			//methodOne();
		}
		public static void main(String args[]) {
			ThisKeyword3 obj = new ThisKeyword3();//object creation of This keyword 3
			obj.methodTwo();
			A a = new A();
			a.n();
}
}