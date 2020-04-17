/**
 * 
 */
package com.practice.euler;

/*
 * 
215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 21000?
 */

import java.math.BigInteger;

/**
 * @author sv
 *
 */
public class PowerDigitSum {

	public static int powerDigit(String base, int exponent) {
		BigInteger  powerDigit = new BigInteger(base);
		int digitSum = 0;
		for(int i=1;i<exponent;i++) {
			powerDigit = powerDigit.multiply(BigInteger.valueOf(2));
		}
		String sum = "" + powerDigit;
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
		System.out.println(powerDigit("2",1000));
	}

}
