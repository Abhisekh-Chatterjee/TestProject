package com.test.numbers;

import java.util.ArrayList;
import java.util.List;

public class CheckListHasOddElements {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<Integer>();
		
		lst.add(0);
		lst.add(2);
		lst.add(4);
		lst.add(6);
		lst.add(8);
		lst.add(9);
		
		System.out.println(lst.parallelStream()
								.anyMatch(x -> x%2 != 0));

	}

}
