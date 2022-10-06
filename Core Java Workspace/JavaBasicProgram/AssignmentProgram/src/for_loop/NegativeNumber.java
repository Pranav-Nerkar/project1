package for_loop;

public class NegativeNumber {
	static void printFactorOfNegativeNumber(int num) {
		for (int i = num; i <= Math.abs(num); ++i) {
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
		
	    // negative number
	    int number = -60;
	    System.out.print("Factors of " + number + " are: ");

	    // run loop from -60 to 60
	    for(int i = number; i <= Math.abs(number); ++i) {

	      // skips the iteration for i = 0
	      if(i == 0) {
	        continue;
	      }
	      else {
	        if (number % i == 0) {
	          System.out.print(i + " ");
	        }
	      }
	    }
	  }
	}