package com.chegg.stu;

public class ShowStudent {

	public static void main(String[] args) {

		// Create Student Object
		Student student = new Student();
		// set id number using setter method
		student.setIDNumber(151337);
		// set number of points using setter method
		student.setNumberOfPoints(20);
		// set credit hours using setter method
		student.setCreditHours(4);

		// display the details of student
		student.display();
	}

}
