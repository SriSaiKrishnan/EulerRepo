/**
 * 
 */
package com.practice.euler;

/**
 * @author sv
 *
 */

/*
 * The number, 197, is called a circular prime because all rotations of the
 * digits: 197, 971, and 719, are themselves prime.
 * 
 * There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71,
 * 73, 79, and 97.
 * 
 * How many circular primes are there below one million?
 */

public class CircularPrime {

	private static int circularPrime(int range) {
		// TODO Auto-generated method stub
		int counter =0;
		for (int i = 2; i <= range; i++) {
		if(rotateDigit(i)){
			counter++;
		}
		}
		return counter;
	}

	private static boolean rotateDigit(int number) {
		int digitLength = digitLength(number);
		int rotate = digitLength;
		int remainder = 0;
		int digit = 1 ;
		int counter = 0;
		boolean checkCircularPrime = false;
		if(checkPrime(number)){
			while(rotate>0) {
				remainder = number%10;
			for (int j = 0; j < digitLength; j++) {
				if(j==0) {
					digit=1;
				}else {
					digit=digit * 10;
				}
			}
			number = number/10;
			digit = digit*remainder + number;
			number = digit;
			rotate--;
			checkCircularPrime = checkPrime(number);
			if(checkCircularPrime) {
				checkCircularPrime = true;
			}else {
				checkCircularPrime = false;
				break;
			}
			}
		}
		return checkCircularPrime;
	}

	private static int digitLength(int number) {
		int length = 0;
		long temp = 1;
		while (temp <= number) {
			length++;
			temp *= 10;
		}
		return length;
	}

	public static boolean checkPrime(int number) {
		boolean isPrime = true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
			isPrime = true;
		}
		return isPrime;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(circularPrime(1000000));
	}
}
