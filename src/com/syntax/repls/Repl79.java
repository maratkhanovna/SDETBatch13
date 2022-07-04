package com.syntax.repls;

public class Repl79 {

	public static void main(String[] args) {
		double[][] nums = {
			     {1.4, 2, 3.3, 2},
			     {4, 1.5, 6.1, 1},
			     {1.2, 3.1, 4, 1.6},     
			   };
		for (int rows=0; rows<nums.length; rows++) {
			for (int columns=0; columns<nums[rows].length; columns++) {
				System.out.printf("%5d", nums[rows][columns]+" ");
			}
			System.out.println();
		}

	}

}
