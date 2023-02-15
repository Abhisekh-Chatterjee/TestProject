/*Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may 
assume that the majority element always exists in the array.
 

Example 1:

Input: nums = [3,2,3]
Output: 3

Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

Constraints:

    n == nums.length
    1 <= n <= 5 * 104
    -109 <= nums[i] <= 109

 
Follow-up: Could you solve the problem in linear time and in O(1) space?
*/

package com.test.arrays;

import java.util.HashMap;

public class MajorityElement {

	public static void main(String[] args) {
		int[] nums = {2,2,1,1,1,2,2};
		
		int majElementMark = nums.length / 2;
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i : nums) {
			
			if(map.containsKey(i)) {
				map.put(i, map.getOrDefault(i, 0)+1);
			}
			map.putIfAbsent(i, 1);
		}
		
		System.out.println("Major Element Mark : "+majElementMark);
		
		for(int key : map.keySet()) {
			System.out.println(key+" "+map.get(key));
			if(map.get(key) > majElementMark) {
				System.out.println("Majority element : "+key);
			}
		}

	}

}
