package com.chegg.banking;

public class Tester {
	public static void main(String[] args) {

		// creating DLIST Object of type Integer
		DLIST<Integer> list = new DLIST<Integer>();

		// add the values into list
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.append(5);
		list.append(6);
		list.append(7);

		System.out.println("Reverse Order Of List: ");
		// print list in reverse ordre
		list.displayReverseOrder();

		System.out.println("Nodes in Odd Positions: ");
		list.printOddPositions();
	}
}
