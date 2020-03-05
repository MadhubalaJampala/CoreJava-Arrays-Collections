package org.perscholas.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyArrayList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of students:");
		int num = scan.nextInt();
		List<Integer> score = new ArrayList<Integer>();
		for(int i=0;i<num;i++) {
			System.out.println("Enter Score for Student "+(i+1));
			score.add(scan.nextInt());
		}
		
		scan.close();
		int total=0;
		double avg=0.0;
		for(int x:score) {
			System.out.println(x);
			total+=x;
		}
		System.out.println("total ="+total);
		avg = (double)total / num;
		System.out.println("avg="+avg);
	}

}
