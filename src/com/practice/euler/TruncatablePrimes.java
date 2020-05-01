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
 * The number 3797 has an interesting property. Being prime itself, it is
 * possible to continuously remove digits from left to right, and remain prime
 * at each stage: 3797, 797, 97, and 7. Similarly we can work from right to
 * left: 3797, 379, 37, and 3.
 * 
 * Find the sum of the only eleven primes that are both truncatable from left to
 * right and right to left.
 * 
 * NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.
 */
public class TruncatablePrimes {

	public static int truncatablePrime(int num) {
		int counter = 0;
		int sum = 0;
		for (int i = 20; i <= num; i++) {
			if (checkPrime(i)) {
				if (checkTruncatablePrime(i)) {
					System.out.println("Value of i: " + i);
					sum = sum + i;
					counter++;
					if (counter > 11) {
						break;
					}
				}
			}
		}
		return sum;
	}

	public static boolean checkPrime(int num) {
		boolean flag = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static boolean checkTruncatablePrime(int num) {
		boolean flag = false;
		int remainder = 0;
		boolean truncateLeft = false;
		boolean truncateRight = false;
		String No = "";
		//int divider = 1000;
		while (num > 10) {
			remainder = num % 10;
			 No = No + "" + remainder;
			num = num / 10;
			truncateRight = checkPrime(num);
			truncateLeft = checkPrime(Integer.parseInt(No));
			flag = truncateLeft && truncateRight;
		}
		return flag;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(truncatablePrime(300));
	}

}
