package application;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
	// Implements a binary tree of strings
	private class Node {
		private Node left;
		private String data;
		private Node right;

		private Node(Node L, String d, Node R) {
			left = L;
			data = d;
			right = R;
		}
	}

	private Node root;

	public BinaryTree() {
		root = null;
	}

	public String levelOrder() {
		// PRE: the tree is not empty
		// return a string containing the data in the tree in
		// level order separate the strings with a space

		// return empty string if the tree is empty
		if (root == null)
			return "";

		// result to hold level order
		String result = "";

		// create an empty queue and enqueue the root node
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);

		//// loop till queue is empty
		while (!q.isEmpty()) {

			// process each node in the queue and append to result
			Node temp = q.poll();
			result += temp.data + " ";
			// enqueue their non-empty left child
			if (temp.left != null)
				q.add(temp.left);
			// enqueue their non-empty right child
			if (temp.right != null)
				q.add(temp.right);
		}

		// return result
		return result;

	}

	public String preorder() {
		// PRE: the tree is not empty
		// return a string containing the data in the tree
		// in //pre order separate the strings with a space

		// return empty string if the tree is empty
		if (root == null)
			return "";

		// result to hold pre order of tree
		String result = "";

		// create an empty stack and push the root node
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);

		// loop till stack is empty
		while (!stack.isEmpty()) {

			// pop a node from the stack and append it to result
			Node temp = stack.pop();
			result += temp.data + " ";

			// push the right child of the popped node into the stack
			if (temp.right != null)
				stack.push(temp.right);

			// push the left child of the popped node into the stack
			if (temp.left != null)
				stack.push(temp.left);
		}

		// return result
		return result;

	}

	public String postorder() {
		// PRE: the tree is not empty
		// return a string containing the data in the tree in
		// post order separate the strings with a space
		if (root == null)
			return "";

		String result = "";
		// create an empty stack and push the root node
		Stack<Node> stack1 = new Stack<Node>();
		stack1.push(root);

		// create another stack to store postorder traversal
		Stack<Node> output = new Stack<Node>();

		// loop till stack is empty
		while (!stack1.isEmpty()) {
			//// pop a node from the stack
			Node temp = stack1.pop();

			// push the left and right child of the popped node into the stack
			if (temp.left != null)
				stack1.push(temp.left);
			if (temp.right != null)
				stack1.push(temp.right);
			// push the data into the output stack
			output.push(temp);
		}

		// store postorder traversal in result
		while (!output.isEmpty()) {
			result += output.pop().data + " ";
		}

		// return result
		return result;
	}
}
