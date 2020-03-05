package com.PerScholas.CoreJava;

import java.util.Scanner;

public class BasicInputJava3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Hi there. What\'s your name?");
		String name = input.next();
		System.out.println("Hi "+name+"! My name is Madhu. Nice to meet you.");
		System.out.println("How old are you?");
		int age = input.nextInt();
		int agein5 = age+5;
		int agebefore5 = age-5;
		System.out.println("Did you know that in five years you will be "+agein5+" years old");
		System.out.println("And five years ago you were "+agebefore5+"! Imagine that!");
		input.close();
		//System.out.println("age="+(age+5));
	}

}
