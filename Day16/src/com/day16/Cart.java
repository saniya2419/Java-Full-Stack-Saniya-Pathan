package com.day16;
import java.util.ArrayList;
import java.util.Iterator;

public class Cart {
	private ArrayList <Product> list;
	
	public Cart() {
		super();
		this.list=new ArrayList<>();
	}
	
	public void addItem(Product pd) {
		list.add(pd);
	}
	
	public void removeItem(String str) {
		Iterator<Product> itr=list.iterator();
		while(itr.hasNext()) {
			Product pd=(Product)itr.next();
			if(pd.getProductName()==str) {
				itr.remove();
			}
		}
	}
	
	public void display() {
		for(Product pd1:list) {
			System.out.println("Product name: "+pd1.getProductName()+" Product price: "+pd1.getPrice());
		}
	}

}
