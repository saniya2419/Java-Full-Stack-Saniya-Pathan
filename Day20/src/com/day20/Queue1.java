package com.day20;

import java.util.PriorityQueue;

/**
* Queue follows FIFO method
* used when we want to use data or perform actions priority wise
*no null values
*duplicates are allowed
**/
public class Queue1 {
	public static void main(String[] args) {
		PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
		pq.offer(100);
		pq.offer(500);
		pq.offer(400);//if insertion is not n order it gets confused or else prints in sequence
		pq.offer(300);
		pq.offer(200);
		
		System.out.println(pq);
		pq.poll();//removes top most element and doesn't throws exception when queue is empty
		pq.remove();//does same as poll only throws exception when queue is empty
		System.out.println(pq);
		
	}

}
