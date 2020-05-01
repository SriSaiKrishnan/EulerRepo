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
 * 
The decimal number, 585 = 10010010012 (binary), is palindromic in both bases.

Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.

(Please note that the palindromic number, in either base, may not include leading zeros.)
 */

public class DoubleBasePalindromes {

	public static long checkDoubleBasePalindromes(int decimal) {
		long begin = System.currentTimeMillis();
		
		long Sum = 0; 
		for (int i = 0; i < 1000000; i++)
		{
			if ( checkPalindrome(Integer.toString(i)) && checkPalindrome(Integer.toBinaryString(i)) )
				Sum += i;
		}
		System.out.println(Sum);
		
		long end = System.currentTimeMillis();
		System.out.println(end-begin + "ms");
		return Sum;
	}

	
	public static boolean checkPalindrome(String number) {
		boolean flag = true;
		String str = number;
		int start=0;
		int end = str.length()-1;
		while(start<end) {
			if(str.charAt(start++)!=str.charAt(end--)) {
				 flag = false;
			}
		}
		return flag;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkDoubleBasePalindromes(1000000);
	}

}
