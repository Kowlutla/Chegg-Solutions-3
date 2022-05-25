package com.chegg.linkedchain;

public class LinkedChain<T> {

	// to hold the starting node of LinkedChain
	private Node<T> head;

	// Constructor to create LinkedChain Object
	public LinkedChain() {
		this.head = null;
	}

	// Method to insert new data into LinkedChain
	public void insert(T dataPortion) {

		Node<T> newNode = new Node<T>(dataPortion);
		if (head == null) {
			head = newNode;
			return;
		}

		Node<T> current = head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(newNode);
	}

	// Method to return Node of secondLastNode of LinkedChain
	public Node<T> secondToLastNode() {
		// if LinkedChain contain 0 or 1 elements
		if (head == null || head.getNext() == null) {
			// return null
			return null;
		}

		// to traverse the LinkedChain till second last node
		Node<T> current = head;
		while (current.getNext().getNext() != null) {
			// change current to its next node
			current = current.getNext();
		}

		// return current as it is second to last node
		return current;
	}

	// utility method to print all elements of LinkedChain
	public void print() {
		Node<T> current = head;
		while (current != null) {
			System.out.print(current.getData() + "  ");
			current = current.getNext();
		}
		System.out.println();
	}

	// Main method
	public static void main(String[] args) {

		// Create LinkedChain Object of type String
		LinkedChain<String> chain = new LinkedChain<String>();
		// before inserting anything to linked chain trying to print second to last node
		Node<String> secondLast = chain.secondToLastNode();
		if (secondLast == null)
			System.out.println("No Second to Last Node in LinkedChain");
		else
			System.out.println("Second to Last Node in LinkedChain is: " + secondLast.getData());

		// inserting elements into linked chain
		chain.insert("one");
		chain.insert("two");
		chain.insert("ABC");
		chain.insert("four");
		chain.insert("five");
		chain.insert("six");

		// print linked chain elements
		System.out.println("\nLinked Chain Elements: ");
		chain.print();

		System.out.println();
		// printing second to last node by calling method
		secondLast = chain.secondToLastNode();
		if (secondLast == null)
			System.out.println("No Second to Last Node in LinkedChain");
		else
			System.out.println("Second to Last Node in LinkedChain is: " + secondLast.getData());
	}
}