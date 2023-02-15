/*Given an integer array nums, move all 0's to the end of it while maintaining 
  the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:

Input: nums = [0]
Output: [0]

Constraints:

    1 <= nums.length <= 104
    -231 <= nums[i] <= 231 - 1
*/

package com.test.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeros {

	public static void main(String[] args) {
		int[] a = {0,1,0,3,12};
		/*
		 * int countZeros = 0; List<Integer> nonZeroList = new ArrayList<Integer>(); int
		 * nonZeroListSize = 0;
		 */
		
		if(a.length <= 1) {
			return;
		}
		
		/*
		 * for(int n : a) { if(n > 0) { nonZeroList.add(n); } else { countZeros++; } }
		 * 
		 * nonZeroListSize = nonZeroList.size();
		 * 
		 * for(int i = 0; i < nonZeroListSize; i++) { a[i] = nonZeroList.get(i); }
		 * 
		 * while(countZeros > 0) { a[nonZeroListSize] = 0; nonZeroListSize++;
		 * countZeros--; }
		 */
		
		int nonZeroLast = 0;
		int runner = 0;
		
		while(runner < a.length) {
			
			if(a[runner] > 0) {
				swap(a, nonZeroLast, runner);
				nonZeroLast++;
			}
			runner++;
		}
		
		Arrays.stream(a).forEach(System.out::print);

	}
	
	private static void swap(int[] a, int nonZeroLast, int runner) {
		int tmp = a[runner];
		a[runner] = a[nonZeroLast];
		a[nonZeroLast] = tmp;
	}

}
