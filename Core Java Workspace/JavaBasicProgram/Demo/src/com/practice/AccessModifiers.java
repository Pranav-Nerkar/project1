package com.practice;

public class AccessModifiers  {

//	access anywhere
	public void m1() {
		
	}
	
//	access within the package and if want to access outside the package then it should be
//	subclass variable
	protected void m2() {
		
	}

//	access within the package
	void m3() {
	
	}

//	access within the class
	private void m4() {
	
	}
	
//	Access Modifiers: public , private protected, default
	public static void main(String[] args) {
		
		AccessModifiers am = new AccessModifiers();
		am.m1();
		am.m2();
		am.m3();
		am.m4();
	}
}
