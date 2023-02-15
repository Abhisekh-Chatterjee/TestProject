/*Given a string s, find the first non-repeating character in it and return its index. If it does not exist, 
 * return -1.

Example 1:

Input: s = "leetcode"
Output: 0

Example 2:

Input: s = "loveleetcode"
Output: 2

Example 3:

Input: s = "aabb"
Output: -1

 

Constraints:

    1 <= s.length <= 105
    s consists of only lowercase English letters.
*/

package com.test.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatingChar {

	
	 public static void main(String[] args) { 
		 /*String str = "aabb"; 
			
			 * Set<Character> set = new HashSet<Character>(); char nonRepChar = '*';
			 * 
			 * for(char ch : str.toCharArray()) { set.add(ch); nonRepChar
			 * =countOccurence(set, str); if(nonRepChar != '$') {
			 * System.out.println(str.indexOf(nonRepChar)); break; } }
			 * 
			 * if(nonRepChar == '$') { System.out.println(-1); }
			 */
		 int index = getIndex();
		 System.out.println(index);
	}
	 
	
	private static char countOccurence(Set<Character> set, String str) {
		for(char ch : set) {
			int occCount = str.length() - str.replace(Character.toString(ch), "").length();
			if(occCount == 1) {
				System.out.println("First Non repeating character is : "+ch);
				return ch;
			}
		}
		return '$';
	}
	
	// Alternative
	
	private static int getIndex() {
		String str = "aabbccddeffg";
		Set<String> uniqCh = new HashSet<String>();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
		}
		
		for(int i = 0; i < str.length(); i++) {
			if(map.get(str.charAt(i)) == 1) {
				return i;
			}
		}
		return -1;
	}
}
