package com.chegg.stacklist;

public class TWStackLinkedList<E> {

	// inner class
	class Node<T> {
		T data;
		Node<T> next;

		public Node(T dataItem, Node<T> nodeRef) {
			this.data = dataItem;
			this.next = nodeRef;
		}

	}

	// instance variable
	Node<E> head;

	// the constructor
	public TWStackLinkedList() {
		this.head = null;
	}

	// method getHead()
	public Node<E> getHead() {
		return head;
	}

	// push method
	public void push(E item) {
		Node<E> newNode = new Node<>(item, head);
		head = newNode;
	}

	// printNode( Node<E> node) (print the node item)
	public void printNode(Node<E> node) {
		System.out.println(node.data);
	}

	/**
	 * printList(Node<E> head) to the class TWStackLinkedList<E>. printList(Node<E>
	 * head) will print the linked list when input the head of the list as an
	 * argument.
	 */

	public void printList(Node<E> head) {
		Node<E> current = head;
		while (current.next != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println(current.data);
	}

	// Method to reverse the list
	public Node<E> reverseList(Node<E> head) {
		Node<E> prev = null;
		Node<E> current = head;
		Node<E> next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}
}
