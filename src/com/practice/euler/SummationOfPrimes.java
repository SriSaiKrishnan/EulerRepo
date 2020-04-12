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
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
 */
public class SummationOfPrimes {
	
	
	public static int isPrime(int num) {
		int flag = 0;
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					flag = 1;
					break;
				}
			}
		return flag;
	}
	
	public static void primeSummation(int number) {
		long primeSummation = 0;
		for(int i=2;i<=number;i++) {
		if(isPrime(i)==0) {	
			primeSummation = primeSummation + i;
		}
		}
		System.out.println(primeSummation);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeSummation(2000000);
	}

}
