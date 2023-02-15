package com.test.numbers;

public class ReverseNumber {

	public static void main(String[] args) {
		int x = 1534236469;
		int remainder = 0;
        long reverse = 0;
        
        System.out.println((96463243*10)+5);
        
        while(x != 0){
            remainder = x % 10;
            System.out.println("rem = "+remainder);
            reverse = reverse*10 + remainder;
            System.out.println("rev = "+reverse);
            x/=10;
        }
        
        System.out.println((int)reverse);

	}

}
