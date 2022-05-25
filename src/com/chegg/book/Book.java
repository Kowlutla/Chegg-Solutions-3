package com.chegg.book;

public class Book extends SchoolSupplies {

	private String author;

	public Book() {

		author = "";

	}

	/**
	 * constructor with three appropriate arguments for the Book class.
	 * 
	 * @param name
	 * @param cost
	 * @param author
	 */
	public Book(String name, double cost, String author) {
		super(name, cost);
		this.author = author;
	}

	@Override

	public String toString() {

		return super.toString() + ", Book, author=" + author;

	}

}