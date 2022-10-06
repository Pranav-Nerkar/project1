package com.practice;

public class DemoClass {
	
//	global variable
	int a = 10; 
	int b = 20;
	
//	function/method
	public void m1() {
//		local variable
		int x = 2;
		System.out.println("This is method m1" + x);
	}
	
//	non-primitive return type --> String, class type
	public String dc() {
		return "abc";
	}
	
	public void m2() {
		int c = 1;
	}
	
//	static block
	static {
		int a = 30;
		System.out.println("a = " + a);
	}
	
//	non-static block
	{
		int n = 6;
		System.out.println("n = " + n);
	}
	
//	constructor
	public DemoClass() {
		int p = 40;
		System.out.println("This is constructor");
	}
	
//	main method
	public static void main(String[] args) {
		int d = 5;
	}
	
//	function with no return type and no parameters
	public void a1() {
		
	}
	
//	function with return type and no parameters
	public int a2() {
		return 1;
	}
	
//	function no return type and with parameters
	public void a3(int x, int y) {
		
	}
	
//	function with return type and with parameters
	public int a4(int v, int u) {
		return 10;
	}

}
