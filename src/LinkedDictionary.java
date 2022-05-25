
public class LinkedDictionary<K, V> {

	// Inner class Node
	private class Node {
		// attributes of Node
		K key;
		V value;
		Node next;

		// Construcor to create Node Object
		public Node(K key, V value) {
			this.key = key;
			this.value = value;
			this.next = null;
		}

		// return string represntation of key-value pair
		public String toString() {
			return key + ":\t" + value;
		}
	}

	Node head;// starting of dictionary
	int size;// size of dictionary

	// Constructor to create Dictionary
	public LinkedDictionary() {
		this.head = null;
		this.size = 0;
	}

	/**
	 * 
	 * @param key
	 * @param value Method to add key value pair to dictionary
	 */
	public void add(K key, V value) {
		// create new node wit given key and value
		Node newNode = new Node(key, value);

		// if dictionary is empty
		if (isEmpty()) {
			head = newNode;
			size++;
		} else {
			// look for all entries in dictionary
			Node current = head;
			while (current.next != null) {
				// if key already present in dictionary
				if (current.key.equals(key)) {
					// replace the old value with new value
					current.value = value;
					return;
				}
				current = current.next;
			}
			// if key at the end
			if (current.key.equals(key)) {
				current.value = value;
				return;
			}
			// if key is not in dictionary add at end
			current.next = newNode;
			size++;
		}
	}

	/**
	 * removes specific pair that has the key provided from the collection. Key
	 * should exist, otherwise do nothing
	 * 
	 * @param key
	 */
	public void remove(K key) {
		// if dictionary is empty
		if (isEmpty())
			return;

		// if key present at head node
		else if (head.key.equals(key)) {
			head = head.next;
			size--;
		} else {
			// if key present any where in the dictionary
			Node current = head;
			Node prev = null;
			while (current != null && !current.key.equals(key)) {
				prev = current;
				current = current.next;
			}
			if (current != null) {
				prev.next = current.next;
				size--;
			}
		}
	}

	/**
	 * 
	 * @param key
	 * @return Value Retrieve the value associated with a specific key if it exists,
	 *         otherwise return null
	 */
	public V getValue(K key) {
		// Look for all entries in dictionary
		Node current = head;
		while (current != null) {
			// if any entry key is matched with given key return corresponding entry value
			if (current.key.equals(key))
				return current.value;
			current = current.next;
		}

		// if given key not in dictionary return null
		return null;
	}
	/**
	 * @param key
	 * @return true/False
	 * check if the similar key is already in the pair
	 */
	public boolean contains(K key) {
		// Look for all entries in dictionary
		Node current = head;
		while (current != null) {
			// if any entry key is matched with given key return true
			if (current.key.equals(key))
				return true;
			current = current.next;
		}
		// if given key not in dictionary return false;
		return false;
	}

	/**
	 * 
	 * @return True/False check if size =0
	 */
	public boolean isEmpty() {
		// returns true if size=0 otherwise false
		return (size == 0);
	}

	// Utility method to print the entries in Dictionary(OPTIONAL)
	public void printDic() {
		Node current = head;
		while (current != null) {
			System.out.println(current);
			current = current.next;
		}
	}
}
