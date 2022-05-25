package com.chegg.Assignment;

public class Project extends Assignment {

	// instance variables
	private String dueDate;
	private boolean groups;

	// constructor
	public Project(String name, double availablePoints, double earnedPoints, String dueDate, boolean groups) {
		super(name, availablePoints, earnedPoints);
	}

	// Getter method for dueDate
	public String getDueDate() {
		return dueDate;
	}

	// setter method for due date
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	// getter method for isGroups
	public boolean isGroups() {
		return groups;
	}

	// Setter method for isgroups
	public void setGroups(boolean groups) {
		this.groups = groups;
	}

	// toString method
	public String toString() {
		return super.toString() + "\t" + dueDate + "\t" + groups;
	}

}