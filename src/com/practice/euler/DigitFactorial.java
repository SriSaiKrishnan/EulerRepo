/**
 * 
 */
package com.practice.euler;

/**
 * @author sv
 *
 */

/*
 * 145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.
 * 
 * Find the sum of all numbers which are equal to the sum of the factorial of
 * their digits.
 * 
 * Note: as 1! = 1 and 2! = 2 are not sums they are not included.
 */

public class DigitFactorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(digitFactorial(1000000));

	}

	private static int digitFactorial(int num) {
		// TODO Auto-generated method stub
		int total = 0;
		for (int i = 3; i <= num; i++) {
			int remainder = 0;
			int sum = 0;
			int oldvalue = i;
			int number = i;
			while (number > 0) {
				remainder = number % 10;
				sum = sum + factorial(remainder);
				number = number / 10;
			}
			if (oldvalue == sum) {
				total += sum;
			}
		}
		return total;
	}

	private static int factorial(int remainder) {
		// TODO Auto-generated method stub
		int fact = 1;
		for (int i = 1; i <= remainder; i++) {
			fact = fact * i;
		}
		return fact;
	}

}
