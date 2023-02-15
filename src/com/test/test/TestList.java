package com.test.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		/*
		 * List<String> a = new ArrayList<String>(); a.add("c"); List<String> b =
		 * a.subList(0,1); a.add("c"); System.out.println(b.size());
		 */
		
		List<Integer> list1 = Arrays.asList(2,6,1,8,5,8);
		
		Integer max = list1.stream()
							.max((i,j) -> i.compareTo(j)).get();
		
		System.out.println("Maximum "+max);
		
		LinkedList<String> list = new LinkedList();
		list.add(new String("o"));
		list.add(new String("e"));
		list.add(new String("d"));
		list.add(new String("c"));
		Iterator<String> i = list.iterator();
		Collections.reverse(list);
		Collections.sort(list);
		while(i.hasNext()) {
			System.out.print(i.next() + " ");
		}
	}

}
