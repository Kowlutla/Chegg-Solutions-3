package chapter8_debug;

/**
 * Student-class inherits Person-class
 */
public class Student extends Person {
	/**
	 * it has also own private attributes: - studentNumber(int) - startDate (String)
	 */

	private int studentNumber;
	private String startDate;

	/**
	 * public method: - printStudent, which prints data given by
	 * getPersonData-method as well as student number and starting date.
	 */

	public void printStudent() {
		System.out.println(super.getPersonData() + " , " + this.studentNumber + " , " + this.startDate);
	}

	/**
	 * @return the studentNumber
	 */
	public int getStudentNumber() {
		return studentNumber;
	}

	/**
	 * @param studentNumber the studentNumber to set
	 */
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	/**
	 * @return the startDate
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
