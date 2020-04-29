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

	public static BigInteger checkDoubleBasePalindromes(int decimal) {
		int counter = 0;
		int remainder = 0;
		String value = null;
		BigInteger binary = new BigInteger("0");
		while(decimal>0) {
			remainder = decimal%2;
			value = binary.toString() + new BigInteger(""+remainder).toString();
			binary = new BigInteger(""+value);
			decimal = decimal/2;
		}
		if(checkPalindrome(binary)) {
			counter++;
		}
		System.out.println(counter);
		return binary;
	}
	
	public static boolean checkPalindrome(BigInteger number) {
		boolean flag = false;
		BigInteger remainder =new BigInteger("0");
		BigInteger reverse = new BigInteger("0");
		BigInteger oldValue = new BigInteger(""+number);
		int result = number.compareTo(new BigInteger("0"));
		while(result>0) {
			remainder = number.divide(new BigInteger("10"));
			reverse = reverse.add(remainder);
			number = number.remainder(new BigInteger("10"));
			result = number.compareTo(new BigInteger("0"));
		}
		if(oldValue==reverse) {
			 flag = true;
		}
		return flag;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkDoubleBasePalindromes(585));
	}

}
