package if_else;

public class Leap_Year {
		int year = 2000;
			public static void checkLeapYear(int year) {
		        if (year % 400 == 0) {
		            System.out.println(year + " is a leap year.");
		        } else if (year % 100 == 0) {
		            System.out.println(year + " is not a leap year.");
		        } else if (year % 4 == 0) {
		            System.out.println(year + " is a leap year.");
		        } else {
		            System.out.println(year + " is not a leap year.");
		        }

		    }

		    public static void main(String[] args) {
		        // Examples
		        checkLeapYear(1998);
		        checkLeapYear(2000);
		    }
}