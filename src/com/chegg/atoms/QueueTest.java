package com.chegg.atoms;

public class QueueTest {

	public static void main(String[] args) {

		// create Queue object
		Queue q = new Queue();

		// 1.add some values to Queue
		q.enQueue("Sara");
		q.enQueue("Sasha");
		q.enQueue("Taylor");
		q.enQueue("Nathalie");
		q.enQueue("Allison");

		// 2.print the contents of q
		System.out.println("Contents Of Queue is: ");
		q.display();

		// 3.retrieve the first element of queue and print result
		System.out.println("First Element of queue is: " + q.peek());

		// 4.delete 2 elements from queue
		q.deQueue();
		q.deQueue();

		// 5.print contents of queue
		System.out.println("Contents Of Queue is: ");
		q.display();
	}

}
