package com.test.string;

public class CountNumberOfWordsInEachLine {

	public static void main(String[] args) {
		String str = "Meep Meep!\n" + 
				"I tot I taw a putty tat.\n" + 
				"I did! I did! I did taw a putty tat.\n"
				+ "Shsssssssssh ... I am hunting wabbits. Heh Heh Heh Heh ...";

		//Solution that didn't work
		/*
		 * int words = 0;
		 * 
		 * for(int i = 0; i < str.length(); i++) { if(str.charAt(i) == ' ' &&
		 * Character.isAlphabetic(str.charAt(i-1))){ words++; } else if(str.charAt(i) ==
		 * '\n' || i == (str.length()-1)) { System.out.println(words+1); words = 0; } }
		 */

		
		 String[] lines = str.split("\n", -1);
		  
		 for(String line : lines) {
			 line = line.replaceAll("[^a-zA-Z0-9\\s]", "");
			 line = line.replaceAll(" +", " ").trim();
			 System.out.println(line);
			 String[] words = line.split(" ",-1);
			 System.out.println(words.length);
		}
		 

	}

}
