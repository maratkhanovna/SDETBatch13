package com.syntax.repls;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {12, 15, 11, 13, 9, 25};
		int[] a2 = {12, 15, 11, 13, 9, 25};
		int sum = 0;
		for (int i = 0; i <a.length; i++) {
		         if (a[i] % 2== a2[i ] % 5)  {
		                  sum += i * i;
		         }
		}
		System.out.println("sum = " + sum);
		
		System.out.println("----------------------");
		
		int z=2, sum2=0;

		while(z<9) {

		   z++;

		   sum2=sum2+z;

		}

		System.out.print(sum2);
	  
		

	}

}
