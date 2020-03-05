package com.PerScholas.CoreJava;

public class CarPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cars,drivers,passengers,cars_not_driven,cars_driven;
		double space_in_a_car,carpool_capacity,average_passengers_per_car,
		average_miles_driven,average_miles_per_gallon,gas_cost_per_gallon,
		money_saved,gas_cost_per_trip;
		
		cars = 100;
		space_in_a_car = 4.0;
		drivers = 30;
		passengers = 90;
		average_miles_driven = 29.2;
		average_miles_per_gallon = 23.6;
		gas_cost_per_gallon = 2.517;
		
		cars_not_driven= cars-drivers;
		cars_driven=drivers;
		carpool_capacity=cars_driven * space_in_a_car;
		average_passengers_per_car= passengers / cars_driven;
		gas_cost_per_trip = (average_miles_driven * gas_cost_per_gallon)/average_miles_per_gallon;
		money_saved =  (gas_cost_per_trip * cars) - (gas_cost_per_trip * cars_driven);
		
		System.out.printf("There are %d cars available.\n"
				+ "There are only %d drivers available.\n"
				+ "That means there will be %d empty cars today!\n"
				+ "We can transport %f people today.\n"
				+ "Out of that, we\'re transporting %d today.\n"
				+ "So we\'ll need to put about %f in each car.\n"
				+ "Long story short, today,we\'ll be saving about %f "
				,cars,drivers,cars_not_driven,carpool_capacity,passengers,
				average_passengers_per_car,money_saved);
		
	}

}
