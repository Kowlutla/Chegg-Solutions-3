package SortingOfLinkedList;

public class LinkedList {
	Node head;
	int length = 0;

	public void insert(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = node;
		}
		length++;
	}

	// method to print all even numbers in list
	public void printEven() {
		// current points to first node in list
		Node current = head;
		String op = "";
		// look for all elements in list
		while (current != null) {
			// if current number is even print it
			if (current.data % 2 == 0) {
				System.out.print(op + current.data);
				op = " - >";
			}
			// change current to next pointer
			current = current.next;
		}
		System.out.println();
	}

	// Method to check whether given value in list or not
	public boolean isContain(int value) {
		// current point to starting of list
		Node current = head;
		// look for all elements in list
		while (current != null) {
			// current data is equal to given value
			if (current.data == value) {
				// return as true
				return true;
			}
			// change current pointer to next node
			current = current.next;
		}
		return false;
	}

	// Method to reverse the linkedlist
	public void reverse() {
		Node current = head;
		Node next = null;
		Node previous = null;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;
	}

	// method to sort the list
	public void sortList() {
		Node current = head;
		while (current != null && current.next != null) {
			Node temp = current.next;
			while (temp != null) {
				if (current.data > temp.data) {
					int i = current.data;
					current.data = temp.data;
					temp.data = i;
				}
				temp = temp.next;
			}
			current = current.next;
		}
	}

	public int sumOfElements() {
		int result = 0;
		Node current = head;
		while (current != null) {
			result += current.data;
			current = current.next;
		}
		return result;
	}

	public void rotate(String direction, int k) {
		direction = direction.toLowerCase();
		if (direction.equals("left")) {
			rotateLeft(k);
		} else {
			rotateRigh(k);
		}
	}

	private void rotateLeft(int k) {
		if (k == 0)
			return;

		// Let us understand the below code for example k = 4
		// and list = 10->20->30->40->50->60.
		Node current = head;

		// current will either point to kth or NULL after this
		// loop. current will point to node 40 in the above example
		int count = 1;
		while (count < k && current != null) {
			current = current.next;
			count++;
		}

		// If current is NULL, k is greater than or equal to count
		// of nodes in linked list. Don't change the list in this case
		if (current == null)
			return;

		// current points to kth node. Store it in a variable.
		// kthNode points to node 40 in the above example
		Node kthNode = current;

		// current will point to last node after this loop
		// current will point to node 60 in the above example
		while (current.next != null)
			current = current.next;

		// Change next of last node to previous head
		// Next of 60 is now changed to node 10

		current.next = head;

		// Change head to (k+1)th node
		// head is now changed to node 50
		head = kthNode.next;

		// change next of kth node to null
		kthNode.next = null;
	}

	// Function that rotates the given linked list
	// clockwise by k and returns the updated
	// head pointer
	private void rotateRigh(int k) {

		// If the linked list is empty
		if (head == null)
			return;

		// len is used to store length of the linked list
		// tmp will point to the last node after this loop
		Node tmp = head;
		int len = 1;
		while (tmp.next != null) {
			tmp = tmp.next;
			len++;
		}

		// If k is greater than the size
		// of the linked list
		if (k > len)
			k = k % len;

		// Subtract from length to convert
		// it into left rotation
		k = len - k;

		// If no rotation needed then
		// return the head node
		if (k == 0 || k == len)
			return;

		// current will either point to
		// kth or null after this loop
		Node current = head;
		int cnt = 1;
		while (cnt < k && current != null) {
			current = current.next;
			cnt++;
		}

		// If current is null then k is equal to the
		// count of nodes in the list
		// Don't change the list in this case
		if (current == null)
			return;

		// current points to the kth node
		Node kthnode = current;

		// Change next of last node to previous head
		tmp.next = head;

		// Change head to (k+1)th node
		head = kthnode.next;

		// Change next of kth node to null
		kthnode.next = null;

	}

	public void traverse() {
		Node current = head;
		if (current == null) {
			System.out.println("No elements in list");
		} else {
			while (current.next != null) {
				System.out.print(current.data + " - >");
				current = current.next;
			}
			System.out.println(current.data);
			System.out.println();
		}
	}

}
