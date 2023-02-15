/*Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

Constraints:

    1 <= s.length <= 105
    s[i] is a printable ascii character.

*/

package com.test.string;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		String[] s = {"h","e","l","l","o"};
		//String[] o = new String[s.length];
		int start = 0;
		int end = s.length-1;
		//String tempStart = "";
		//String tempEnd = "";
		String temp;
		while(start <= end) {
			//o[start] = s[end];
			//o[end] = s[start];
			
			//tempStart = s[start];
			//tempEnd = s[end];
			//s[start] = tempEnd;
			//s[end] = tempStart;
			
			temp = s[start];
			s[start] = s[end];
			s[end] = temp;
			
			start++;
			end--;
		}
		
		//Arrays.stream(o).forEach(str -> System.out.print(str+" "));
		
		//Arrays.stream(s).forEach(str -> System.out.print(str+" "));
		
		for (int i = 0; i < s.length; i++) {
		    System.out.print(s[i]+" ");
		}
		
		// Using StringBuffer
		
		//String str = "hello";
		//StringBuffer strBf = new StringBuffer(str);
		//System.out.println(strBf.reverse());

	}

}
