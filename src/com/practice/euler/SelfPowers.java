/**
 * 
 */
package com.practice.euler;

import java.math.BigInteger;

/**
 * @author sv
 *
 */

/*
The series, 11 + 22 + 33 + ... + 1010 = 10405071317.

Find the last ten digits of the series, 11 + 22 + 33 + ... + 10001000.
 */
public class SelfPowers {
	private static BigInteger sum = new BigInteger("0");
	private static String lastTenDigit;
	public static BigInteger findSelfPowers(int endRange) {
		BigInteger multipier = new BigInteger(""+endRange);
		BigInteger selfPower = new BigInteger("1");
		for(int i=1;i<=endRange;i++) {
			selfPower = selfPower.multiply(multipier);
		}
		sum = sum.add(selfPower);
		return sum;
	}
	
	public static String findLastTenDigit(BigInteger num) {
		lastTenDigit = ""+num;
		int startIndex = lastTenDigit.length()-10;
		int endIndex = lastTenDigit.length();
		return lastTenDigit.substring(startIndex, endIndex);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=1000;i++) {
			findSelfPowers(i);
		}
		System.out.println(findLastTenDigit(sum));
	}

}
