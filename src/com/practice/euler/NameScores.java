/**
 * 
 */
package com.practice.euler;

import java.io.FileInputStream;

/**
 * @author sv
 *
 */

/*
 * 
Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.

For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.

What is the total of all the name scores in the file?
 */

public class NameScores {
	private static String names = "";
	/**
	 * @param args
	 */
	
	private static void nameScore(String filepath) {
		int counter = 1;
		int nameScore = 0;
		try {
			FileInputStream fileInputStream = new FileInputStream(filepath);
			int i = 0;
			while((i=fileInputStream.read())!=-1) {
				names = names.concat(names.valueOf((char)i));
			}
		}catch (Exception  e) {
			e.printStackTrace();
		}
		String name[] = names.split(",");
		for(String Name : name) {
			nameScore =  nameScore + (counter * calculateScore(Name));
			counter ++;
		}
		System.out.println(nameScore);
	}
	
	private static int calculateScore(String name) {
		int sum = 0;
		char[] ch = name.toCharArray();
		for(int i=1; i<ch.length-1; i++) {
			sum = sum + charValue(ch[i]);
		}
		return sum;
	}
	
	private static int charValue(char ch) {
		int n = 0;
		switch(ch) {
		case 'A':
			n = 1;
			break;
		case 'B':
			n = 2;
			break;
		case 'C':
			n = 3;
			break;
		case 'D':
			n = 4;
			break;
		case 'E':
			n = 5;
			break;
		case 'F':
			n = 6;
			break;
		case 'G':
			n = 7;
			break;
		case 'H':
			n = 8;
			break;
		case 'I':
			n = 9;
			break;
		case 'J':
			n = 10;
			break;
		case 'K':
			n = 11;
			break;
		case 'L':
			n = 12;
			break;
		case 'M':
			n = 13;
			break;
		case 'N':
			n = 14;
			break;
		case 'O':
			n = 15;
			break;
		case 'P':
			n = 16;
			break;
		case 'Q':
			n = 17;
			break;
		case 'R':
			n = 18;
			break;
		case 'S':
			n = 19;
			break;
		case 'T':
			n = 20;
			break;
		case 'U':
			n = 21;
			break;
		case 'V':
			n = 22;
			break;
		case 'W':
			n = 23;
			break;
		case 'X':
			n = 24;
			break;
		case 'Y':
			n = 25;
			break;
		case 'Z':
			n = 26;
			break;
		}
		return n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nameScore("/Users/sv/eclipse-workspace/EulerRepo/resource/Names.txt");
	}
}

