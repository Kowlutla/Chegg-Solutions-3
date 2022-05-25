package com.chegg.stu;

public class Student {

	// Attributes of Student Class
	private int IDNumber;
	private int numberOfPoints;
	private int creditHours;
	private double gradePointAverage;

	/**
	 * Default Constructor
	 */
	public Student() {
		super();
		IDNumber = 9999;
		this.numberOfPoints = 12;
		this.creditHours = 3;
	}

	/**
	 * @param iDNumber the iDNumber to set
	 */
	public void setIDNumber(int iDNumber) {
		IDNumber = iDNumber;
	}

	/**
	 * @param creditHours the creditHours to set
	 */
	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}

	/**
	 * @param numberOfPoints the numberOfPoints to set
	 */
	public void setNumberOfPoints(int numberOfPoints) {
		this.numberOfPoints = numberOfPoints;
	}

	/**
	 * Method to compute GPA
	 */
	public void computeGPA() {
		this.gradePointAverage = numberOfPoints / creditHours;
	}

	/**
	 * Method to display the values of each field of Student
	 */
	public void display() {

		System.out.println("ID Number: " + this.IDNumber);
		System.out.println("Number Of Points: " + this.numberOfPoints);
		System.out.println("Credit Hours: " + this.creditHours);
		computeGPA();
		System.out.println("Grade Point Average: " + this.gradePointAverage);

	}

}
