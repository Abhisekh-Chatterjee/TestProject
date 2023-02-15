package com.test.numbers;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		System.out.println(checkPrime(47));
		System.out.println(checkPrime(35));
		int[]  answer = new int[100];

	}
	
	private static boolean checkPrime(int a) {
		if(a == 0 || a == 1) {
			return false;
		}
		
		else if(a == 2) {
			return true;
		}
		
		else {
			for(int i = 2; i < a/2; i++) {
				if (a % i == 0) {
					return false;
				}
			}
		}
		
		return true;
	}

}
