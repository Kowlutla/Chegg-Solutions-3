
public class Employee {

	// attributes of Employee
	private String name;
	private String birthdate;
	private double salary;
	private int overtime;

	// Constructor
	public Employee(String name, String bDate, double salary, int overtime) {

		this.name = name;
		this.birthdate = bDate;
		// if salary is negative change to 0
		if (salary < 0) {
			this.salary = 0;
		} else {
			this.salary = salary;
		}

		// if overtime is negative change to 0
		if (overtime < 0) {
			this.overtime = 0;
		} else {
			this.overtime = overtime;
		}
	}

	// Getter method for name
	public String getName() {
		return name;
	}

	// Setter method for name
	public void setName(String name) {
		this.name = name;
	}

	// Getter method for salary
	public double getSalary() {
		return salary;
	}

	// Setter method for salary
	public void setSalary(double salary) {
		// if salary is negative change to 0
		if (salary < 0) {
			this.salary = 0;
		} else {
			this.salary = salary;
		}
	}

	// Getter method for Overtime
	public int getOvertime() {
		return overtime;
	}

	// Setter method for Overtime
	public void setOvertime(int overtime) {
		// if overtime is negative change to 0
		if (overtime < 0) {
			this.overtime = 0;
		} else {
			this.overtime = overtime;
		}
	}

	// Method to get Year Of Birth
	public int getYearOfBirth() {
		return Integer.parseInt(this.birthdate.substring(6));
	}

	// Method to return total salary
	public double totalSalary() {
		return this.salary + (this.overtime * 15);
	}

	// Method to print total employee information
	public void print() {
		System.out.println("Name: " + this.name);
		System.out.println("Birthdate: " + this.birthdate.replaceAll("-", "/"));
		System.out.println("Salary: $" + this.salary);
		System.out.println("Overtime: " + this.overtime + " hours");
		System.out.println("Total Salary: $" + totalSalary());
	}

}
