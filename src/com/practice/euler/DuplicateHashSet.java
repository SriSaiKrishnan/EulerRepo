/**
 * 
 */
package com.practice.euler;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author sv
 *
 */
public class DuplicateHashSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,2,2,1,1,3};
		Set<Integer> h = new LinkedHashSet<>();
		for (int num :a ) {
			h.add(num);
		}
		System.out.println(h);
		
	}

}
