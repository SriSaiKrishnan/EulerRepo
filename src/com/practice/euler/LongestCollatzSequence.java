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
The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
 */

public class LongestCollatzSequence {
	 
	static long largestCounter = 0;
	static long collatz;
	static long num;
	public static long findLongestCollatzSequence(int number) {
		for(int i=2;i<=number;i++) {
			long counter = 1;
			num = i;
			while(num!=1) {
				if(num%2==0) {
					num = num/2;
					counter++;
				}else {
					num = 3*num + 1;
					counter++;
				}
			}
			if(counter>largestCounter) {
				largestCounter=counter;
				collatz = i;
			}
		}
		return collatz;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findLongestCollatzSequence(1000000));
	}
}
