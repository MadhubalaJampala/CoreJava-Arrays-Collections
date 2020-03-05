package com.PerScholas.CoreJava;

import java.util.Scanner;

public class CalculateSalesTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the price:");
		double price = input.nextDouble();
		double salesTax = (8.875 *  price) / 100;
		double roundedSalesTax = Math.round(salesTax*100.0)/100.0;
		System.out.println("SalesTax: "+roundedSalesTax);
	}

}
