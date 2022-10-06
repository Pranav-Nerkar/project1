package Utilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtility {

	public static void main(String[] args) {
		System.out.println(getRequiredDateBasedOnNumberOfDays("dd MM yyyy HH:mm:ss", -3));
		System.out.println(getRequiredDateBasedOnNumberOfDays("dd/MM/yyyy", -3));
		System.out.println(getRequiredDateBasedOnNumberOfDays("dd MMM yyyy", -3));
	}
	
	public static String getRequiredDateBasedOnNumberOfDays(String format, int numberOfDays) {

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, numberOfDays);
		SimpleDateFormat s = new SimpleDateFormat(format);
		return s.format(new Date(cal.getTimeInMillis()));
	}

	public static String getRequiredDateBasedOnNumberOfMonths(String format, int numberOfMonths) {

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, numberOfMonths);
		SimpleDateFormat s = new SimpleDateFormat(format);
		return s.format(new Date(cal.getTimeInMillis()));
	}

	public static String getRequiredDateBasedOnNumberOfYears(String format, int numberOfYears) {

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, numberOfYears);
		SimpleDateFormat s = new SimpleDateFormat(format);
		return s.format(new Date(cal.getTimeInMillis()));

	}
}