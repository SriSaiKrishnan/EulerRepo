/**
 * 
 */
package com.practice.euler;

/**
 * @author sv
 *
 */
public class NextLargestNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {16,17,5,1,2,3};
		nextLargestNum(a);
	}

	private static void nextLargestNum(int a[]) {
		// TODO Auto-generated method stub
		int len = a.length-1;
		for(int i=0; i<len; i++) {
			if(a[i]<a[i+1]) {
				System.out.print(a[i+1] + "  " );
			}
		}
		System.out.print(a[len]);
	}
	
	

}
