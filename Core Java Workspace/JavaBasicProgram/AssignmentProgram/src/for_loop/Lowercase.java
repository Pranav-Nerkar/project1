package for_loop;

public class Lowercase {

	public static void main(String[] args) {

		char ch;//char variable declaration
		//Printing lower case Alphabets
		System.out.println("Lowercase Alphabets are: \n");
		for(ch='a'; ch<='z'; ch++){
		System.out.print(ch+" ");
		//display lowercase Alphabets with space
	}
	}

	public static void printAlphabetsInLowerCase() {
		System.out.println("List of alphabets in lower case :");
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.println(i + " ");
		}

	}

}