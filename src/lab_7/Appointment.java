package lab_7;

public class Appointment {

	// attributes
	private int day;
	private int month;
	private String description;

	// Constructor that initializes attributes with given values
	public Appointment(int day, int month, String description) {
		this.day = day;
		this.month = month;
		this.description = description;
	}

	/**
	 * method hasTheSameDate() that compare with another Appointment object and
	 * return true if it has the same date (day and month) and false otherwise
	 */
	public boolean hasTheSameDate(Appointment obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		if (day != obj.day)
			return false;
		if (month != obj.month)
			return false;
		return true;

	}

	/**
	 * toString() method to return a string in the format of Appointment object
	 */
	public String toString() {
		return this.month + "/" + this.day + ": " + this.description;
	}
}
