package com.day21;

import java.util.HashMap;
import java.util.Map;

/**
 * not ordered 
 * saves data in natural order
 * 
 */

public class HashMap1 {
	public static void main(String[] args) {
	HashMap<Integer, String> hs= new HashMap<>();
	hs.put(1, "Satara");
	hs.put(2, "Pune");
	hs.put(3, "Mumbai");//more than one value can be null
	hs.put(null, "Kolhapur");//key can be null only once, if more than 1 key is null, latest value for null key is updated
	System.out.println(hs);
	
//	System.out.println(hs.remove(1, "Satara"));
	
	for(Map.Entry<Integer, String> obj: hs.entrySet()) {
		System.out.println("Key: "+obj.getKey());
		System.out.println("Value: "+obj.getValue());
	}
	}
	

}
