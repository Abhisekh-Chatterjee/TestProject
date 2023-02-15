package com.test.numbers;

import java.util.ArrayList;
import java.util.List;

public class ChangeBase {

	public static void main(String[] args) {
		
		int x = 12;
		int y = 5;
		List<Integer> lst1Val = new ArrayList<Integer>();
		List<Integer> lst2Val = new ArrayList<Integer>();
		
		//for()
		
		System.out.println(convertFromBaseToBase("ABCD", 16, 15).toUpperCase());
		
	}
	
	private static String convertFromBaseToBase(String str, int fromBase, int toBase) {
	    return Integer.toString(Integer.parseInt(str, fromBase), toBase);
	}

}
