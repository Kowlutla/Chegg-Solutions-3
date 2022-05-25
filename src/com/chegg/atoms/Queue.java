package com.chegg.atoms;

public class Queue {
	// inner class Node
	private class Node {
		String data;
		Node next;

		public Node(String data) {
			this.data = data;
		}

	}

	// pointers point to first and last nodes in queue
	Node front, rear;
	int size = 0;

	// Method to add element into queue
	public void enQueue(String data) {

		Node temp = rear;
		rear = new Node(data);
		// rear.next=null;
		if (isEmpty()) {
			front = rear;
		} else {
			temp.next = rear;
		}
		size++;
	}

	// Method to remove element from queue
	public String deQueue() {

		if (isEmpty()) {
			throw new RuntimeException("Queue is Empty");
		} else {
			String value = front.data;
			front = front.next;
			size--;
			return value;
		}
	}

	// Method to return first element from queue
	public String peek() {
		if (isEmpty()) {
			throw new RuntimeException("Queue is Empty");

		} else {
			return front.data;
		}
	}

	// method to return the size of queue
	public int getSize() {
		return size;
	}

	// method to check queue is empty or not
	public boolean isEmpty() {
		return size == 0;
	}

	// method to display the contents of queue
	public void display() {
		if (isEmpty()) {
			System.out.println("Empty Queue");
		} else {
			System.out.print("[");
			String deli = "";
			Node current = front;
			while (current != null) {
				System.out.print(deli + current.data);
				current = current.next;
				deli = " , ";
			}
		}
		System.out.println("]");
	}

}
