package org.perscholas.arrays;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number of students:");
		int num = input.nextInt();
		String[] name=new String[num];
		int[] score = new int[num];
		
		for(int i=0;i<num;i++) {
			System.out.println("Enter Student Name:");
			name[i]=input.next();
			System.out.println("Enter Stuent Score:");
			score[i]=input.nextInt();
		}
		input.close();
		System.out.println("Name\tScore");
		System.out.println("***************");
		for(int i=0;i<num;i++) {
			System.out.println(name[i]+"\t"+score[i]);
		}
	}

}
