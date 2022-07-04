package com.syntax.reviewclass03;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String user = "Gaukhar";
		String password = "pass123";
		// whenever we use primitive data types like byte, short, int, long, float,
		// double, boolean
		// we use ==
		// whenever we use non-primitive data types we use .equals method String

		if (user.equals("Gaukhar") && password.equals("pass123")) {
			System.out.println("Welcome back to Syntax");
		} else {
			System.out.println("username or password isnot correct");
		}
		//when debugging make sure 
		//you have not disabled the breakpoint
		//you have not enabled the skip all breakpoints option in debug window

	}

}
