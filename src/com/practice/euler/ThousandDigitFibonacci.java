/**
 * 
 */
package com.practice.euler;

import java.math.BigInteger;

/**
 * @author sv
 *
 */
public class ThousandDigitFibonacci {

	public static int fibonacci(int range) {
		BigInteger fib = new BigInteger("1");
		BigInteger newValue = fib;
		BigInteger oldValue = new BigInteger("0");
		for (int i = 1; i <= range; i++) {
			fib = oldValue.add(newValue);
			oldValue = newValue;
			newValue = fib;
			String thousandDigit = String.valueOf(fib);
			if (thousandDigit.length() >= 1000) {
				return i+1;
			}
			
		}
		return 0;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The 1000-digit Fibonacci number is " + fibonacci(10000));
	}

}
