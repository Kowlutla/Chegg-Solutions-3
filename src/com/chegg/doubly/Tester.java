package com.chegg.doubly;

public class Tester {

	public static void main(String[] args) {

		// create DoubleLinkedList2 Object
		DoubleLinkedList2 mylist = new DoubleLinkedList2();
		for (int i = 0; i < 10; i++)
			mylist.addEnd(i); // 0 1 2 3 4 5 6 7 8 9

		for (int i = 0; i < 10; i++)
			mylist.addStart(i);// 9 8 7 6 5 4 3 2 1 0 0 1 2 3 4 5 6 7 8 9

		for (int i = 0; i < 5; i++)
			mylist.removeEnd();
		System.out.println(mylist); // print the list!
		//9 8 7 6 5 4 3 2 1 0 0 1 2 3 4

		System.out.println(mylist.size());//15
	}

}
