package org.perscholas.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuOrder {
	static int coffee = 0;
	static int tea = 0;
	static int sandwich = 0;
	static int userCups = 0;
	static int userMenu = 0;
	static int total = 0;
	static int orderCost = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>(3);
		list.add(0, 0);
		list.add(1, 0);
		list.add(2, 0);

		while (userMenu != 4) {
			System.out.println("Choose an item:\n1.Cofee-$3\n2.Tea-$2\n3.Sandwich-$6\n4.End Order");
			userMenu = scan.nextInt();
			switch (userMenu) {
			case 1:
				System.out.println("How many cup(s) of coffee?");
				userCups = scan.nextInt();
				list.set(0, (list.get(0) + userCups));
				orderCost = userCups * 3;
				total += orderCost;
				System.out.println(userCups + "cup(s) of coffee added to order.");
				System.out.println(list);
				userCups = 0;
				orderCost = 0;
				break;
			case 2:
				System.out.println("How many cup(s) of tea?");
				userCups = scan.nextInt();
				list.set(1, (list.get(1) + userCups));
				orderCost = userCups * 3;
				total += orderCost;
				System.out.println(userCups + "cup(s) of tea added to order.");
				System.out.println(list);
				userCups = 0;
				orderCost = 0;
				break;
			case 3:
				System.out.println("How many sandwich(s)?");
				userCups = scan.nextInt();
				list.set(2, (list.get(2) + userCups));
				orderCost = userCups * 3;
				total += orderCost;
				System.out.println(userCups + "sandwich(s) added to order.");
				System.out.println(list);
				userCups = 0;
				orderCost = 0;
				break;
			case 4:
				System.out.println("Order:");
				System.out.println("-------");
				for (int i = 0; i < list.size(); i++) {
					if (i == 0 && list.get(0) != 0) {
						System.out.println(list.get(0) + " Cup(s) of coffee.");
					} else if (i == 1 && list.get(1) != 0) {
						System.out.println(list.get(1) + " Cup(s) of tea.");
					} else if (i == 2 && list.get(2) != 0) {
						System.out.println(list.get(2) + " Sandwich(s).");
					}
				}
				System.out.println("-------");
				System.out.println("Total cost: $" + total);
				break;
			default:
				System.out.println("Enter 1-4");
				break;
			}

		}
		scan.close();
	}
}
