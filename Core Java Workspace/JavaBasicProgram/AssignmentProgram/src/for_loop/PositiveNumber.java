package for_loop;

public class PositiveNumber {
	//Positive Number
	static void printFactorOfPositiveNumber(int num) {
		for (int i = 0; i <= num; ++i) {
			if (i == 0) {
				continue;
			} else {
				if (num % i == 0) {
					System.out.print(i + ", ");
				}
			}
		}
	}
	public static void main(String[] args) {
		int number = 60;

	    System.out.print("Factors of " + number + " are: ");

	    // loop runs from 1 to 60
	    for (int i = 1; i <= number; ++i) {

	      // if number is divided by i
	      // i is the factor
	      if (number % i == 0) {
	        System.out.print(i + " ");
	      }
	    }
	  }
	}	