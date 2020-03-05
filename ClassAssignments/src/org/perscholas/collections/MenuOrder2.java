package org.perscholas.collections;

import java.util.HashMap;
import java.util.Scanner;

public class MenuOrder2 {

	public static void main(String[] args) {
		HashMap<Integer,Integer> order = new HashMap<Integer,Integer>();
		Scanner scan = new Scanner(System.in);
		int c = 0, t = 0, s = 0, userInput = 0;
		order.put(1, 0);
		order.put(2, 0);
		order.put(3, 0);

		do {
			System.out.println("Select one of the following:");
			System.out.println("1-Coffee");
			System.out.println("2-Tea");
			System.out.println("3.Sandwich");
			System.out.println("4.Exit");

			userInput = scan.nextInt();

			switch (userInput) {
			case 1:
				//c++;
				order.put(1,(order.get(1)+1));
				System.out.println("coffee added");
				break;
			case 2:
				//t++;
				order.put(2,(order.get(2)+1));
				System.out.println("tea added");
				break;
			case 3:
				//s++;
				order.put(3,(order.get(3)+1));
				System.out.println("sandwich added");
				break;
			default:
				System.out.println("Order Complete");

			}

		} while (userInput < 4);
		scan.close();
		
		System.out.println("Order Details:");
		System.out.println("**************");
		System.out.println("Coffee:"+order.get(1)+" @2 ="+(order.get(1)*2));
		System.out.println("Tea:"+order.get(2)+" @1 ="+(order.get(2)*1));
		System.out.println("Sandwich:"+order.get(3)+" @3 ="+(order.get(3)*3));
		System.out.println("Total= $" + ((order.get(1)*2) + (order.get(2)*1) + (order.get(3)*3)));
		//System.out.println(order);
	}
}
