package com.chegg.books;

public class Author {

	// attributes of Author
	private String name;
	private String email;

	// Constructor to create Author Object
	public Author(String name, String email) {
		this.name = name;
		this.email = email;
	}

	// getter method for name of author
	public String getName() {
		return name;
	}

	// setter method for name of author
	public void setName(String name) {
		this.name = name;
	}

	// getter method for email of author
	public String getEmail() {
		return email;
	}

	// setter method for email of author
	public void setEmail(String email) {
		this.email = email;
	}

	// toString method to return String representation of Author
	public String toString() {
		return getName() + " at " + getEmail();
	}
}
