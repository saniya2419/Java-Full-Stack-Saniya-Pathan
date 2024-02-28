package com.day19;

import java.util.ArrayList;
import java.util.HashSet;

public class Set1 {
	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		arr.add(100);
		arr.add(200);
		arr.add(300);
		arr.add(100);
		arr.add(null);
		arr.add(null);
		System.out.println(arr);
		
		HashSet<Integer> set=new HashSet<Integer>();
		set.addAll(arr);
//		set.add(100);
//		set.add(200);
//		set.add(300);
//		set.add(400);
//		set.add(100); //no duplicates added
//		set.add(null);// only once
		System.out.println(set);
		System.out.println(set.size());
//		set.clear();
		System.out.println(set.isEmpty());
		System.out.println(set);
		
		Object ab[]=set.toArray();
		for(Object ab1:ab) {
			System.out.println(ab1);
		}
		}

}
