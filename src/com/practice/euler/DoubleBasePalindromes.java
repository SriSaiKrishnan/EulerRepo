/**
 * 
 */
package com.practice.euler;

import java.math.BigInteger;

/**
 * @author sv
 *
 */
public class DoubleBasePalindromes {

	public static int checkDoubleBasePalindromes(int decimal) {
		int counter = 0;
		int remainder = 0;
		String value = null;
		BigInteger binary = new BigInteger("0");
		for(int i=2;i<=decimal;i++) {
			while(decimal>1) {
				remainder = decimal%2;
				value = binary.toString() + new BigInteger(""+remainder).toString();
				binary = new BigInteger(""+value);
				decimal = decimal/2;
			}
			if(checkPalindrome(binary)) {
				counter++;
			}
		}
		return counter;
	}
	
	public static boolean checkPalindrome(BigInteger number) {
		boolean flag = false;
		BigInteger oldValue = new BigInteger(""+number);
		StringBuffer revNumber = new StringBuffer(number.toString());
		revNumber = revNumber.reverse();
		BigInteger num = new BigInteger(""+revNumber);
		if(oldValue.equals(num)) {
			 flag = true;
		}
		return flag;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkDoubleBasePalindromes(1000000));
	}

}
