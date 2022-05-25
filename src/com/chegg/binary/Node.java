package com.chegg.binary;

/* Class containing left and right child of current
node and key value*/
public class Node {

	// data members
	int key;
	Node left, right;

	// Constructor to create Node Object
	public Node(int item) {
		key = item;
		left = right = null;
	}
}