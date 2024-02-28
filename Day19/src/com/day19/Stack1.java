package com.day19;

import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {
		Stack stack=new Stack();
		System.out.println("capacity before: "+stack.capacity());
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		System.out.println(stack);
		
		for(int i=1;i<7;i++) {
			stack.push(i);
		}
		stack.push(7);
		stack.push(8);
		System.out.println(stack);
		stack.pop();
		stack.peek();
		stack.search(400);
		stack.isEmpty();
		System.out.println(stack);
		System.err.println("capacity after: "+stack.capacity());
		
	}

}
