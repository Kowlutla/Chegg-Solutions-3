package chapter8_debug;

/**
 * Staff-class inherits also Person-class,
 */
public class Staff extends Person {

	/**
	 * private attributes: - employeeNumber (String) - location (String) - title
	 * (String)
	 */
	private String employeeNumber;
	private String location;
	private String title;

	/**
	 * public method: - printStaff which prints data given by getPersonData-method
	 * as well as employeeNumber, location and title.
	 */
	public void printStaff() {
		System.out.println(
				super.getPersonData() + " , " + this.employeeNumber + " , " + this.location + " , " + this.title);
	}

	/**
	 * @return the employeeNumber
	 */
	public String getEmployeeNumber() {
		return employeeNumber;
	}

	/**
	 * @param employeeNumber the employeeNumber to set
	 */
	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

}
