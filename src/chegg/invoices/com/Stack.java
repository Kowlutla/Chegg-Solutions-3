package chegg.invoices.com;

public class Stack {

	private static final String NOTHING = "*NOTHING TO REMOVE*";

	private String[] foundation;

	private int usage;

	public Stack(int capacity) {

		this.foundation = new String[capacity];

		this.usage = 0;

	}

	/**
	 * method peek() in Stack class that returns value of element first in line to
	 * leave structure but dont remove it
	 * 
	 * @return
	 */
	public String peek() {

		// if stack is empty,throw exception as stack is empty
		if (usage == 0) {
			throw new RuntimeException("stack is empty");
		}
		// otherwise return top of stack
		else {
			return foundation[usage - 1];
		}
	}
}
