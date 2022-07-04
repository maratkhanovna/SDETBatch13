package com.syntax.repls;



public class Repl83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = { { 1, 1, 2 }, // sum = 4
				{ 3, 1, 2 }, // sum = 6
				{ 3, 5, 3 }, // sum = 11
				{ 0, 1, 2 } // sum = 3
		};
		int sumRow = 0;
		for (int rows = 0; rows < a.length; rows++) {
			sumRow = 0;
			for (int columns = 0; columns < a[rows].length; columns++) {
				sumRow = sumRow + a[rows][columns];		
			}	
			System.out.println(sumRow);	
		}
		
	}
}
