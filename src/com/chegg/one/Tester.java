package com.chegg.one;

public class Tester {

	public static void main(String[] args) {

		// Creating a list
		LinkedList list1 = new LinkedList();
		// inserting elements into list
		list1.insert(1);
		list1.insert(3);
		list1.insert(2);
		list1.insert(1);
		list1.insert(1);
		list1.insert(2);
		list1.insert(3);
		list1.insert(1);

		System.out.println("List: " + list1);
		// Checking list is palindrome or not
		if (list1.isPalindrome()) {
			System.out.println("This list is a palindrome");
		} else {
			System.out.println("This list is not a palindrome");
		}

		// Creating a list
		LinkedList list2 = new LinkedList();
		// inserting elements into list
		list2.insert(1);
		list2.insert(3);
		list2.insert(0);
		list2.insert(2);
		list2.insert(1);
		list2.insert(1);
		list2.insert(2);
		list2.insert(3);
		list2.insert(1);

		System.out.println("List2: " + list2);
		// Checking list is palindrome or not
		if (list2.isPalindrome()) {
			System.out.println("This list is a palindrome");
		} else {
			System.out.println("This list is not a palindrome");
		}

	}

}
