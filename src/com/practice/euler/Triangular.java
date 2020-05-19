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
	
	private static long triangular[];
	private static long pentagonal[];
	private static long hexagonal[];
	
	public static void main(String[] args) {
		checkTrinagular(300);
	}

	private static void checkTrinagular(int i) {
		triangular =  new long[i];
		pentagonal = new long[i];
		hexagonal = new long[i];
		// TODO Auto-generated method stub
		for(int j=1; j<=i; j++) {
			triangular[j-1] = (long) j * (j +1)/2;
			pentagonal[j-1] = (long) j * ( j * 3 -1)/2;
			hexagonal[j-1] = (long) j * (j * 2 -1);
		}
	
	for(int k = 1; k<i; k++) {
		for(int l=1; l<i; l++) {
			if(triangular[k]==pentagonal[l]) {
				for(int m=1; m<i; m++) {
				if(triangular[k]==hexagonal[m]) {
					System.out.println("Common Triangular, Pentagonal & Hexagonal Number is: " + triangular[k]);
				}
				}
			}
		}
	}
	}

}
