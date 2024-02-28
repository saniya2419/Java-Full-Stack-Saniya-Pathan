package com.day22;
/**
 * single threading
 */
public class A {
	public static void main(String[] args) {
		A obj = new A();
		obj.m1();
		for(int j=0;j<=10;j++) {
			System.out.println("j: "+j);
		}
	}
	
	public void m1() {
		for(int i=0;i<=10;i++) {
			System.out.println("i: "+i);
		}
	}

}
