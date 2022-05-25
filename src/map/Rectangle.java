package map;

//Rectangle class 
public class Rectangle extends Shape {
	
	//properties of Rectangle
	private double length;
	private double width;
	
	
	/**
	 * Default Constructor
	 */
	public Rectangle() {
		super();
	}


	/**
	 * Parameterized Constructor
	 * @param length
	 * @param width
	 */
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}


	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}


	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}


	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}


	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}
	
	
	/**
	 * Method to return area of Rectangle
	 */
	@Override
	public double area() {
		return length*width;
	}
}
