package com.day19;

import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<>();
		set.add(10);
		set.add(30);
		set.add(20);
		set.add(50);
		set.add(10);
		System.out.println(set.size());
		System.out.println(set.contains(20));
//		System.out.println(set.pollFirst());
//		System.out.println(set.pollLast());
		set.remove(20);
		System.out.println(set);
//		System.out.println(set.size());
		
		TreeSet<String> set1=new TreeSet<>();
		set1.add("abc");
		set1.add("ocd");
		set1.add("sanu");
		set1.add("obj");
		set1.add("10");
		System.out.println(set1);
	}

}
