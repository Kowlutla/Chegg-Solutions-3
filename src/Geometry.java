
//2.import Scanner at top of program
import java.util.Scanner;

/**
 * 3.
 * @author kowlutla
 */
//4.Declare and open your class named Geometry
public class Geometry {

	// 5.Declare main method
	public static void main(String[] args) {
		// 5.1 Create Scanner Object
		Scanner in = new Scanner(System.in);
		// 6.2 go back to main method call displayMenu()method
		displayMenu();

		// 7.1 prompt user to enter their choice(1-3) store the input in seperate
		// variable
		System.out.print("Enter your choice(1-3): ");
		int choice = in.nextInt();
		/*
		 * 7.2 Validate input by using while loop to check if the choice is less than 1
		 * or greater than 3.if it is output an "Invalid" message prompt the user again
		 */
		while (choice > 3 || choice < 1) {
			System.out.print("Invalid choice.Please enter 1 - 3: ");
			choice = in.nextInt();
		}
		// 13.1 Call selectOption method and choice as parameter
		selectOption(choice);
		// 13.2 Output GoodBye message
		System.out.println("\nThanks for using the Geometry Calculator - Goodbye!");
		in.close();
	}

	/*
	 * 6.outside Main method write method displayMenu that doesn't take andy
	 * parameters and not returns value
	 * 
	 */
	public static void displayMenu() {
		// 6.1 Use println() to print welcome message and options
		System.out.println("Welcome to the Geometry Calculator Application\n");
		System.out.println("1.Calculate the Area of a circle: ");
		System.out.println("2.Calculate the Area of a Rectangle: ");
		System.out.println("3.Calculate the Area of a Triangle: ");
	}

	/*
	 * 8.Outside main method write circle() which doesn't take any parameters return
	 * double value for area of circle
	 */
	public static double circle() {
		// 8.1 Create Scanner Object to read input
		Scanner in = new Scanner(System.in);

		// 8.2 prompt user to enter radius
		System.out.print("What is the circle's radius? ");
		double radius = in.nextDouble();

		in.close();
		// 8.3 Calculate the area of circle and return value
		return Math.PI * radius * radius;
	}

	/*
	 * 9.outside main method write method rectangle() that doesn't take any
	 * parameters but returns double for area of rectangle
	 */
	public static double rectangle() {
		// 9.1 Create Scanner Object to read input
		Scanner in = new Scanner(System.in);
		// 9.2 prompt user to enter length and width of rectangle
		System.out.print("What is the rectangle's length? ");
		double length = in.nextDouble();
		System.out.print("What is the rectangle's width? ");
		double width = in.nextDouble();
		in.close();
		// 9.3 calculate the area of rectangle and return
		return length * width;
	}

	/*
	 * 10.outside main method write method triangle() that doesn't take any
	 * parameters but returns double for area of triangle
	 */
	public static double triangle() {
		// 10.1 Create Scanner Object to read input
		Scanner in = new Scanner(System.in);

		// 10.2 prompt user to enter base and height of triangle
		System.out.print("What is the length of triangle's base? ");
		double base = in.nextDouble();
		System.out.print("What is the triangle's height? ");
		double height = in.nextDouble();

		in.close();
		// 10.3 calculate the area of triangle and return
		return (base * height) / 2;
	}

	/**
	 * 11.Outside main method write printArea() method takes double as parameter and
	 * does not return any value
	 * 
	 * 11.2 adding @param tag for parameter value
	 * 
	 * @param area
	 */
	public static void printArea(double area) {
		// 11.1 use printf method to output area upto 2 decimal places
		System.out.printf("The area is %.2f\n", area);
	}

	/**
	 * 12. Outside main method write selectOption() that takes int variable as
	 * paramter and doesn't return a value
	 * 
	 * 12.2
	 * 
	 * @param choice
	 */
	public static void selectOption(int choice) {
		// 12.1 use if/else if/else statements to check if choice is equal to 1 or 2 or
		// 3

		// 12.1.1 if choice equals to 1
		if (choice == 1) {
			//call circle() store return circle area in variable
			double circleArea = circle();
			//call printArea method and pass circle area as paramter
			printArea(circleArea);
		}
		// 12.1.2 if choice equals to 2
		else if (choice == 2) {
			//call rectangle() store return rectangle area in variable
			double rectangleArea = rectangle();
			//call printArea method and pass rectangle area as paramter
			printArea(rectangleArea);
		}

		// 12.1.3 if choice equals to 3
		else if (choice == 3) {
			// call triangle() store return triangle area in variable
			double triangleArea = triangle();
			//call printArea method and pass triangle area as paramter
			printArea(triangleArea);
		}
	}
}
