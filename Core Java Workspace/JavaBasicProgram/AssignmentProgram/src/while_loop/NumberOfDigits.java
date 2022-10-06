package while_loop;

public class NumberOfDigits {

	 static int countDigit(long n)
	    {
	        int count = 0;
	        while (n != 0) {
	            n = n / 10;
	            ++count;
	        }
	        return count;
	    }
	 
	    /* Driver code */
	    public static void main(String[] args)
	    {
	        long n = 345289467;
	        System.out.print("Number of digits : "
	                         + countDigit(n)); 
	}

}