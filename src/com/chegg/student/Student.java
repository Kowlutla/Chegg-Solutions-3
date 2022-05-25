package com.chegg.student;

public class Student {
	
	private String name;
	private double gpa;
	
	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public double getGpa() {
		return gpa;
	}
	
	@Override
	public String toString()
	{
		return String.format("Student: %s %.2f", name,gpa);
	}
}
