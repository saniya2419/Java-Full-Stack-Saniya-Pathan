package com.day22;

import java.util.Scanner;

public class DemoJoin extends Thread {
	static int sum, n;
	public static void main(String[] args) throws InterruptedException {
		long startTime= System.currentTimeMillis();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		DemoJoin.n=sc.nextInt();
		DemoJoin dm=new DemoJoin();
		dm.start();
		dm.join();
		System.out.println("Sum is: "+DemoJoin.sum);
		
		long endTime= System.currentTimeMillis();
		System.out.println((endTime-startTime)/1000);
	}
	
	public void run() {
		for(int i=1;i<=DemoJoin.n;i++) {
			DemoJoin.sum=DemoJoin.sum+i;
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
