package org.perscholas.collections;

import java.util.HashMap;
import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap<String, Integer> mapA = new HashMap<String, Integer>();
		HashMap<String, Integer> mapB = new HashMap<String, Integer>();
		HashMap<String, Integer> mapC = new HashMap<String, Integer>();
		HashMap<String, Integer> mapD = new HashMap<String, Integer>();
		HashMap<String, Integer> mapF = new HashMap<String, Integer>();
		String s ="Y";
		do {
			System.out.println("Enter Student Name:");
			String name = input.next();
			System.out.println("Enter Student Scores:");
			int score = input.nextInt();
			System.out.println("Enter 'Y' to continue,'X' to exit:");
			s = input.next();
			if(score >=90)
				mapA.put(name, score);
			else if(score <90 && score>=80)
				mapB.put(name,score);
			else if(score<80 && score>=70)
				mapC.put(name,score);
			else if(score<70 && score>=60)
				mapD.put(name, score);
			else if(score<60)
				mapF.put(name, score);
		}while(!s.equalsIgnoreCase("X"));
		
		input.close();
		System.out.println("\nList of students with Grade A");
		System.out.println("Name \t Score");
		mapA.forEach((keys,values) -> {
			System.out.println(keys+"\t"+values);
		});
		System.out.println("\nList of students with Grade B");
		System.out.println("Name \t Score");
		mapB.forEach((keys,values) -> {
			System.out.println(keys+"\t"+values);
		});
		System.out.println("\nList of students with Grade C");
		System.out.println("Name \t Score");
		mapC.forEach((keys,values) -> {
			System.out.println(keys+"\t"+values);
		});
		System.out.println("\nList of students with Grade D");
		System.out.println("Name \t Score");
		mapD.forEach((keys,values) -> {
			System.out.println(keys+"\t"+values);
		});
		System.out.println("\nList of students with Grade F");
		System.out.println("Name \t Score");
		mapF.forEach((keys,values) -> {
			System.out.println(keys+"\t"+values);
		});
	}

}
