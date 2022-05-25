package com.chegg.Assignment;

public class Test extends Assignment {

	// instance variable
	private String testDate;

	// Constructor
	public Test(String name, double availablePoints, double earnedPoints, String testDate) {
		// calling super class constructor
		super(name, availablePoints, earnedPoints);
		this.testDate = testDate;
	}

	// getter method for test date
	public String getTestDate() {
		return testDate;
	}

	// setter method for test date
	public void setTestDate(String testDate) {
		this.testDate = testDate;
	}

	// toString method
	public String toString() {
		return super.toString() + "\t" + testDate;
	}

}