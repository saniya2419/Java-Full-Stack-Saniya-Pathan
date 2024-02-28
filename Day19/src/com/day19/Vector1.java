package com.day19;

import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<>();
		vector.addElement(10);
		vector.addElement(20);
		vector.addElement(30);
		vector.addElement(40);
		
		System.out.println(vector);
		vector.removeElement(10);
		System.out.println(vector);
		vector.remove(1);
		System.out.println(vector);
		
		Integer a=vector.elementAt(1);
		System.out.println(a);
		
		System.out.println(vector.isEmpty());
		
		System.out.println(vector.size());
		System.out.println(vector.capacity());
		
		Vector<Integer> vc=new Vector<>();
		vc.addElement(1);
		vc.addElement(2);
		for(int i=3;i<11;i++) {
			vc.addElement(i);
		}
		System.out.println(vc);
		vc.addElement(11);
		System.out.println(vc);
		System.out.println("Capacity before: "+vc.capacity());
		
		for(int i=12;i<21;i++) {
			vc.addElement(1);
		}
		vc.addElement(21);
		System.out.println(vc.size());
		System.out.println("capacity after: "+vc.capacity());
	}

}
