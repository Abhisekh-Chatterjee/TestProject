package com.test.test;

public class ChangeValueInMain {

	public static void main(String... args) {
		int data = 100;
		System.out.println( data + " " );
		processData(data);
		System.out.print( data+" ");
		processDataRet(data);
		System.out.print( data);
	}

	private static void processData(int data) {
		data=data * 2;
	}
	
	private static int processDataRet(int data) {
		data=data * 2;
		return data;
	}


}
