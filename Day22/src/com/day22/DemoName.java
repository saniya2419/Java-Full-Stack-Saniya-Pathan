package com.day22;

public class DemoName extends  Thread{
	public static void main(String[] args) {
	DemoName dm=new DemoName();
	dm.start();
	Thread ct1=Thread.currentThread();
	ct1.setName("Main");
	System.out.println(ct1.getName());
	}
	
	public void run() {
		Thread ct=Thread.currentThread();
		ct.setName("Thread");
		System.out.println(ct.getName());
	}
}
