package org.inherit;

public class Student extends Employee {

	private void studentName() {

		String name = "Kumar";

		System.out.println("Student name is :" + name);

	}

	public static void main(String[] args) {
		Student a = new Student();

		a.employeeName();
		a.studentName();
		System.out.println("**********");

		Employee obj = new Employee();
		obj.employeeName();
		// Error obj.studentName();
		System.out.println("**********");

		Employee b = new Student();
		b.employeeName();
		// this is error b.studentName();
		System.out.println("*********");
		
		// Error  Student c=new Employee();
	
	}
}