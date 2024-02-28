package com.day22;

public class Demo3 extends Thread{
	public void run() {
		try {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		}
		catch(InterruptedException e) {
			System.out.println("Interruption Handled");
		}
		}
	}
