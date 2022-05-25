package com.chegg.books;

public class Tester {

	public static void main(String[] args) {

		System.out.println("Case1: ");
		Author anAuthor = new Author("Tan Ah Teck", "paul@nowhere");
		Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);
		System.out.println(aBook);

		/*-------------------------------------------------------------------------------*/
		System.out.println("\nCase2: ");
		Author anAuthor1 = new Author("Tan Ah Teck", "paul@nowhere");
		Book bBook = new Book("Java for dummy", anAuthor1, 19.95);
		// printing Book
		System.out.println(bBook);
	}

}
