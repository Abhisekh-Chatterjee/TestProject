package com.test.string;

public class Demo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(5);
		String s = "";
		if (sb.equals(s)) {
			System.out.println("Match 1");
		} else if (sb.toString().equals(s)) {
			System.out.println("Match 2");
		} else {
			System.out.println("Match 3");
		}
		
		String s1 = new String ("java");
		String s2 = new String ("JAVA");
		System.out.println(s1 = s2);
		
		String[] arr = {"A", "B", "C", "D"};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if (arr[i].equals("C")) {
				continue;
			}
			System.out.println("Work done");
			break;
		}
	}
}