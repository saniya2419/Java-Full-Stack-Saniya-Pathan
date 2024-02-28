package com.day22;

public class Demo2 implements Runnable{
	@Override
	public void run() {
		System.out.println("Check");
	}
	
	public static void main(String[] args) {
		Demo2 dm=new Demo2();
		Thread th=new Thread(dm);
		th.start();
	}

}
