/*
Given two integer arrays nums1 and nums2, return an array of their intersection. 
Each element in the result must be unique and you may return the result in any order.
 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.


Constraints:

    1 <= nums1.length, nums2.length <= 1000
    0 <= nums1[i], nums2[i] <= 1000

*/

package com.test.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		
		if(nums1.length == 0 || nums2.length == 0) {
			System.out.println("There are no common elements in the arrays");
		}
		
		//Alternative 1 with HashSet:
		
		Set<Integer> uniqueSet = new HashSet<Integer>();
		List<Integer> intersectionList = new ArrayList<Integer>();
		
		
		for(int num : nums1) {
			uniqueSet.add(num);
		}
		
		for(int num : nums2) {
			if(uniqueSet.contains(num)) {
				intersectionList.add(num);
				uniqueSet.remove(num);
			}
		}
		
		//Integer[] commonElements = intersectionList.toArray(new Integer[intersectionList.size()]);
		
		for(int num : intersectionList) {
			System.out.println(num);
		}
		
		//Alternative 2 with Hashmap
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int num : nums1) {
			if(!map.containsKey(num)) {
				map.put(num, 1);
			}
		}
		
		int countCommonElements = 0;
		
		for(int num : nums2) {
			if(map.containsKey(num) && map.get(num) == 1) {
				map.put(num, 0);
				countCommonElements++;
			}
		}
		
		int[] intersection = new int[countCommonElements];
		int i = 0;
		
		for(int key : map.keySet()) {
			if((int)map.get(key) == 0) {
				intersection[i] = key;
				i++;
			}
		}
		
		for(int j : intersection) {
			System.out.print(j+" ");
		}

	}

}
