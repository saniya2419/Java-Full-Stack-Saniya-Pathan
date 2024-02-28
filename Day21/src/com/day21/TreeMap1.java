package com.day21;

import java.util.Map;
import java.util.TreeMap;
/**
 * returns values in ascending order
 * doesn't accepts null values
 */

public class TreeMap1 {
	public static void main(String[] args) {
		TreeMap<String, Integer> th=new TreeMap<>();
		th.put("Sony", 10000);
		th.put("LG", 20000);
		th.put("Samsung", 30000);
		th.put("Hitachi", 40000);
		System.out.println(th);
		
		for(Map.Entry<String, Integer> obj : th.entrySet()) {
			System.out.println("Key: "+obj.getKey());
			System.out.println("Value: "+obj.getValue());
		}
		
		
	}

}
