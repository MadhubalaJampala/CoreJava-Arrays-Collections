package org.perscholas.arrays;

import java.util.Scanner;

public class Array4D {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of classes: ");
		int classNo = scan.nextInt();
		System.out.println("Enter the number of exams: ");
		int examNo = scan.nextInt();
		System.out.println("Enter the number of problems: ");
		int probNo = scan.nextInt();
		System.out.println("Enter the number of students: ");
		int studNo = scan.nextInt();
		String[] studNames = new String[studNo];
		int[][][][] Student_arr = new int[classNo][examNo][studNo][probNo];
		int classes, exams, studs, probs;
		for (classes = 0; classes < classNo; classes++) {
			// fill 1d
			for (exams = 0; exams < examNo; exams++) {
				// fill 2d
				for (studs = 0; studs < studNo; studs++) {
					// fill 3d
					for (probs = 0; probs < probNo; probs++) {
						// fill 4d
						System.out.println("Enter value for class: " + (classes + 1) + " exam: " + (exams + 1)
								+ " student: " + (studs + 1) + " problems: " + (probs + 1));
						Student_arr[classes][exams][studs][probs] = scan.nextInt();
					}
				}
			}
		}
		for (classes = 0; classes < classNo; classes++) {
			System.out.println("Class# " + (classes + 1));
			for (exams = 0; exams < examNo; exams++) {
				System.out.println("Exam# " + (exams + 1));
				for (studs = 0; studs < studNo; studs++) {
					System.out.println("Student# " + (studs + 1));
					System.out.println("Problems Scores:");
					for (probs = 0; probs < probNo; probs++) {
						System.out.println(Student_arr[classes][exams][studs][probs] + " ");
					}
				}
			}
		}
	}
}
