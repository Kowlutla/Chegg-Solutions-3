
//Tester class 
public class Tester {

	public static void main(String[] args) {

		// Create Object for Class Rectangle
		Rectangle rectangle = new Rectangle();

		// Use setRactangle method to set values for length and width
		rectangle.setRectangle(10, 20);

		// print rectangle which uses toString method internally
		System.out.println("Rectangle: \n"+rectangle);

		// Create Object for Class Box
		Box box = new Box();

		// Use setBox method to set values for length,width and Height
		box.setBox(15,30,45);

		// print box which uses toString method internally
		System.out.println("\nBox: \n"+box);

	}

}
