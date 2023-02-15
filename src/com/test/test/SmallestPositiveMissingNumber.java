package com.test.test;

//Problem

/*This is a demo task.

Write a function:

    class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..100,000];
        each element of array A is an integer within the range [−1,000,000..1,000,000].

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestPositiveMissingNumber {

	public static void main(String[] args) {
		int[] A = {-1,-3};
		System.out.println(solution(A));
	}
	
	private static int solution(int[] A) {
		List<Integer> smallestElements = new ArrayList<Integer>();
		int retVal;
		for(int ele : A) {
			retVal = findSmallestPositive(A, ele);
			if(retVal > 0 && !smallestElements.contains(retVal)) {
				smallestElements.add(retVal);
			}
		}
		return Collections.min(smallestElements);
	}
	
	private static int findSmallestPositive(int[] A, int ele) {
		if(ele  > 0) {
			boolean largerValueExists = Arrays.stream(A)
												.anyMatch(i -> i == (ele+1));
			if(!largerValueExists) {
				return ele+1;
			} else {
				return 0;
			}
		}
		return 1;
	}

}
