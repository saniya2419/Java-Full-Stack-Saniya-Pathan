package com.day22;

public class Ab extends Thread{
	public static void main(String[] args) {
		Ab obj=new Ab();
		obj.setPriority(MAX_PRIORITY);
		obj.setName("obj");
		obj.start();
		
		Ab obj1=new Ab();
		obj1.setPriority(MIN_PRIORITY);
		obj1.setName("obj1");
		obj1.start();
		
		Ab obj2=new Ab();
		obj2.setPriority(NORM_PRIORITY);;
		obj2.setName("obj2");
		obj2.start();
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

}
