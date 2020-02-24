/**
 * 
 */
package com.practice.euler;

/**
 * @author sv
 *
 */
public class RemoveDuplicateNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,1,2};
		removeDuplicateNum(a);
		for(int i=0;i<2;i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void  removeDuplicateNum(int a[]) {
		int i=0;
		for(int j=1;j<a.length;j++) {
			if(a[i]!=a[j]) {
				a[++i]=a[j];
			}
		}
	}
}