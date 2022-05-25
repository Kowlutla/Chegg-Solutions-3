package com.chegg.banking;

public class DLIST<E> {

	static class Node<E> {

		private E data;
		Node<E> next;
		Node<E> prev;

		private Node(E dataItem, Node<E> nextnode, Node<E> prevnode) { // constructor

			data = dataItem;

			next = nextnode;

			prev = prevnode;

		}

		private Node(E dataItem) { // constructor

			data = dataItem;

			next = null;
			prev = null;

		}

	}

	private Node<E> head = null;

	private Node<E> tail = null; // initialisation

	// method to add elements at tail to list(Optional)
	public void append(E data) {
		Node<E> newNode = new Node<E>(data);
		if (head == null && tail == null) {
			head = tail = newNode;
		} else {
			newNode.prev = tail;
			tail.next = newNode;
			tail = newNode;
		}
	}

	/**
	 * Method to print 1st, 3rd, 5th, etc. nodes in the double linked list.
	 */
	public void printOddPositions() {
		// assuming starting position is 1
		int position = 1;
		Node<E> current = head;
		// look for all nodes in list
		while (current != null) {
			// if current position is odd position
			if (position % 2 == 1) {
				// print the data of current node
				System.out.print(current.data + " ");
			}
			// increment the position
			position++;
			// change current pointer to next
			current = current.next;
		}
		System.out.println();
	}

	/**
	 * method to display the double linked list in the reverse order.
	 */
	public void displayReverseOrder() {
		// start from tail node
		Node<E> current = tail;

		// for all nodes in list
		while (current != null) {
			// print data of current node
			System.out.print(current.data + " ");
			// change current pointer to prev node
			current = current.prev;
		}
		System.out.println();
	}
}