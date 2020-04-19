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
The Fibonacci sequence is defined by the recurrence relation:

Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
Hence the first 12 terms will be:

F1 = 1
F2 = 1
F3 = 2
F4 = 3
F5 = 5
F6 = 8
F7 = 13
F8 = 21
F9 = 34
F10 = 55
F11 = 89
F12 = 144
The 12th term, F12, is the first term to contain three digits.

What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
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
