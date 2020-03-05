package com.PerScholas.CoreJava;

import java.util.Scanner;

public class StudentGrades {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter Student Name:");
		String name = input.nextLine();
		System.out.println("Scores of "+name+":");
		System.out.println("Enter the number of exams:");
		int num = input.nextInt();
		int score= 0;
		int total=0;
		int min=100000,max=0;
		
		for(int i=1;i<=num;i++)
		{
			System.out.println("Enter Exam Score "+i+":");
			score=input.nextInt();
			
			if(score<min)
				min=score;
			if(score>max)
				max=score;
			
			total+=score;			
		}
		
		System.out.println("total="+total +"\nmin= "+min+"\nmax= "+max);
		

	}

}
