
//parent class rectangle
public class Rectangle {

	// attributes of Rectangle
	private double length;
	private double width;

	/**
	 * Mathod to set values for length and width
	 * 
	 * @param L
	 * @param W
	 */
	public void setRectangle(double L, double W) {
		this.length = L;
		this.width = W;
	}

	/**
	 * toString method to return String representation of rectangle
	 */
	public String toString() {
		return "Length: " + length + "\tWidth: " + width;
	}

}
