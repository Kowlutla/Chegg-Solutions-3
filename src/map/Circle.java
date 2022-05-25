package map;

//Class Circle
public class Circle extends Shape{
	
	//properties of Circle
	private double radius;

	/**
	 * Default Constructor
	 */
	public Circle() {
		super();
	}

	/**
	 * Parameterized Constructor
	 * @param radius
	 */
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	/**
	 * Method to return area of Circle
	 */
	@Override
	public double area() {
		return Math.PI*radius*radius;
	}
	
}
