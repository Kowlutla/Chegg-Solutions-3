package com.chegg.cus;

public class Customer {

	private int id;
	private String name;
	private String dob;
	private double salary;
	private String email;
	private int age;

	// getter method for ID
	public int getId() {
		return id;
	}

	// Setter method for id
	public void setId(int id) {
		this.id = id;
	}

	// getter method for name
	public String getName() {
		return name;
	}

	// Setter method for name
	public void setName(String name) {
		this.name = name;
	}

	// getter method for date of birth
	public String getDob() {
		return dob;
	}

	// Setter method for dob
	public void setDob(String dob) {
		this.dob = dob;
	}

	// getter method for salary
	public double getSalary() {
		return salary;
	}

	// Setter method for salary
	public void setSalary(double salary) {
		this.salary = salary;
	}

	// getter method for email
	public String getEmail() {
		return email;
	}

	// Setter method for email
	public void setEmail(String email) {
		this.email = email;
	}

	// getter method for age
	public int getAge() {
		return age;
	}

	// Setter method for age
	public void setAge(int age) {
		this.age = age;
	}

	// constructor
	public Customer(int id, String name, String dob, double salary, String email, int age) {
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.salary = salary;
		this.email = email;
		this.age = age;
	}
}
