package com.test.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Test{
	protected int x, y;
}

public class Main {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.x+" "+t.y);
		
		String[] array=new String[]{"A","B","C","D"};
		List<String> list1= Arrays.asList(array);
		List<String> list2= new ArrayList<>(Arrays.asList(array));
		List<String> list3= new ArrayList<>(Arrays.asList("A",new String("B"),"C","D"));
		System.out.println(list1.equals(list2));
		System.out.println(list1.equals(list3));
		
		System.out.println(5*5 + 6/2 + " Coding "+4+" is fun "+2+2);
		
		System.out.println(100 + 100 +"Simplilearn");   

		System.out.println("E-Learning Company" + 100 + 100);  

	}

}
