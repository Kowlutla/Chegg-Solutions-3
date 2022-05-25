package com.chegg.linkedchain;

public class Node<T> {

	private T data;
	private Node<T> next;

	public Node(T dataPortion) {
		this(dataPortion, null);
	}

	public Node(T dataPortion, Node<T> nextNode) {
		this.data = dataPortion;
		this.next = nextNode;
	}

	public T getData() {
		if (data != null) {
			return data;
		}
		return null;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> nextNode) {
		next = nextNode;
	}
}