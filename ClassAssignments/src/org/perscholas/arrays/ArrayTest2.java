package org.perscholas.arrays;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ArrayTest2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter seats");
		String s= scan.nextLine();
		boolean bn=Pattern.matches("[a-zA-Z][1-10],{n}", s);
		System.out.println(bn);
		String book ="A14,B10,C9";
		String[] b= book.split(",");
		System.out.println(b[0]+b[1]+b[2]);
		for(int i=0;i<b.length;i++) {
		
		String[] c = b[i].split("(?<=\\D)(?=\\d)");
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[0]+c[1]);

		char ch= c[0].trim().charAt(0);
		int n= Integer.parseInt(c[1]);
		System.out.println(ch+"  "+n);
		
		}
		//char row= c[0].charAt(0);
		//int num= Integer.parseInt(c[1]);
		//	System.out.println(c[i]);
			//System.out.println(c1[i]);
		//}
		//System.out.println(row +"   "+num);
	}
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter number of students:");
//		int numS=input.nextInt();
//		System.out.println("Enter number of exams:");
//		int numE = input.nextInt();
//		
//		String[] student = new String[numS];
//		double[][] score = new double[numS][numE];
//		double[] avg = new double[numS];
//		double sum=0;
//		for(int i=0;i<numS;i++) {
//			System.out.println("Enter Stuent"+(i+1)+" Name:");
//			student[i]=input.next();
//			sum=0;
//			for(int j=0;j<numE;j++) {
//				System.out.println("Enter Exam#"+(j+1)+" score:");
//				score[i][j]=input.nextDouble();
//				sum+=score[i][j];
//			}
//			avg[i]=sum/numE;
//		}
//		input.close();
//		
//		for(int i=0;i<numS;i++) {
//			System.out.print(student[i]);
//			for(int j=0;j<numE;j++) {
//				System.out.print("  "+score[i][j]);
//			}
//			System.out.println(" "+avg[i]);
//		}
//
//	}

}
