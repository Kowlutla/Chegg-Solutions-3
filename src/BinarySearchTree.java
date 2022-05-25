import java.util.ArrayList;

// In Java Programming

/**
 * Implementation of a binary search tree. The course has been modified from the
 * code of Prof. Galles.
 */
class BinarySearchTree {

	private BSTNode root; // the root of the tree

	/**
	 * An inner class representing a node in a BST tree
	 */
	private class BSTNode {
		public char data; // value stored at the node
		public BSTNode left; // left subtree
		public BSTNode right; // right subtree

		BSTNode(char newdata) {
			data = newdata;
		}
	}

	/**
	 * Return a string that contains values of the nodes, traversed using postorder
	 * traversal.
	 */
	public String getNodesInPostorder() {
		return getNodesInPostorder(root);
	}

	/**
	 * Insert a given element into the BST tree
	 */
	public void insert(char elem) {
		root = insert(root, elem);
	}

	/**
	 * Return a string that contains values of the nodes, traversed using postorder
	 * traversal.
	 *
	 * @param root root of the tree
	 */
	private String getNodesInPostorder(BSTNode root) {
		StringBuilder s = new StringBuilder();
		// FILL IN CODE
		// Must be recursive

		getNodesInPostorder(root, s);

		return s.toString();
	}

	// Helper method to return nodes in post order
	private void getNodesInPostorder(BSTNode root, StringBuilder s) {

		if (root == null)
			return;
		getNodesInPostorder(root.left, s);
		getNodesInPostorder(root.right, s);
		s.append(root.data);

	}

	/**
	 * A method that changes a binary search tree so that it is "balanced", using
	 * the following simple algorithm: Put all the values from the tree into an
	 * ArrayList, "in order" Create an empty tree and insert the elements into the
	 * tree one by one so that the tree is balanced. (Hint: First insert the element
	 * in the middle of the array, and then recursively insert other elements). Resets the root.
	 */
	public void makeBalanced() {
		// FILL IN CODE
		ArrayList<Character> values = new ArrayList<>();
		storeInOrder(root, values);
		this.root = sortedArrayToBST(values, 0, values.size() - 1);
	}
	/*
	 * A function that constructs Balanced Binary Search Tree from a sorted array
	 */
	BSTNode sortedArrayToBST(ArrayList<Character> list, int start, int end) {
		/* Base Case */
		if (start > end) {
			return null;
		}
		/* Get the middle element and make it root */
		int mid = (start + end) / 2;
		BSTNode node = new BSTNode(list.get(mid));
		/*
		 * Recursively construct the left subtree and make it left child of root
		 */
		node.left = sortedArrayToBST(list, start, mid - 1);
		/*
		 * Recursively construct the right subtree and make it right child of root
		 */
		node.right = sortedArrayToBST(list, mid + 1, end);
		return node;
	}

	private void storeInOrder(BSTNode root, ArrayList<Character> values) {
		if (root == null)
			return;
		storeInOrder(root.left, values);
		values.add(root.data);
		storeInOrder(root.right, values);

	}

	/**
	 * Insert elem into the tree with the given root
	 */
	private BSTNode insert(BSTNode tree, char elem) {
		if (tree == null) {
			return new BSTNode(elem);
		}
		if (elem < tree.data) {
			tree.left = insert(tree.left, elem);
			return tree;
		} else {
			tree.right = insert(tree.right, elem);
			return tree;
		}
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert('f');
		bst.insert('a');
		bst.insert('m');
		bst.insert('z');
		bst.insert('b');
		bst.insert('p');
		bst.insert('w');

		String s = bst.getNodesInPostorder();
		System.out.println(s);

		bst.makeBalanced();

		s = bst.getNodesInPostorder();
		System.out.println(s);
	}

}