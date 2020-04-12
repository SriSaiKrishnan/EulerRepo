/**
 * 
 */
package com.practice.euler;

/*
 * 
The sum of the squares of the first ten natural numbers is,

12+22+...+102=385
The square of the sum of the first ten natural numbers is,

(1+2+...+10)2=552=3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025−385=2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

/**
 * @author sv
 *
 */
public class SumSquareDifference {
	private static int sumOfTheSquares;
	private static int squareOfTheSum;

	public static int sumSquareDifference(int endRange) {
		for (int i = 1; i <= endRange; i++) {
			sumOfTheSquares = sumOfTheSquares + (i * i);
			squareOfTheSum = squareOfTheSum + i;
		}
		squareOfTheSum = squareOfTheSum * squareOfTheSum;
		return squareOfTheSum - sumOfTheSquares;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumSquareDifference(100)); // Passing the value as 100
	}

}
