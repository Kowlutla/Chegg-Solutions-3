package com.chegg.stack;

public class Stack{
	int top;
	Object arr[];

	//default constructor to create stack of size 100000
	public Stack() {
		this.top = 0;
		arr = new Object[100000];
	}

	//Parameterized constructor to create stack with given size n
	public Stack(int n) {
		this.top = 0;
		arr = new Object[n];
	}

	// Tests if this stack is empty. Returns true if the stack is empty, and returns
	// false if the stack contains elements.
	public boolean isEmpty() {
		return top == 0;
	}

	// Returns the element on the top of the stack, but does not remove it.
	public Object peek() {
		if (isEmpty()) {
			throw new RuntimeException("Underflow");
		} else {
			return arr[top - 1];
		}
	}

	// Returns the element on the top of the stack, removing it in the process.
	public Object pop() {
		if (isEmpty()) {
			throw new RuntimeException("Underflow");
		} else {
			Object value = arr[top - 1];
			arr[top - 1] = null;
			top = top - 1;
			return value;
		}
	}

	// Pushes the element onto the stack. Element is also returned.
	public void push(Object data) {
		if (top == arr.length) {
			throw new StackOverflowError("Overflow");
		} else {
			arr[top] = data;
			top++;
		}
	}

}
