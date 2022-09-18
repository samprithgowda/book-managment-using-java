package com.assignment1;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class DOA {
     UI u = new UI();
	Scanner sc = new Scanner(System.in);
	public void DisplayAllBook() {
		Iterator<Book> itr = u.data.iterator();
		while (itr.hasNext()) {
			 System.out.println(itr.next()); 
			
		}
	}
	
	public void searchById() {
		System.out.println("Enter the ID");
		int x = sc.nextInt();
		Iterator<Book> itr = u.data.iterator();
		while (itr.hasNext()) {
			Book b = itr.next();
			if(b.getBookId()==x)
			 System.out.println(b); 
			
		}
		
	}
	
	
	
	public void insert(Book o) {
		boolean a = u.data.add(o);
		if(a==true) {
		System.out.println("Your Record added succeesfully......");
		}
		else {
			System.out.println("Something Went wrong");
		}
	}
	
	
	public void deleteById() {
		System.out.println("Enter the ID");
		int x = sc.nextInt();
		Iterator<Book> itr = u.data.iterator();
		while (itr.hasNext()) {
			Book b = itr.next();
			if(b.getBookId()==x)
				itr.remove();
			 System.out.println("removed"); 
			break;
		}
	}
	
	public void update() {
		
		System.out.println("Enter the ID");
		int x = sc.nextInt();
		Iterator<Book> itr = u.data.iterator();
        while(itr.hasNext()) {
        	Book bid=itr.next();
            if(((bid).getBookId())==x) {
            	System.out.println(bid); 
        		System.out.println("Enter the Updated Price");
        		Double uP = sc.nextDouble();
        		bid.setPrice(uP);
				u.data.add(bid);
				System.out.println("Price Updated.......");
	}
}
}
}