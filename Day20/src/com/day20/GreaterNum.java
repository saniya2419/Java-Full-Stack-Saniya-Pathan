package com.day20;

import java.util.Scanner;
import java.util.TreeSet;

public class GreaterNum {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	TreeSet<Integer> lk=new TreeSet<>();
	lk.add(sc.nextInt());
	lk.add(sc.nextInt());
	lk.add(sc.nextInt());
	lk.add(sc.nextInt());
	lk.add(sc.nextInt());
	System.out.println(lk);
	System.out.println(lk.last());
	}

}
