package com.syntax.reviewclass05;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SHOULD CREATE AN ARRAY
		String name="Oleg";
		String name2="King";
		String name3="Mumtaz";
		
		//SHOULD NOT CREATE AN ARRAY
		String city="New York";
		String country="USA";
		String continent="AmericA";
		
		//uses 5% of a time
		String[] names = {"Oleg", "King", "Mumtaz"};
		
		//uses 95% of a time
		String[] names2 = new String[3];
		names[0]="Oleg";
		names[1]="King";
		names[2]="Mumtaz";

	}

}
