package com.practice;

// Do calculations using all types of functions, add(), sub(), multiply(), div()

public class Calculation {
	
	public void add() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("Addition = " + c);
	}
	
	public int add1() {
		int a = 20;
		int b = 20;
		int c = a + b;
		return c;
	}
	
	public void add2(int x, int y) {
		int z = x+y; // 10+20
		System.out.println("Addition = " + z);
	}
	
	public int add4(int x, int y) {
		int z = x+y;
		return z;
	}
	
	public void sub() {
		int a = 55;
		int b = 45;
		int c = a - b;
		System.out.println("Subtraction = " + c);
	}
	public int sub1() {
		int a = 34;
		int b = 23;
		int c = a - b;
		return c;
	}
	public void sub2(int x, int y) {
		float z = x-y; // 23.5-10.5
		System.out.println("Subtraction = " + z);
	}
	
	public int sub3(int x, int y) {
		int z = x-y;
		return z;
	}
	public void mul() {
		float a = 45.4f;
		int b = 20;
		float c = a * b;
		System.out.println("Multiplication = " +c);
	}
	public float mul1() {
		int a = 30;
		float b = 20.5f;
		float  c = a * b;
		return c;
	}
	public void mul2(int x , float y) {
		double z = x * y;
		System.out.println("Multiplication : " + z);
	}
	public float mul3(int x , long y) {
		float z = x * y;
		return z;
	}
	public void div() {
		int a = 30;
		int b = 40;
		int c = a / b;
		System.out.println("Division = " + c);
	}
	
	public int div1() {
		int a = 50;
		int b = 70;
		int c = a / b;
		return c;
	}
	
	public void div2(int x, int y) {
		int z = x/y; // 20/30
		System.out.println("Division = " + z);
	}
	
	public int div3(int x, int y) {
		int z = x/y;
		return z;
	}
	

	
	public static void main(String[] args) {
		
//		object create using constructor
		Calculation c = new Calculation();
		
//		function call
		c.add();
		int d = c.add1();
		System.out.println("Addition: " + d);
		c.add2(30, 20);
		int e = c.add4(40, 20);
		System.out.println("Addition = " + e);
		c.sub();
		int f = c.sub1();
		System.out.println("Subtraction = " + f);
		c.sub2(30,40);
		int g = c.sub3(50,67);
		System.out.println("Subtraction = " +g);
		c.mul();
		float h = c.mul1();
		System.out.println("Multiplication = " +h);
		c.mul2(23, 34);
		float i = c.mul3(34, 45);
		System.out.println("Multiplication = " +i);
		c.div();
		int j = c.div1();
		System.out.println("Division: " + j);
		c.div2(30, 20);
		int k = c.div3(40, 20);
		System.out.println("Division = " + k);
	}
}
/*
	  *************************Points to remember*************************
	  
	  1. If method has return type then print statement given in main method and if method has
	  no return type then print statement in that method.
	  
	  2. If method have parameters then values passed from main method and if method doesn't have
	  parameters then mention variables in that method.
*/