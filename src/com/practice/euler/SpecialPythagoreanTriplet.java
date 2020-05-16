/**
 * 
 */
package com.practice.euler;

/**
 * @author sv
 *
 */
public class SpecialPythagoreanTriplet {

	public static void findPythagoreanTriplet(int num) {
		int sum = 0;
		int number = 0;
		long product = 1;
		for(int i=1; i<=1000; i++) {
			for(int j=1; j<=1000; j++) {
				for(int k=1; k<=1000; k++) {
					sum = i+j+k;
					if(sum==1000) {
						number = (j*j) + (k*k);
						if(number == (i*i)) {
							product = i*j*k;
						}
					}  
				}
			}
		}
		System.out.println(product);
	}
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findPythagoreanTriplet(100000);
	}
}
