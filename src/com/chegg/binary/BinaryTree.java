package com.chegg.binary;

//Java program for different tree traversals
public class BinaryTree {
	// Root of Binary Tree
	Node root;

	BinaryTree() {
		root = null;
	}

	/*
	 * Given a binary tree, print its nodes according to the "bottom-up" postorder
	 * traversal.
	 */
	void printPostorder(Node node) {
		if (node == null)
			return;

		// first recur on left subtree
		printPostorder(node.left);

		// then recur on right subtree
		printPostorder(node.right);

		// now deal with the node
		System.out.print(node.key + " ");
	}

	/* Given a binary tree, print its nodes in inorder */
	void printInorder(Node node) {
		if (node == null)
			return;

		/* first recur on left child */
		printInorder(node.left);

		/* then print the data of node */
		System.out.print(node.key + " ");

		/* now recur on right child */
		printInorder(node.right);
	}

	/* Given a binary tree, print its nodes in preorder */
	void printPreorder(Node node) {
		if (node == null)
			return;

		/* first print data of node */
		System.out.print(node.key + " ");

		/* then recur on left sutree */
		printPreorder(node.left);

		/* now recur on right subtree */
		printPreorder(node.right);
	}

	// Wrappers over above recursive functions
	void printPostorder() {
		printPostorder(root);
	}

	void printInorder() {
		printInorder(root);
	}

	void printPreorder() {
		printPreorder(root);
	}

	// Driver method
	public static void main(String[] args) {
		// Create BinaryTree
		BinaryTree tree = new BinaryTree();

		// add the nodes to tree based on diagram
		tree.root = new Node(17);
		tree.root.left = new Node(41);
		tree.root.right = new Node(9);
		tree.root.left.left = new Node(29);
		tree.root.left.right = new Node(6);
		tree.root.right.left = new Node(81);
		tree.root.right.right = new Node(40);

		// printing preOrder traversal
		System.out.println("Preorder traversal: ");
		tree.printPreorder();

		// printing InOrder Traversal
		System.out.println("\n\nInorder traversal: ");
		tree.printInorder();

		// printing PostOrder Traversal
		System.out.println("\n\nPostorder traversal: ");
		tree.printPostorder();
	}
}
