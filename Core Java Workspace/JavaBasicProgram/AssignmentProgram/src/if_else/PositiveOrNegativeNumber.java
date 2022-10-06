package if_else;

public class PositiveOrNegativeNumber {
	public static void main(String[] args) {
		int number = 5;
		if (number > 0) {
			System.out.println("POSITIVE number");
		} else if (number < 0) {
			System.out.println("NEGATIVE number");
		} else {
			System.out.println("ZERO");
		}
	}
}