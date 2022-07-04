package com.syntax.reviewclass03;

public class IfElse2 {

	public static void main(String[] args) {
		// When code executes but doesn't produce expected result we call these mistakes logical errors
		//When code doesn't executes we call these mistakes syntax errors
		String day = "Friday";//in non primitive type of variables we can store null which means nothing
		
		if(day.equals("Friday")) {
			System.out.println("Weekday");
		}else if ("Tuesday".equals(day)) {
			System.out.println("Weekday");
		}
		// if we want to test multiple conditions we go with if else if conditions
	}

}
