package com.chegg.books.copy;

public class Book {

	// Attributes of Book
	private String name;
	private Author[] authors;
	private double price;
	private int quantityInStock;

	// constructor that creates a book with specified name and price
	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}

	/*
	 * overloaded constructor that creates a book with specified name,array of
	 * author and price
	 */
	public Book(String name, Author[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
	}

	/*
	 * overloaded constructor that creates a book with specified name,array of
	 * author,price and quantityInStock
	 */

	public Book(String name, Author[] authors, double price, int quantityInStock) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.quantityInStock = quantityInStock;
	}

	// toString method
	public String toString() {
		String result = "";
		result += name + " by " + authors.length;
		if (authors.length == 1)
			result += " author";
		else
			result += " authors";
		return result;
	}

	// Method to print names and emails of authors
	public void printAuthors() {
		for (Author a : authors) {
			System.out.println(a);
		}
	}

	// accessor method fot authors
	public Author[] getAuthors() {
		return authors;
	}

	// mutator method for authors
	public void setAuthors(Author[] authors) {
		this.authors = authors;
	}
}
