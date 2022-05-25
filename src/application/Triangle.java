package application;

//Triangle class that implemented AddColor interface
public class Triangle implements AddColor {

	// Three sides of Triangle
	double side1;
	double side2;
	double side3;

	/**
	 * Constructor that takes
	 * 
	 * @param side1
	 * @param side2
	 * @param side3 and initilize the side of triangle
	 */
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	// Method to return perimeter of triangle
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	// provide the implementation of hoeToColor method
	@Override
	public void howToColor() {

		System.out.println("Color all three sides");

	}
}
