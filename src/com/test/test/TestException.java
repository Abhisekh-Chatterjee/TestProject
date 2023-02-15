package com.test.test;

public class TestException {

	static public void main(String[] args) {
		try {
			int x = 10/0;
			System.out.println("Try block");
			} catch(Exception ex){
				System.out.println("Catch block");
				return;
			} finally {
				System.out.println("Finally block");
			}
	}

}
