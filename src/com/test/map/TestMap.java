package com.test.map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		Map<String , Integer> hashMap=new HashMap<>();
		hashMap.put("abc",2000);
		hashMap.put("pqr",5000);
		hashMap.put("xyz",4000);
		hashMap.put("pqr",9000);
		System.out.println(hashMap.size());
	}

}
