package com.practice.euler;

/*
 * 
Triangle, pentagonal, and hexagonal numbers are generated by the following formulae:

Triangle	 	Tn=n(n+1)/2	 	1, 3, 6, 10, 15, ...
Pentagonal	 	Pn=n(3n−1)/2	 	1, 5, 12, 22, 35, ...
Hexagonal	 	Hn=n(2n−1)	 	1, 6, 15, 28, 45, ...
It can be verified that T285 = P165 = H143 = 40755.

Find the next triangle number that is also pentagonal and hexagonal.
 */

public class Triangular {

	static Boolean isPentagonal(long N) {
		 double penTest = (Math.sqrt(1 + 24 * N) + 1.0) / 6.0;
		    return penTest == ((int)penTest);
	}

	public static void main(String[] args) {
		long result = 0;
		int i = 143;
		while (true) {
			i++;
			result = i * (2 * i - 1);
			if (isPentagonal(result)) {
				break;
			}
		}
		System.out.println(result);
	}
}