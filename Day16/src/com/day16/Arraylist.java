package com.day16;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
//		for(int i=0;i<100;i++) {
//			System.out.println();
//		}
		
//		ArrayList ar=new ArrayList();
//		ar.add(10);
//		ar.add(20);
//		ar.add(30);
//		list.add(ar);
		
//		System.out.println(list);
//		System.out.println(list.contains(40));
//		list.remove(2);
//		System.out.println(list);
//		System.out.println(list.equals(list));
//		System.out.println(list.isEmpty());
//		list.set(1, 11);
//		System.out.println(list);
		
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
//		ListIterator ltr=list.listIterator();
//		while(ltr.hasNext()) {
//			System.out.print(ltr.next()+" ");
//		}
//		System.out.println("");
//		while(ltr.hasPrevious()) {
//			System.out.print(ltr.previous()+" ");
//		}
	}

}
