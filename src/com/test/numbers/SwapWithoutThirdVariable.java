package com.test.numbers;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		int a = 10; 
		int b = 20;
		
		swapNumbers(a, b);
		
		System.out.println("a = "+a+" b = "+b);

	}
	
	private static void swapNumbers(int a, int b) {
		b = b + a;
		a = b - a;
		b = b - a;
		
		System.out.println("a = "+a+" b = "+b);
	}

}
