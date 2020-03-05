package com.PerScholas.CoreJava;

import java.util.Scanner;

public class BasicJavaInput2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the following information so I can sell it for profit!");
		Scanner input = new Scanner( System.in);
		String fname,lname,login;
		int grade,id;
		double gpa;
		
		System.out.println("Enter your First Name:");
		fname = input.next();
		System.out.println("Enter your Last Name:");
		lname = input.next();
		System.out.println("Enter your Grade(9-12):");
		grade=input.nextInt();
		System.out.println("Enter your Student ID:");
		id= input.nextInt();
		System.out.println("Enter your Login:");
		login = input.next();
		System.out.println("Enter your GPA(0.0-4.0):");
		gpa=input.nextDouble();
		input.close();
		
		System.out.println("Your information:");
		System.out.println("Login: "+ login);
		System.out.println("ID: "+id);
		System.out.println("Name: "+lname+", "+fname);
		System.out.println("GPA: "+gpa);
		System.out.println("Grade: "+grade);
	}

}
