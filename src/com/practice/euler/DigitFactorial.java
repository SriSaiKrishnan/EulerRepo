/**
 * 
 */
package com.practice.euler;

/**
 * @author sv
 *
 */

/*
145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.

Find the sum of all numbers which are equal to the sum of the factorial of their digits.

Note: as 1! = 1 and 2! = 2 are not sums they are not included.
 */

public class DigitFactorial {
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=3;i<=1000000;i++) {
			digitFactorial(i);
		}
	}

	private static void digitFactorial(int i) {
		// TODO Auto-generated method stub
		int remainder = 0;
		int sum = 0;
		int oldvalue = i;
		while(i>0) {
			remainder = i%10;
			sum = sum + factorial(remainder);
			i=i/10;
		}
		if(oldvalue == sum) {
			System.out.println(sum + " is Digit Power");
		}
		
	}

	private static int factorial(int remainder) {
		// TODO Auto-generated method stub
		int fact = 1;
		for(int i=1;i<=remainder;i++) {
			fact = fact*i;
		}
		return fact;
	}

}
