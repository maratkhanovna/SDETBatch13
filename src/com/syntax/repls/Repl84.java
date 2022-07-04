package com.syntax.repls;

public class Repl84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { -5, -2, -3, 7 }, { 1, -5, -2, 2 }, { 1, -2, 3, -4 } };
		int total = 0;
		for (int[] x : a) {
			for (int y : x) {
				if (y % 2 != 0 && y < 0)
					total++;
			}
		}
		System.out.println(total);

	}

}
