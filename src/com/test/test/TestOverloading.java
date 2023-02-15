package com.test.test;

public class TestOverloading {

	public static void main(String[] args){
		  //a(5);					Compile error line
		}

	static void a(int a , int...b){
		System.out.print(a);
	}
	
	static void a(int...b){
	  System.out.print(b);
	}

}
