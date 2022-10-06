package for_loop;

public class PrimeNumber {
	public static void main(String[] args) {
    int num = 29;
    boolean result = false;
    for (int i = 2; i <= num / 2; ++i) {
      // condition for non prime number
      if (num % i == 0) {
        result = true;
        break;
      }
    }

    if (!result)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");

}
}