package Pyramid;

public class PyramidEx2 {
	public static void main(String args[]) {
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();	
		}
		System.out.println("*************************");
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();	
		}
		System.out.println("*************************");
		for(char i='a'; i<'e'; i++) {
			for(char j='a'; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();	
		}
	}
}
