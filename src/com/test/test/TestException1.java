package com.test.test;

public class TestException1 {

	public static void main(String[] args) {
		System.out.println(result());
	}
	
	public static int result() {
		try {
			int a =10/0;
			return 1;
		} catch (Exception e) {
			return 2;
		} finally{
			return 3;
		}
	}

}
