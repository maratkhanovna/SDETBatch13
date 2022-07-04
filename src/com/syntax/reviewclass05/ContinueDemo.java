package com.syntax.reviewclass05;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=0; i<5; i++) {
			System.out.println("Batch 13 is great");
			continue;
			//System.out.println("Batch 13 is exellent"); // this code will never be executed
		}
		
		System.out.println("---------------Next Example------------");

		for (int i=0; i<5; i++) {
			System.out.println("Batch 13 is great");
			if (i>2) {
			continue;
			}
			System.out.println("Batch 13 is exellent"); 
		}
		
		System.out.println("---------------Next Example------------");
		
		for (int i=0; i<5; i++) {
			System.out.println("Batch 13 is great");
			if (i<=2) {
				System.out.println("Batch 13 is exellent"); // we will get the same result with continue keyword
			}			
		}
		
	}

}
