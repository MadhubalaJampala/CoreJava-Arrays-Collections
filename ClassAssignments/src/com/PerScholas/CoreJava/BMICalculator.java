package com.PerScholas.CoreJava;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Your height in m:");
		double height = input.nextDouble();
		System.out.println("Your weight in kg:");
		double weight = input.nextDouble();
		double bmi = weight / (height * height);
		System.out.println("Your BMI is "+bmi);
		input.close();
	}
}