package com.test.string;

import java.util.HashSet;
import java.util.Set;

public class MergeNames {
    
    public static String[] uniqueNames(String[] names1, String[] names2) {
    	Set<String> uniqueSet = new HashSet<String>();
    	for(String str : names1) {
    		uniqueSet.add(str);
    	}
    	
    	for(String str : names2) {
    		uniqueSet.add(str);
    	}
    	
    	String[] uniqueArr = new String[uniqueSet.size()];
    	
    	int i = 0;
    	
    	for(String str : uniqueSet) {
    		uniqueArr[i++] = str;
    	}
    	
    	return uniqueArr;
        //throw new UnsupportedOperationException("Waiting to be implemented.");
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}