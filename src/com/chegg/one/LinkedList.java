package com.chegg.one;

public class LinkedList {

	public class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	Node head;

	public void insert(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = node;
		}
	}

	// Method to check list is palindrome or not
	public boolean isPalindrome() {
		// find middle element of list
		Node fast = head;
		Node slow = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		// reverse second half
		Node middle = reverseList(slow);

		// compare first half list and second reversed half list
		Node current = head;
		while (middle != null) {
			// if first half list element and second half list element not sam
			if (current.data != middle.data) {
				// return as not palindrome
				return false;
			}
			current = current.next;
			middle = middle.next;
		}
		// return true as Palindrome
		return true;
	}

	// Helper method to reverse the list
	private Node reverseList(Node slow) {

		Node current = slow;
		Node next = null;
		Node previous = null;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}

	// Helper method to return String representation of List
	public String toString() {
		StringBuffer sb = new StringBuffer();
		Node current = head;
		while (current != null) {
			sb.append(current.data).append(" ");
			current = current.next;
		}
		return sb.toString();
	}

}
