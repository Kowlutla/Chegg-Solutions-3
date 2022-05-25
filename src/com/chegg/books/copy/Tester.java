package com.chegg.books.copy;

public class Tester {

	public static void main(String[] args) {

		System.out.println("Case1: ");
		Author authors[] = new Author[2];
		authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com");
		authors[1] = new Author("Paul Tan", "Paul@nowhere.com");
		Book javaDummy = new Book("Java for dummy", authors, 19.99, 99);
		System.out.println(javaDummy);

		/*------------------------------------------------------------------------------*/

		System.out.println("\nCase2: ");
		Author authors1[] = new Author[1];
		authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com");
		Book javaDummy1 = new Book("Java for dummy", authors1, 19.99);
		System.out.println(javaDummy1);

		/*------------------------------------------------------------------------------*/

		System.out.println("\nCase3: ");
		Author authors2[] = new Author[2];
		authors2[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com");
		authors2[1] = new Author("Paul Tan", "Paul@nowhere.com");
		Book javaDummy2 = new Book("Java for dummy", authors2, 19.99);
		javaDummy2.printAuthors();

	}

}
