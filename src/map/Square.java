package map;

//Class Square
public class Square extends Shape{
	
	//properties of Square
	private double side;


	/**
	 * Default Constructor
	 */
	public Square() {
		super();
	}
	/**
	 * Parameterized Constructor
	 * @param side
	 */
	public Square(double side) {
		super();
		this.side = side;
	}
	/**
	 * @return the side
	 */
	public double getSide() {
		return side;
	}
	/**
	 * @param side the side to set
	 */
	public void setSide(double side) {
		this.side = side;
	}
	
	
	/**
	 * Method to return area of Circle
	 */
	@Override
	public double area() {
		return side*side;
	}
}
