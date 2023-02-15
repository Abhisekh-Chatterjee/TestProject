package com.test.statics;

public class TestStatic {
	
	static int a =50;
	
	static void m1() {
		System.out.println("m1");
	}
	
	public static void main(String[] args) {
		int a =10;
		a=TestStatic.a=90;
		System.out.println(a);
		System.out.println(TestStatic.a);
		
		System.out.println("mm");
	}
	
	static{
		System.out.println("sb");
		m1();
	}

}
