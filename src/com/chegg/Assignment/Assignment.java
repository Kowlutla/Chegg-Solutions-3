package com.chegg.Assignment;

public class Assignment {
	// instance variables
	private String name;
	private double availablePoints;
	private double earnedPoints;

	// Constructor
	public Assignment(String name, double availablePoints, double earnedPoints) {
		this.name = name;
		this.availablePoints = availablePoints;
		this.earnedPoints = earnedPoints;
	}

	// getter method for name
	public String getName() {
		return name;
	}

	// setter method for name
	public void setName(String name) {
		this.name = name;
	}

	// getter method for availablepoints
	public double getAvailablePoints() {
		return availablePoints;
	}

	// setter method for available points
	public void setAvailablePoints(double availablePoints) {
		this.availablePoints = availablePoints;
	}

	// getter method for earned points
	public double getEarnedPoints() {
		return earnedPoints;
	}

	// setter method for earned points
	public void setEarnedPoints(double earnedPoints) {
		this.earnedPoints = earnedPoints;
	}

	// toString method to return String representation Of Assignment
	public String toString() {
		return this.name + "\t" + this.availablePoints + "\t" + this.earnedPoints;
	}
}