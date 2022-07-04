package com.syntax.reviewclass02;

public class OperatorsDemo {

	public static void main(String[] args) {
		//Operators in Java
		/*
		 * Arithmetic Operators +, -, *, /, %
		 * Relational Operators <, >, <=, >=
		 * Equality Operators ==,!=
		 */
		int num=10;
		int num2=10;
		System.out.println(num>=num2);//num>num2=>false or num=num2=>true false+true=true
		//Whole 0-infinity Negative infinity to Positive infinity
		System.out.println(Long.MAX_VALUE);//gives us the maximum range
		System.out.println(Long.MIN_VALUE);//gives us the minimum range
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(num/num2);
		System.out.println(num%num2);
		
		System.out.println(10/3);
		System.out.println(10%3);
	}

}
