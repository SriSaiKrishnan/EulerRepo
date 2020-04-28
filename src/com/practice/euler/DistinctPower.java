/**
 * 
 */
package com.practice.euler;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author sv
 *
 */
public class DistinctPower {

	private static int counter = 0;
	static Set<BigInteger> sort =  new TreeSet<>();

	public static Set<BigInteger> checkDistinctPower(int base, int power) {
		for (int i = 2; i <= base; i++) {
			BigInteger baseValue = new BigInteger("" + i);
			BigInteger product = new BigInteger("" + i);
			for (int j = 2; j <= power; j++) {
				product = baseValue.multiply(product);
				sort.add(product);
			}
		}
		return sort;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkDistinctPower(100, 100);
		System.out.println(sort.size());
	}
}
