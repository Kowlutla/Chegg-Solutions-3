package com.chegg.books;

public class Book {

	// Attributes of Book
	private String name;
	private Author author;
	private double price;
	private int quantityInStock;

	// constructor that creates a book with specified name and price
	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}

	/*
	 * overloaded constructor that creates a book with specified name,price and
	 * quantityInStock
	 */

	public Book(String name, double price, int quantityInStock) {
		this.name = name;
		this.price = price;
		this.quantityInStock = quantityInStock;
	}

	/*
	 * overloaded constructor that creates a book with specified name,author and
	 * price
	 */
	public Book(String name, Author author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}

	/*
	 * overloaded constructor that creates a book with specified name,author,price
	 * and quantityInStock
	 */

	public Book(String name, Author author, double price, int quantityInStock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.quantityInStock = quantityInStock;
	}

	// accessor method for name
	public String getName() {
		return name;
	}

	// accessor method for author
	public Author getAuthor() {
		return author;
	}

	// accessor method for price
	public double getPrice() {
		return price;
	}

	// accessor method for quantityInStock
	public int getQuantityInStock() {
		return quantityInStock;
	}

	// mutator method for name
	public void setName(String name) {
		this.name = name;
	}

	// mutator method for author
	public void setAuthor(Author author) {
		this.author = author;
	}

	// mutator method for price
	public void setPrice(double price) {
		this.price = price;
	}

	// mutator method for quantityInStock
	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	public String toString() {
		return getName() + " by " + author;
	}
}
