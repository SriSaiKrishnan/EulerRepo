/**
 * 
 */
package com.practice.euler;

import java.math.BigInteger;

/**
 * @author sv
 *
 */
public class DistinctPower {

	private static BigInteger bigInteger[][];
	private static int counter = 0;

	public static BigInteger[][] checkDistinctPower(int base, int power) {
		bigInteger = new BigInteger[base - 1][power - 1];
		for (int i = 2; i <= base; i++) {
			BigInteger baseValue = new BigInteger("" + i);
			BigInteger product = new BigInteger("" + i);
			for (int j = 2; j <= power; j++) {
				product = baseValue.multiply(product);
				bigInteger[i - 2][j - 2] = product;
			}
		}
		return bigInteger;
	}

	public static int noOfDistintPower() {
		for (int i = 0; i < bigInteger.length; i++) {
			for (int j = 0; j < bigInteger.length; j++) {
				if (bigInteger[i][j] != bigInteger[i + 1][j]) {
					counter ++;
				} 
			}
		}
		return counter;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkDistinctPower(5, 5);
		System.out.println("Total Number of Distinct Power are: " + noOfDistintPower());
	}
}
