/**
 * 
 */
package com.practice.euler;

/**
 * @author sv
 *
 */
public class LargestPrimeFactor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number =  600851475143d;
		for (double i = 2; i < 1000000000000d; i++) {
			findPrimeFactor(i,number);
		}
	}

	public static double findPrimeFactor(double n,double number) {
		double i, m = 0, flag = 0;
		m = n / 2;
		for (i = 2; i <= m; i++) {
			if (n % i == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			double num = number;
			if(num%n==0) {
				System.out.println("Prime Factors are:  " + n);
			}
			return n;
		}
		return 0;
	}
}
