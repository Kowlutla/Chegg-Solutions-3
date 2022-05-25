package com.chegg.BinaryTree;

public class Node {

	private int value;
	private Node left,right;
	
	public Node(int value)
	{
		this.value=value;
		this.left=this.right=null;
	}

	public int getValue() {
		return value;
	}

	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public void setRight(Node right) {
		this.right = right;
	}
}
