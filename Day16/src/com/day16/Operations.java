package com.day16;

public class Operations {
	public static void main(String[] args) {
		Product pd=new Product("Orange",100);
		Product pd1=new Product("Apples",200);
		Product pd2=new Product("Mangos",600);
		Product pd3=new Product("Grapes",400);
		Cart cr=new Cart();
		
		cr.addItem(pd);
		cr.addItem(pd1);
		cr.addItem(pd2);
		cr.addItem(pd3);
		cr.display();
		System.out.println("****************************");
		cr.removeItem("Mangos");
		cr.display();
	}

}
