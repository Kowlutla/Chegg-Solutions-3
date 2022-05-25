
//Child Class Box 
public class Box extends Rectangle {

	// Attribute of Box
	private double height;

	/**
	 * Mathod to set values for length,width and height
	 * 
	 * @param L
	 * @param W
	 * @param H
	 */
	public void setBox(double L, double W, double H) {
		// call parent class method
		super.setRectangle(L, W);
		this.height = H;
	}

	/**
	 * toString method to return String representation of Box
	 */
	public String toString() {
		// use Rectangle class toString method
		return super.toString() + "\tHeight: " + height;
	}
}
