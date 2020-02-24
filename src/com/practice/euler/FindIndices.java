/**
 * 
 */
package com.practice.euler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author sv
 *
 */
public class FindIndices {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 3, 2, 1, 5, 3 };
		int s = 8;
		 findIndices(a, s);
		//int[] result = findIndiciesUsingSet(a, s);
		//System.out.println(Arrays.toString(result));
	}

	private static int[] findIndiciesUsingSet(int[] a, int s) {
		// TODO Auto-generated method stub
		int[] result = new int[2];
		int k = 0;
		List<Integer> h = new ArrayList<>();
		for (int i : a) {
			h.add(i);
		}
		for (int i = 0; i < a.length; i++) {
			int num = s - a[i];
			if (h.contains(num)) {
				result[++k] = i;
				result[++k] = h.indexOf(num);
//				System.out.println("Indicies are:  " + i + " & " + h.indexOf(num));
				break;
			}
		}
		return result;
	}

	public static void findIndices(int a[], int s) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j <a.length; j++) {
				int k = a[i] + a[j];
				if (k == s) {
					System.out.println("Indicies are:  " + i + " & " + j);
					break;
				}
			}
			break;
		}
	}

}
