package com.chegg.expression;

import java.text.DecimalFormat;

public class BinaryTree {
	// Function to check if a given token is an operator
	public static boolean isOperator(char c) {
		return (c == '+' || c == '-' || c == '×' || c == '/' || c == '^');
	}


	// Print the infix expression for an expression tree
	public static void inorder(Node root) {
		if (root == null) {
			return;
		}

		// if the current token is an operator, print open parenthesis
		if (isOperator(root.data)) {
			System.out.print("(");
		}

		inorder(root.left);
		System.out.print(root.data);
		inorder(root.right);

		// if the current token is an operator, print close parenthesis
		if (isOperator(root.data)) {
			System.out.print(")");
		}
	}

	public static void main(String[] args) {
		
//		//construct the given tree
//		Node root = new Node('+');
//		root.left = new Node('+');
//		root.right = new Node('*');
//		root.left.left = new Node('a');
//		root.left.right = new Node('*');
//		root.left.right.left = new Node('b');
//		root.left.right.right = new Node('c');
//		root.right.left = new Node('d');
//		root.right.right = new Node('e');
//
//		System.out.print("\nInfix Expression  : ");
//		inorder(root);
		
		DecimalFormat decimalFormat = new DecimalFormat("00.00");
		String number=decimalFormat.format(7.43);
		System.out.println(number);
	}
}