package com.test.string;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "AddaddA";
		
		StringBuffer revStr = new StringBuffer(str).reverse();
		
		System.out.println("Given string : "+str);
		
		if(str.equals(revStr.toString())) {
			System.out.println("Given string is palindrome");
		} else {
			System.out.println("Given string is not palindrome");
		}

	}

}
