package com.chegg.intern;
//class Internship that is child of Student
public class Internship extends Student {
	// special attribute of Internship
	private char FYP;
	// Constructor
	public Internship(String name, int iD, double cGPA, char fYP) {
		super(name, iD, cGPA);
		this.FYP = fYP;
	}
	// method to return the FYP results
	public String getFYPResults() {
		// if FYP is P then return as Passed
		if (FYP == 'P') {
			return "Passed";
		}
		// if FYP is F then return as Failed
		if (FYP == 'F') {
			return "Failed";
		}
		// if FYP is K then return as In Evaluation
		if (FYP == 'K') {
			return "In Evaluation";
		}
		// otherwise return as UnKnown
		return "UnKnown";
	}

	// method to check Internship
	public String checkInternship() {
		// if CGPA greater than 2.5 and FYP is Passed
		if (CGPA > 2.5 && FYP == 'P') {
			// then Proceed to Internship
			return "Proceed to Internship";
		}
		// Otherwise cannot proceed to internship
		else {
			return "Cannot proceed to Internship";
		}
	}

	// method to display the info of Internship
	public void displayInfo() {
		// call parent Class displayInfo method
		super.displayInfo();
		// print Internship specific details
		System.out.println("FYP Result: " + getFYPResults());
		System.out.println("Internship: " + checkInternship());
		System.out.println();
	}
}
