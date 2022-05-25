package chapter8_debug;

public class Person {

	/**
	 * Person-class has private attributes: - name(String) - address(String) -
	 * dateOfBirth (String)
	 */

	private String name;
	private String address;
	private String dateOfBirth;

	/**
	 * getPersonData,which returns in a one String separated with comma name,
	 * address and date of birth, but methdod is visible only to subclasses.
	 */

	protected String getPersonData() {
		return this.name + " , " + this.address + " , " + this.dateOfBirth;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
