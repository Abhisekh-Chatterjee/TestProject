package com.test.test;

public class TestException2 {

	public static void main(String[] args) {
		 try {
			 System.out.println(10/0); 
		}catch(ArithmeticException e) { 
			throw new NullPointerException();
		}
		 
		
		try {
			System.out.println("one");
			System.exit(0);
			} catch (Exception e) {
			System.out.print("two");
			} finally {
			System.out.print("three");
			}
	}

}
