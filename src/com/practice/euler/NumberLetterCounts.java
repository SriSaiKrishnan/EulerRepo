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
If the numbers 1 to 5 are written out in words: one, two, three, four, five, 
then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, 
how many letters would be used?

NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) 
contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. 
The use of "and" when writing out numbers is in compliance with British usage.
 */
public class NumberLetterCounts {
	
	public static void numberLetterCount(int range) {
		//for(int i=1;i<=1000;i++) {
			getDigit(676);
		//}
	}
	
	public static void getDigit(int num) {
		String digit = "" + num;
		char ch[] = digit.toCharArray();
		int len = ch.length;
		if(len<4) {
			getNumberLetter(ch);
		}else {
			System.out.println("Please enter 4 digit number only");
		}
	}
	
	private static void getNumberLetter(char c[]) {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer();
		for(int i=0;i<c.length;i++) {
			if(c.length==1) {
				buffer.append(forThirdDigitLetter(c[i]));
			}else if(c.length==2) {
				if(i==0) {
					buffer.append(forSecondDigitLetter(c[i]));
				}else if(i==1) {
					buffer.append(forThirdDigitLetter(c[i]));
				}
			}else if(c.length==3) {
				if(i==0) {
					buffer.append(forThirdDigitLetter(c[i]) + " Hundred and ");
				}else if(i==1) {
					buffer.append(forSecondDigitLetter(c[i]));
				}else if(i==3) {
					buffer.append(forThirdDigitLetter(c[i]));
				}
			}
			System.out.println(buffer);
		}
		
	}
	
//	private static String forFirstDigitLetter(char c) {
//		// TODO Auto-generated method stub
//		int i = Character.getNumericValue(c);
//		switch(i) {
//		case 1: 
//			return "One Hundred and";
//		case 2:
//			return "Two Hundred and";
//		case 3:
//			return "Three Hundred and";
//		case 4:
//			return "Four Hundred and";
//		case 5:
//			return "Five Hundred and";
//		case 6:
//			return "Six Hundred and";
//		case 7:
//			return "Seven Hundred and";
//		case 8:
//			return "Eight Hundred and";
//		case 9:
//			return "Nine Hundred and";
//		}
//		return null;
//	}

	public static String forThirdDigitLetter(char c) {
		int i = Character.getNumericValue(c);
		switch(i) {
		case 1:
			return "One";
		case 2:
			return "Two";
		case 3:
			return "Three";
		case 4:
			return "Four";
		case 5:
			return "Five";
		case 6:
			return "Six";
		case 7:
			return "Seven";
		case 8:
			return "Eight";
		case 9:
			return "Nine";
		case 0:
			return "Zero";
		}
		return null;
	}
	
	public static String forSecondDigitLetter(char c) {
		int i = Character.getNumericValue(c);
		switch(i) {
		case 0:
			return "Ten";
		case 1:
			return "Eleven";
		case 2:
			return "Twelve";
		case 3:
			return "Thirteen";
		case 4:
			return "Fourteen";
		case 5:
			return "Fifteen";
		case 6:
			return "Sixteen";
		case 7:
			return "Seventeen";
		case 8:
			return "Eighteen";
		case 9:
			return "Nineteen";	
		}
		return null;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numberLetterCount(1000);
	}

}
