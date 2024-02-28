package com.day22;

public class MultiThreading1 extends Thread{
	public static void main(String[] args) throws InterruptedException {
		MultiThreading1 obj=new MultiThreading1();
		obj.start();
		for(int j=0;j<=10;j++) {
			System.out.print(" j:"+j);
			Thread.sleep(1000);
		}
	}
	
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.print(" i:"+i);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interruped");
		}
	}

}
