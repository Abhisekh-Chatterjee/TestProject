package com.test.lists;

import java.util.List;

public class TestLists {

	public static void main(String[] args) {
		
		List<Integer> myList = null;

		if (isEven(10) || myList.get(0) == 2 || myList.get(1) == 4) { //1
			myList = List.of(2, 3);
		}
		if (isEven(myList.get(0)) && myList.contains(4) && isEven(myList.get(3))) { //2
			myList = null;
		}
		System.out.println("First number: " + myList.get(0)); //3
	}

	private static boolean isEven(int number) {
		return number % 2 == 0;
	}
}
