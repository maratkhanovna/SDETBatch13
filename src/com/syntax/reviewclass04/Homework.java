package com.syntax.reviewclass04;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Write a program to ask a user to enter item
		 *  they want to buy and the price of that item. 
		 *  Every time user enters money, accumulate 
		 *  the amount and tell the user how much is left to pay off.
		 *  If user give more money program should return a change.
		 *  Whenever a user done with payments program should
		 *  say "Thank you for shopping!"
		 */
		double accumulatedAmount=0;
		Scanner input = new Scanner (System.in);
		double amountToPayOff;
		do {				
		System.out.println("Please enter item that you want to buy");
		String itemName=input.next();
		System.out.println("What is the the price of item?");
		Double itemPrice=input.nextDouble();
		accumulatedAmount=accumulatedAmount+itemPrice;
		System.out.println("Please enter the money");
		double money=input.nextDouble();
		amountToPayOff=money-accumulatedAmount;
		if (amountToPayOff<0) {
		System.out.println("Amount to pay off "+ (-1*amountToPayOff));
		}
		}while (amountToPayOff<0);
		System.out.println("Here is your change "+amountToPayOff+" Thank you for shopping");
			
		
		//System.out.println(itemName+" "+itemPrice);
		
		input.close();

	}

}