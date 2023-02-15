/*
 Given a string s, reverse the order of characters in each word within a sentence 
 while still preserving whitespace and initial word order.


Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Example 2:

Input: s = "God Ding"
Output: "doG gniD"


Constraints:

    1 <= s.length <= 5 * 104
    s contains printable ASCII characters.
    s does not contain any leading or trailing spaces.
    There is at least one word in s.
    All the words in s are separated by a single space.
*/

package com.test.string;

public class ReverseWordsinStringIII {

	public static void main(String[] args) {
		String s = "public static void main";
		
		if(s.length() <=1) {
			System.out.println(s);
			return;
		}
		
		int front = 0;
		int end = 0;
		
		char[] chars = s.toCharArray();
		
		while(end <  s.length()) {
			if(chars[end] == ' ') {
				reverse(chars, front, end-1);
				front = end + 1;
			} else if(end == s.length() - 1) {
				reverse(chars, front, end);
			}
			end++;
		}
		
		System.out.println(new String(chars));

	}
	
	private static void reverse(char[] chars, int front, int end) {
		char tmp;
		while(front < end) {
			tmp = chars[front];
			chars[front] = chars[end];
			chars[end] = tmp;
			front++;
			end--;
		}
	}

}
