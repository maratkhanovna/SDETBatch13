package com.syntax.reviewclass05;

public class NestedLoop {

	public static void main(String[] args) {
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if (j>i) {
				System.out.println(i);
				}
			}
		}

	}

}
