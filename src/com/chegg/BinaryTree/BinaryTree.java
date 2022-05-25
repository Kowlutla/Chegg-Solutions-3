package com.chegg.BinaryTree;

public class BinaryTree {
	
	//method to generate the mirrorTree of Tree
	public static void mirrorTree(Node root)
	{
		//call helper method and store result node into root
		root=mirrorTreeUtil(root);
	}
	
	//Helper method to generate mirror tree
	private static Node mirrorTreeUtil(Node root)
	{
		//if root is null return null as it is end of tree
		if(root==null)
			return null;
		//recursively call method to left and right sub trees and store results
		Node left=mirrorTreeUtil(root.getLeft());
		Node right=mirrorTreeUtil(root.getRight());
		
		/* swap the left and right pointers */
		root.setLeft(right);
		root.setRight(left);
		
		//return root
		return root;
	}
	
	//Utility method to print tree values in InOrder
	public static void inOrder(Node root)
	{
		if(root==null)
			return;
		inOrder(root.getLeft());
		System.out.print(root.getValue()+"  ");
		inOrder(root.getRight());
	}
	
	public static void main(String args[])
	{
		//Creating Tree with given values
		Node root=new Node(6);
		root.setLeft(new Node(3));
		root.setRight(new Node(8));
		root.getLeft().setRight(new Node(2));
		root.getRight().setLeft(new Node(7));
		root.getRight().setRight(new Node(9));
		
		//Printing inorder of tree
		System.out.println("* * * InOrder of original Tree * * * ");
		inOrder(root);
		
		//converting tree to mirror tree by calling mirrorTree method
		mirrorTree(root);
		
		System.out.println("\n\n* * * InOrder of mirror Tree * * * ");
		inOrder(root);
	}

}
