package com.syntax.reviewclass02;

import java.util.Scanner;

public class IfElseDemo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your account balance");
		double accountBalance=scanner.nextDouble();
		System.out.println("PLease enter the amount that you want to lend to your friend");
		double amountToLend=scanner.nextDouble();
		
		if (accountBalance>=amountToLend) {
			System.out.println("Yes I can help you");
		}else {
			System.out.println("Sorry I don't have enough money to help you");
		}
		scanner.close();
	}

}
