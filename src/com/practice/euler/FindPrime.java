package com.practice.euler;

import java.util.*;

/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
	What is the 10 001st prime number?
 */

public class FindPrime {
	// private static int primeOfIndex[];

	public static void main(String... args) {
		int counter = 0;
		int primeNum = 0;
		for (int i = 2; i <= 10000000; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primeNum = i;
				counter++;
			}
			if (counter == 10001) {
				break;
			}
		}
		System.out.println(primeNum);
	}
}