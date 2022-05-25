package application;

public class Person implements Comparable<Person> {

	private String firstName, lastName;
	private int id;

	public Person(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + " (" + id + ")";
	}

	@Override
	public int compareTo(Person o) {

		// if current object last name alphabetically larger than Person o last name
		if (this.lastName.compareToIgnoreCase(o.lastName) > 0) {
			// return +ve number means swap
			return 1;
		}

		// if current object last name alphabetically smaller than Person o last name
		else if (this.lastName.compareToIgnoreCase(o.lastName) < 0) {
			// return -ve number means do not swap
			return -1;
		}

		// if both last names are same
		else {

			// if current object first name alphabetically larger than Person o first name
			if (this.firstName.compareToIgnoreCase(o.firstName) > 0) {
				// return +ve number means swap
				return 1;
			}

			// if current object first name alphabetically smaller than Person o first name
			else if (this.firstName.compareToIgnoreCase(o.firstName) < 0) {
				// return -ve number means do not swap
				return -1;
			}

			// if both first and last names of both objects are same
			else {

				// return ascending order of id's
				return this.id - o.id;
			}
		}
	}
}