package com.day21;

import java.util.LinkedHashMap;
import java.util.Map;
/**
 * is ordered
 * returns data according to insertion order
 * is not synchronized
 * contains unique key values
 * bit similar to HashMap
 */

public class LinkedHashMap1 {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lhs=new LinkedHashMap<>();
		lhs.put("Apple", 100);
		lhs.put("Mango", 200);
		lhs.put("Grapes", 300);
		lhs.put("Oranges", 400);
		System.out.println(lhs);
		
		for(Map.Entry<String, Integer> obj : lhs.entrySet()) {
			System.out.println("Key: "+obj.getKey());
			System.out.println("Value: "+obj.getValue());
		}
		
	}

}
