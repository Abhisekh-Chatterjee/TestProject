package com.test.string;

public class CheckIfStringContainsVowel {

	public static void main(String[] args) {
		String str1 = "Yes";
		String str2 = "TV";
		
		System.out.println(checkVowel(str1));
		System.out.println(checkVowel(str2));

	}
	
	private static boolean checkVowel(String str) {
		return str.toLowerCase().matches(".*[aeiou].*");
	}

}
