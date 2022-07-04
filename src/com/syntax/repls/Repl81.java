package com.syntax.repls;

public class Repl81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5, 4, 8};

		int largest = nums[0];

		for (int i = 0; i < nums.length; i++) {
			for (int j = i ; j < nums.length; j++)
				if (nums[i] < nums[j]) {
					largest = nums[j];
				}
		}
		System.out.println(largest);

	}

}
