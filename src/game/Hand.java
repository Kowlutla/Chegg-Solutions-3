package game;

public class Hand {

	public Letter leftmost;

	/*
	 * Constructor: you can modify the constructor, but make sure it is still an
	 * empty constructor (i.e. doesn't take any parameter). No marks are given for
	 * this method.
	 */
	public Hand() {
		leftmost = null;
	}

	/**
	 * Method to return the leftmost letter in the hand (the only letter that can be
	 * moved). No marks are given for this method.
	 *
	 * @return the leftmost Letter in the hand.
	 */
	public Letter leftmost() {
		return leftmost;
	}

	/**
	 * 4 marks - Pass level.
	 * Method to return the size of the hand.
	 * @return the size of the hand.
	 */
	public int size() {
		int count = 0;
		Letter current = leftmost;
		while (current != null) {
			count++;
			current = current.next;
		}

		return count;
	}
	/**
	 * 4 marks - Pass level.
	 * Method to add a letter to the hand, at the leftmost position.
	 * @param letter - the letter to be added.
	 */
	public void add(Letter letter) {
		if (leftmost == null) {
			leftmost = letter;
			return;
		} else {
			Letter current = leftmost;
			while (current.next != null) {
				current = current.next;
			}
			current.next = letter;
		}
	}

	/**
	 * 4 marks - Credit level.
	 *
	 * Method to remove the leftmost letter from the hand. Return null if the hand
	 * is empty.
	 *
	 * @return the leftmost letter in the hand if it exists, or null otherwise
	 */
	public Letter remove() {
		// to be completed
		if (leftmost == null) {
			return null;
		} else {
			Letter result = leftmost;
			leftmost = leftmost.next;
			return result;
		}
	}

	/**
	 * 4 marks - Distinction level.
	 *
	 * Method to get the i-th letter in the hand, starting with 0 for the leftmost
	 * letter. Return null if the index given is invalid.
	 *
	 * @param index - the index of the letter to be returned.
	 * @return the letter at the given index.
	 */
	public Letter get(int index) {
		// to be completed
		if (index < 0 || index > size() - 1)
			return null;
		else {
			Letter current = leftmost;
			while (index-- > 0) {
				current = current.next;
			}
			return current;
		}
	}
}
