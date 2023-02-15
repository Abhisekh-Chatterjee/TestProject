package com.test.string;

public class LongestPalindromeSubstring {

	public static void main(String[] args) {
		String str = "baabad";
		String subStr = "";
		int longestPalinSubStrLen = 0;
		String longestPalinSubStr = "";
		int start = 0;
		
		
		for(int i = 0; i <= str.length(); i++) {
			start = 0;
			while(start <= i) {
				subStr = str.substring(start, i);
				//System.out.println("subStr = "+subStr);
				if(isPalindrome(subStr) && 
						longestPalinSubStrLen < subStr.length()) {
					longestPalinSubStrLen = subStr.length();
					longestPalinSubStr = subStr;
					//System.out.println(subStr);
				}
				start++;
			}
		}
				
		System.out.println(longestPalinSubStr);

	}
	
	private static boolean isPalindrome(String subStr) {
		StringBuffer revStr = new StringBuffer(subStr).reverse();
		
		if(revStr.toString().equals(subStr)) {
			return true;
		} else {
			return false;
		}
	}

}
