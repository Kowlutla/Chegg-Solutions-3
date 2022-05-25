package com.chegg.stacklist;

public class Driver {

	public static void main(String[] args) {

		System.out.println("Assignment 04: Question 02");
		System.out.println("Your name: ");// add your name here
		System.out.println("Your Student id: ");// add your id here;
		System.out.println("\n............................");
		// create TWStackLinkedList Object
		TWStackLinkedList<String> list = new TWStackLinkedList<String>();
		// push elements into list
		list.push("sun1");
		list.push("sun2");
		list.push("sun3");
		list.push("sun4");
		list.push("sun5");
		list.push("Sun6");

		// print list
		list.printList(list.getHead());
		System.out.print("The head of the initial linked is: ");
		list.printNode(list.getHead());
		System.out.println("...............................");

		// reverse the list
		list.head=list.reverseList(list.getHead());
		System.out.println("The reversed linked list is: ");
		// printing reversed list
		list.printList(list.getHead());

		// print head node of reversed list
		System.out.print("The head of the reversed linked list is: ");
		list.printNode(list.getHead());

	}

}
