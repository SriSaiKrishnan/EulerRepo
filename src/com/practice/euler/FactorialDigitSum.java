/**
 * 
 */
package com.practice.euler;

import java.math.BigInteger;

/**
 * @author sv
 *
 */

/*
 * 
n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!
 */

public class FactorialDigitSum {
	
	public static int factorialDigitSum(int number) {
		BigInteger factorial = new BigInteger("1");
		int digitSum = 0;
		String sum;
		for(int i=1;i<=number;i++) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		sum = factorial + "";
		char ch[] = sum.toCharArray();
		for(char c : ch) {
			digitSum = digitSum + Character.getNumericValue(c);
		}
		return digitSum;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorialDigitSum(100));
	}

}
