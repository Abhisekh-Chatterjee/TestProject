/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word 
or phrase, typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true

Example 2:

Input: s = "rat", t = "car"
Output: false


Constraints:

    1 <= s.length, t.length <= 5 * 104
    s and t consist of lowercase English letters.

 

Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
*/

package com.test.string;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {

	public static void main(String[] args) {
		String s = "anagram";
		String t = "ganaram";
		
		//Naive solution O(nlogn) time complexity due to sorting
		
		/*
		 * if(s.length() != t.length()) { System.out.println("Anagram : "+false); }
		 * 
		 * char[] str1 = s.toCharArray(); char[] str2 = t.toCharArray();
		 * 
		 * Arrays.sort(str1); Arrays.sort(str2);
		 * 
		 * System.out.println("Anagram : "+Arrays.equals(str1, str2));
		 */
		
		//Optimal Solution O(n) time complexity
		
		if(s == null && t == null || s.isEmpty() && t.isEmpty()) {
			System.out.println("Anagram : "+false);
			return;
		}
		
		if(s.length() != t.length()) {
			System.out.println("Anagram : "+false);
			return;
		}
		
		HashMap<Character, Integer> map = new HashMap();
		
		for(char c : s.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c, map.getOrDefault(c, 0) + 1);
			}
			map.putIfAbsent(c, 1);
		}
		
		for(char c : t.toCharArray()) {
			if(!map.containsKey(c)) {
				System.out.println("Anagram : "+false);
				return;
			} else {
				map.put(c, map.get(c)-1);
			}
		}
		
		for(char key : map.keySet()) {
			if(map.get(key) != 0) {
				System.out.println("Anagram : "+false);
				return;
			}
		}
		
		System.out.println("Anagram : "+true);
	}

}
