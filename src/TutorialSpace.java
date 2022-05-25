
public class TutorialSpace {

	// slots — the number of available slots in a tutorial class
	private int slots;
	// activated — true if the tutorial class has been activated
	private boolean activated;

	/**
	 * TutorialSpace(n) — a constructor for a tutorial class with n slots.
	 * 
	 * @param n
	 */
	public TutorialSpace(int n) {
		this.slots = n;
		this.activated = false;
	}

	/**
	 * activate() — activates the tutorial class. Throws an exception if the
	 * tutorial class has already been activated.
	 * 
	 * @throws NotActivatedException
	 */

	public void activate() throws NotActivatedException {
		if (activated) {
			throw new NotActivatedException("Already Activated");
		} else {
			activated = true;
		}
	}

	/**
	 * reserveSlot()—enrol a student into the tutorial class by decreasing the
	 * number of slots left for enrolling in the class. Throws an exception if slot
	 * is either completely used or the tutorial class is not active.
	 * 
	 * @throws EmptyException
	 */
	public void reserveSlot() throws EmptyException {

		if (!activated || slots == 0) {
			throw new EmptyException("Tutorial space is empty");
		} else {
			slots--;
		}
	}

	/**
	 * slotsRemaining()—returns the number of slots remaining in the tutorial class.
	 */

	public int slotsRemaining() {
		return slots;
	}

}
