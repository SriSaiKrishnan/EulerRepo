/**
 * 
 */
package com.practice.euler;

/**
 * @author sv
 *
 */

/*
 * 
Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000.
 */

public class AmicableNumbers {
	
	public static int findAmicableNumber(int number) {
		int properDivisor = 0;
			int num = number;
			for(int j=1; j<num; j++) {
				if(num%j==0) {
					properDivisor = properDivisor + j;
				}
			}
			return properDivisor;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int originalNumber = 0;
		int divisorSum = 0;
		int largeSum = 0;
		for(int i=1; i<=10000; i++) {
			originalNumber = findAmicableNumber(i);
			//System.out.println("originalNumber: " + i + " " + originalNumber);
			divisorSum = findAmicableNumber(originalNumber);
			//System.out.println("divisorSum: " + i + " " + divisorSum);
			if(divisorSum == i) {
				largeSum =  originalNumber + divisorSum;
			}
		}
		System.out.println("Largest Sum: " + largeSum);
	}

}
