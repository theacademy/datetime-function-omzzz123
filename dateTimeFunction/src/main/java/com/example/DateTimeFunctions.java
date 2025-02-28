package com.example;

import java.time.*;

public class DateTimeFunctions {

	/*
	 * Update the class and existing methods as necessary to perform the required calculations
	 * and return the expected results.
	 *
	 * - All code should be inside the placeholders provided.
	 * - Do not add code outside of the placeholders.
	 * - Do not change code except as required inside the placeholders.
	 *	    //YOUR CODE STARTS HERE
	 *
	 *		//YOUR CODE ENDS HERE
	 */


	/*
	 * Implement the method so that it returns today's date.
	 */
	public static LocalDate getTodaysDate() {
		//YOUR CODE STARTS HERE
		//Get the current date from the system clock
		LocalDate today = LocalDate.now();
		return today;
		//YOUR CODE ENDS HERE

	}

	/*
	 * Implement the method so that it returns the date x days after
	 * the input date.
	 */
	public static LocalDate getLaterDatebyDays(LocalDate date, int x) {
		//YOUR CODE STARTS HERE
		//Add x days to the input date, return a new date object with the days added
		LocalDate laterDate = date.plusDays(x);
		return laterDate;
		//YOUR CODE ENDS HERE

	}

	/*
	 * Implement the method so that it returns the date x weeks prior to
	 * the input date.
	 */
	public static LocalDate getPreviousDatebyWeeks(LocalDate date, int x) {
		//YOUR CODE STARTS HERE
		//subtract x weeks from dates, minusWeeks() will return a new date object with the weeks subtracted
		LocalDate previousDate = date.minusWeeks(x);
		return previousDate;
		//YOUR CODE ENDS HERE

	}

	/*
	 * Implement the method so that it returns the time difference between two input dates
	 * in terms of years, months, and days.
	 * Return the String in the format: "Year-20:Months-5:Days-1"
	 */
	public static String getTimeDifference(LocalDate date1, LocalDate date2) {
		//YOUR  CODE STARTS HERE
		//Period object that represents the time between date1 and date2
		Period period = Period.between(date1, date2);

		// Extract the days,months,years from the period
		int days = period.getDays();
		int months = period.getMonths();
		int years = period.getYears();

		// Print string in the format (clarification "Years-20:Months-5:Days-1")
		String result = "Years-" + years + ":Months-" + months + ":Days-" + days;

		return result;
		//YOUR CODE ENDS HERE

	}

	public static void main(String[] args) {
		System.out.println("Today's date is: " + getTodaysDate());
		System.out.println("14 days from today is: " + getLaterDatebyDays(getTodaysDate(), 14));
		System.out.println("5 weeks prior to today was: " + getPreviousDatebyWeeks(getTodaysDate(), 5));
		System.out.println("The difference between today " +
				"and June 30, 2031 is: " +
				getTimeDifference(getTodaysDate(), LocalDate.of(2031,06,30)));
	}
}
