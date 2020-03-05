package com.PerScholas.CoreJava;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter Student Name:");
		String name = input.nextLine();
		System.out.println("What are the scores of " + name + ":");
		System.out.println("Enter the number of exams:");
		int num = input.nextInt();
		if (num <= 0) {
			System.out.println("No Exams");
			System.exit(1);
		}
		double score[] = new double[num];
		double total = 0.0;
		double min = 100000, max = 0;
		for (int i = 0; i < num; i++) {
			System.out.println("Enter Exam#" + (i + 1) + " score:");

			score[i] = input.nextDouble();
			while (score[i] < 0 || score[i] > 100) {
				System.out.println("Please enter value between 0 and 100:");
				score[i] = input.nextDouble();
			}
			total += score[i];

			if (score[i] < min)
				min = score[i];
			if (score[i] > max)
				max = score[i];
		}
		input.close();
		System.out.println("\n\nScores of " + name + " are:");
		System.out.println("**************************");
		for (int i = 0; i < num; i++) {
			System.out.println("Exam#" + (i + 1) + " Score:" + score[i]);
		}

		System.out.println("Total Score=" + total + "\nMin= " + min + "\nMax= " + max);

		for(double x:score)
			System.out.println(x);
	}

}
