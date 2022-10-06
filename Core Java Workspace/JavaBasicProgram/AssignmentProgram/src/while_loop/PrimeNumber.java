package while_loop;

public class PrimeNumber {
	public static void main(String[] args) {

	    int num = 33, i = 2;
	    boolean result = false;
	    while (i <= num / 2) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        result = true;
	        break;
	      }

	      ++i;
	    }

	    if (!result)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");

}
}