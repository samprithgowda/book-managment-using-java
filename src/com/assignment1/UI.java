package com.assignment1;

import java.util.Scanner;
import java.util.TreeSet;

public class UI {

	public   TreeSet<Book> data;
	{
		data=new TreeSet<>();
	    
	     data.add(new Book (1,"computer Graphic","chandan",200.00));
	     data.add(new Book (2,"java","gaja",300.00));
	     data.add(new Book (3,"spring boot","samprith",500.00));
	     data.add(new Book (4,"algorithms","yogi",600.00));
	     data.add(new Book (5,"pythob","Chinmay",900.00));
	     data.add(new Book (6,"C ","vignesh",400.00));
	     
	}
	
	
	public static void main(String[] args) {

		
		DOA d = new  DOA();
 		
		Scanner sc = new Scanner(System.in);
		String str;
		do {

			System.out.println(" 1) VIEW ALL BOOKS \n 2) SEARCH BOOK BY ID "
					+ "\n 3) INSERT A BOOK \n 4)DELETE A BOOK \n 5)UPDATE THE BOOK PRICE By ID" + " \n 6)EXIT  ");

			System.out.println("Enter Your Choice...");
                String x = sc.next();
			switch (x) {
			case "1":
				d.DisplayAllBook();
				break;

			case "2":
                 d.searchById();
				break;
				
			case "3":
				System.out.println("Enter the bookid");
				int id =sc.nextInt();
				System.out.println("Enter the book name");
				String name = sc.next();
				System.out.println("Enter the author name");
				String au = sc.next();
				System.out.println("Enter the price ");
				double p =sc.nextDouble();
                 d.insert(new Book(id, name, au, p));
				break;
			case "4":
                  d.deleteById();
				break;
			case "5":
                  d.update();
				break;
			case "6": return;
				
				
			default:
				System.out.println("please Enter valid choice");
				break;
			}
			
			
			System.out.println("Enter Y to Main Menu");
			 str = sc.next();
		}while(str.equalsIgnoreCase("y"));

	}

	

}
