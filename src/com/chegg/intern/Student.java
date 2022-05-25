package com.chegg.intern;

public class Student {

	// attributes of Student
	protected String name;
	protected int ID;
	protected double CGPA;

	// Constructor
	public Student(String name, int iD, double cGPA) {
		this.name = name;
		ID = iD;
		CGPA = cGPA;
	}

	// displayInfo method to print info of Student
	public void displayInfo() {
		System.out.println("Name: " + this.name);
		System.out.println("Matrics: " + this.ID);
		System.out.println("CGPA: " + this.CGPA);
	}
}
