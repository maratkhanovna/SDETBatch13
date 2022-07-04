package com.syntax.reviewclass06;

public class Student {
	//define attributes/fields/properties = variables
	String name, lastName, address;
	int studentId, age;
	char grade;
	
	//define behavior = methods	
	void study() {
		System.out.println(name+" student is studying");
	}
	void doHomework() {
		System.out.println(name+" student is doing homework");
	}
	
	//create a method that will return full name of a student in upper case	
	String getFullName() {
		return name.toUpperCase()+" "+lastName.toUpperCase();
	}
	
	//create a method to display/print full info of a student in upper case
	//full name+age+id+address	
	void printInfo() {
		System.out.println(name+" "+lastName+" is "+age+" and lives in "+address);
	}
	
	//create a method that will return a whether student is great/good/average based on the grade	
	String rating() {
		switch (grade) {
		case 'A':
			return "great";			
		case 'B':
			return "good";
		case 'C':
			return "average";
		default:
			return "bad";
		}
	}
	void takeSubject(String subject) {
		System.out.println(name+" studies "+subject);
	}
	
	
}
