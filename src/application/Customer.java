package application;

public class Customer {

	// Data Fields
	String name;
	double monthlySalary;
	int experienceyears;

	// returns a number that represents the yearly salary of the Customer.
	public double yearlySalary() {
		return monthlySalary * experienceyears;
	}

	// calculates and returns the Customer bonus salary which is equal to
	// yearlySalary/4.
	public double bonusSalary() {
		double yearlySalary = yearlySalary();
		return yearlySalary / 4;
	}

	/**
	 * Senior(): checks if the Customer is a senior Customer by using the formula:
	 * (senior Customer has years of experience more than 10 years) and returns true
	 * or false accordingly.
	 */

	public boolean senior() {
		if (experienceyears > 10) {
			return true;
		} else {
			return false;
		}
	}

}
