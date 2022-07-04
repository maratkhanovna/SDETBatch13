package com.syntax.repls;

import java.util.Scanner;

public class Repl77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[5];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < nums.length; i++) {
			nums[i] = input.nextInt();
		}
		for (int i = nums.length - 1; i >= 0; i--) {
			System.out.println(nums[i]);
		}
		input.close();
	}
}
