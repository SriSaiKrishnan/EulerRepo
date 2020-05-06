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
In the United Kingdom the currency is made up of pound (£) and pence (p). There are eight coins in general circulation:

1p, 2p, 5p, 10p, 20p, 50p, £1 (100p), and £2 (200p).
It is possible to make £2 in the following way:

1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p
How many different ways can £2 be made using any number of coins?
 */

public class CoinSums {
	
	private static int coinSum(int sum) {
		int target  = 200;
		int ways = 0;
		 
		for (int a = target; a >= 0; a -= 200) {
		    for (int b = a; b >= 0; b -= 100) {
		        for (int c = b; c >= 0; c -= 50) {
		            for (int d = c; d >= 0; d -= 20) {
		                for (int e = d; e >= 0; e -= 10) {
		                    for (int f = e; f >= 0; f -= 5) {
		                        for (int g = f; g >= 0; g -= 2) {
		                            ways++;
		                        }
		                    }
		                }
		            }
		        }
		    }
		}
		return ways;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(coinSum(200));
	}

}
