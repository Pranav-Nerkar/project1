package Statements;

class ConstantVariable3 {
		final static int empId=25;
		final int acc=101;
		public static void main(String[] args) {
			
			final int AGE=15;//step 1
			System.out.println("age: "+AGE);
			System.out.println("SGV empId: "+empId);//step 2
			ConstantVariable3 c1=new ConstantVariable3();//object creation of constantvariable3
			System.out.println("NSGV acc: "+c1.acc);//step 3
		}
	}
	/*
	if we declare any global variable as final dn its mandatory to iniliatize at the same time
	final global variable will consider default value is they are not declared
	*/