package org.perscholas.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		

		
		
		Map<Integer,String> emp = new HashMap<Integer,String>();
		
//		emp.put(001, "Java Developer");
//		emp.put(002, "Application Developer");
//		System.out.println(emp);
//		System.out.println(emp.keySet());
//		System.out.println(emp.values());
		
		Scanner scan = new Scanner(System.in);
		int num =-1; String str ="";
		while(num!=0) {
		System.out.println("Enter number of employees:");
		num = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter employee name:");
		str = scan.nextLine();
		emp.put(num,str);
		}
		
		scan.close();
		
		for(Map.Entry<Integer,String> o: emp.entrySet()) {
			System.out.println(o);
			//System.out.println(o.getKey());
		}
	}

}
