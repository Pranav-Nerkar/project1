package for_loop;

public class Uppercased {

	public static void main(String[] args) {

		char ch;//char variable declaration
		//Printing upper case Alphabets
		System.out.println("Uppercase Alphabets are: \n");
		for(ch='A'; ch<='Z'; ch++){
		System.out.print(ch+" ");
		//display uppercase Alphabets with space
		}
	}
	
	public static void printAlphabetsInUpperCase()
	
	{ 
		System.out.println("List of alphabets in upper case :");
	for(char i = 'A'; i <= 'Z'; i++) {
		System.out.println(i + " ");
	}
}
}