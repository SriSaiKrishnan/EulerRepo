/**
 * 
 */
package com.practice.euler;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

/**
 * @author sv
 *
 */
public class DigitFifthPowers {

	public static int digitFifthPower(int power, int endIndex) {
		long remainder = 0;
		long divider = 0;
		int result = 0;
		for (int i = 2; i <= endIndex; i++) {
			long sum = 0;
			divider = i;
			while (divider > 0) {
				long number = 1;
				remainder = divider % 10;
				for (int j = 1; j <= power; j++) {
					number = number*remainder;
				}
				sum = sum + number;
				divider = divider / 10;
			}
			if (i == sum) {
				 result+=sum;
			}
		}
		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(digitFifthPower(5, 1000000));
	}

}
