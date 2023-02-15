package com.test.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CheckPrimeAndShrinkArray
{
	public static int[]  calculatePrimeNumbers(int num)
	{
		int[]  answer = new int[100];
		
		List<Integer> primesList = new ArrayList<Integer>(); 
		
		for(int i = 2; i <= num; i++){
			if(checkPrime(i)){
				primesList.add(i);
			}
		}
				
		answer = primesList.stream().mapToInt(i -> i).toArray();
		
		return answer;
	}

	private static boolean checkPrime(int a) {
		if(a == 2) {
			return true;
		} else {
			for(int i = 2; i <= a/2; i++) {
				if (a % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		// input for num
		int num = in.nextInt();
		
		
		int[] result = calculatePrimeNumbers(num);
		for(int idx = 0; idx < result.length - 1; idx++)
		{
			System.out.print(result[idx] + " ");
		}
		System.out.print(result[result.length - 1]);
	}
}
