package com.practice;

import java.util.Scanner;

public class ScannerDemo {
	
	public static void main(String[] args) {
		
		int a = 4;
		int b = 6;
		int c = a+b;
		
		System.out.println("Addition: " + c);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 1st no: ");
		int x = sc.nextInt(); // 1st no stored in x variable
		System.out.println("Enter a 2nd no: ");
		double y = sc.nextDouble(); // 2nd no stored in y variable
		
		double z = x+y;
		System.out.println("Add: " + z);
		
		System.out.println("Enter a name");
		String str = sc.next(); // return name or sentences
		System.out.println(str);
		
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0); // return single character
		System.out.println(ch);
		
	}

}
