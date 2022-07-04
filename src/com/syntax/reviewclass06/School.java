package com.syntax.reviewclass06;

public class School {
	public static void main(String[] args) {
		
		System.out.println("hello ");
		
		//accessing variables of Student class
		Student student1 = new Student();
		student1.name="Gaukhar";
		student1.lastName = "Razakberlina";
		student1.address = "New York";
		student1.studentId = 101;
		student1.age = 30;
		student1.grade = 'A';
		//accessing variables of Student class
		Student student2 = new Student();
		student2.name="Samira";
		student2.lastName = "Pashayeva";
		student2.address = "Virginia";
		student2.studentId = 100;
		student2.age = 25;
		student2.grade = 'A';
		//accessing methods of Student class
		student2.study();
		student2.doHomework();
		student1.study();
		student1.doHomework();
		
		String fullName = student1.getFullName();
		System.out.println(fullName);
		fullName = student2.getFullName();
		System.out.println(fullName);
		System.out.println("-------ANOTHER WAY----------");
		System.out.println(student1.getFullName());
		System.out.println(student2.getFullName());
		
		student1.printInfo();
		student2.printInfo();
		
		student1.takeSubject("Java");
		student2.takeSubject("Biology");
		
		
	}

}
