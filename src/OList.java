
public class OList {

	// private inner class Node
	private class Node {
		String value;
		Node next;

		public Node(String value) {
			this.value = value;
			this.next = null;
		}
	}

	// node to point starting of linkedlist
	Node head;
	int size;

	// Constructor
	public OList() {
		this.head = null;
		this.size = 0;
	}

	/**
	 * Method that takes
	 * 
	 * @param value and add to list in ascending order
	 */
	public void Add(String value) {
		// create new node with given value
		Node newNode = new Node(value);

		// if no values in list
		if (head == null)
			head = newNode;

		// if value present at head is greater than given value add at head
		else if (head.value.compareToIgnoreCase(value) >= 0) {
			newNode.next = head;
			head = newNode;
		}
		// otherwise find correct place for value in list and add value to list
		else {
			Node current = head;
			Node prev = null;
			while (current != null && current.value.compareToIgnoreCase(value) < 0) {
				prev = current;
				current = current.next;
			}
			newNode.next = current;
			prev.next = newNode;
		}
		size++;
	}

	/**
	 * Method to remove
	 * 
	 * @param value from List
	 */
	public void remove(String value) {
		// if no values in list
		if (head == null)
			return;
		// find the position where value to be removed present
		Node current = head;
		Node prev = null;
		while (current != null && current.next != null) {
			prev = current;
			current = current.next;
			// if we found value to be removed in list
			if (current.value.equalsIgnoreCase(value)) {
				// remove all its occurences
				while (current != null && current.value.equalsIgnoreCase(value)) {
					current = current.next;
					size--;
				}
				prev.next = current;

			}
		}
		// if head contain given value remove head
		if (head.value.equalsIgnoreCase(value)) {
			head = head.next;
			size--;
		}
	}

	/**
	 * Method to display strings present in list
	 */
	public void Display() {
		Node current = head;
		while (current.next != null) {
			System.out.print(current.value + " --> ");
			current = current.next;
		}
		System.out.println(current.value);
	}

	/**
	 * method to
	 * 
	 * @return size of Olist
	 */
	public int size() {
		return size;
	}

	/**
	 * Method toString to return String representation of OList
	 */
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		Node current = head;
		while (current.next != null) {
			sb.append(current.value + " , ");
			current = current.next;
		}
		sb.append(current.value).append("]");
		return sb.toString();
	}

	public static void main(String[] args) {
		// create OList Object
		OList list = new OList();

		// add some values to list in random order
		list.Add("D");
		list.Add("M");
		list.Add("A");
		list.Add("F");
		list.Add("S");
		list.Add("B");
		list.Add("B");
		list.Add("A");
		list.Add("S");

		// print values in list
		System.out.println("Values in List: ");
		list.Display();
		// print size of list

		System.out.println("\nSize Of List: " + list.size());

		// remove 'S' from list
		list.remove("S");
		System.out.println("\nAfter removing S from list: ");
		list.Display();

		// print size of list
		System.out.println("\nSize of List: " + list.size());

		// print list
		System.out.println("\nList Values: ");
		System.out.println(list);
	}
}
