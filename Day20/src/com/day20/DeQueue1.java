package com.day20;

import java.util.ArrayDeque;

/**
 * data insertion is given in order
 * data can be inserted from both sides
 */
public class DeQueue1 {
	public static void main(String[] args) {
		ArrayDeque adq=new ArrayDeque();
		adq.add(100);
		adq.add(200);
		adq.add(300);
		adq.add(400);
		
		System.out.println(adq);
		System.out.println(adq.removeFirst());
		System.out.println(adq.removeLast());
		System.out.println(adq);
	}

}
