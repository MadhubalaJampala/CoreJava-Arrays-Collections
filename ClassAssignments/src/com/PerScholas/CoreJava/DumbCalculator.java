package com.PerScholas.CoreJava;

import java.util.Scanner;

public class DumbCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your first number?");
		double n1 = input.nextDouble();
		System.out.println("What is your second number?");
		double n2 = input.nextDouble();
		System.out.println("What is your third number?");
		double n3 = input.nextDouble();
		input.close();
		double calc = (n1+n2+n3)/2;
		System.out.println("("+n1+"+"+n2+"+"+n3+") / 2 is ..."+ calc);
	}

}
