/**
 * 
 */
package com.practice.euler;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author sv
 *
 */

/*
 * 
 * The nth term of the sequence of triangle numbers is given by, tn = ½n(n+1);
 * so the first ten triangle numbers are:
 * 
 * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
 * 
 * By converting each letter in a word to a number corresponding to its
 * alphabetical position and adding these values we form a word value. For
 * example, the word value for SKY is 19 + 11 + 25 = 55 = t10. If the word value
 * is a triangle number then we shall call the word a triangle word.
 * 
 * Using words.txt (right click and 'Save Link/Target As...'), a 16K text file
 * containing nearly two-thousand common English words, how many are triangle
 * words?
 */

public class CodedTriangleNumber {

	private static int a[] = new int[500];

	private static int findCodedTriangle(String filepath) throws IOException {
		FileInputStream fileInputStream = new FileInputStream(filepath);
		int i = 0;
		int wordScore = 0;
		int counter = 0;
		String words = "";
		while ((i = fileInputStream.read()) != -1) {
			words = words.concat((words).valueOf((char) i));
		}
		String word[] = words.split(",");
		for (int j = 0; j < word.length; j++) {
			wordScore = calculateWordScore(word[j]);
			if(checkNumberisTriangle(wordScore)) {
				counter++;
			}
		}
		return counter;
	}

	private static int calculateWordScore(String name) {
		int sum = 0;
		char[] ch = name.toCharArray();
		for (int i = 1; i < ch.length - 1; i++) {
			sum = sum + charValue(ch[i]);
		}
		return sum;
	}

	private static int charValue(char ch) {
		int n = 0;
		n = ((int) ch) - 64;
		return n;
	}

	private static int[] triangleNumbers() {
		for (int i = 1; i <= 500; i++) {
			a[i] = 1 / 2 * i * (i + 1);
		}
		return a;
	}

	private static boolean checkNumberisTriangle(int num) {
		boolean flag = false;
		for(int i=1; i<a.length;i++) {
			if(a[i]==num) {
				flag = true;
			}
		}
		return flag;
	}
	
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(findCodedTriangle("/Users/sv/eclipse-workspace/EulerRepo/resource/Words.txt"));
	}

}
