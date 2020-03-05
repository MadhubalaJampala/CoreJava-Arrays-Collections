package org.perscholas.collections;

import java.util.LinkedList;
import java.util.Scanner;

public class MyLinkedList1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedList<String> book= new LinkedList<String>();
		System.out.println("How many books?");
		int num = scan.nextInt();
		
		for(int i=0;i<num;i++) {
			System.out.println("\n\nEnter details for Book#"+(i+1)+":");
			System.out.println("Enter Book Title:");
			book.add(scan.next());
			System.out.println("Enter Author of the book:");
			book.add(scan.next());
			System.out.println("Enter Book ISBN:");
			book.add(scan.next());
		}
		scan.close();
		
		for(int i=0,j=1;i<book.size();i=i+3,j++) {
			System.out.println("\n\nBook#"+j+" Details:");
			System.out.println("Title:"+book.get(i));
			System.out.println("Author:"+book.get(i+1));
			System.out.println("ISBN:"+book.get(i+2));
		}
	}

}
