package map;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//asking user to enter no of shapes
		System.out.print("How many of the selected shape wants to create: ");
		int n = sc.nextInt();
		
		//Creating ArrayList of Shapes
		ArrayList<Shape> shapes = new ArrayList<Shape>(n);

		Shape shape = null;
		int i = 1;
		
		//to read n Shapes
		while (i <= n) {
			
			//display menu to user
			System.out.println("1.Circle\n2.Square\n3.Rectangle\n4.Display Shapes");
			
			//asking user to enter choice
			System.out.print("Your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			
			//if user choice is 1 then it is Circle
				case 1: {
					System.out.println("* * * Your choice is Circle * * * ");
					System.out.print("Enter radius: ");
					double radius = sc.nextDouble();
					shape = new Circle(radius);
					shapes.add(shape);
					i++;
					break;
				}
				//if user choice is 2 then it is Square
				case 2: {
					System.out.println("* * * Your choice is Square * * * ");
					System.out.print("Enter Side: ");
					double side = sc.nextDouble();
					shape = new Square(side);
					shapes.add(shape);
					i++;
					break;
				}
				//if user choice is 3 then it is Rectangle
				case 3: {
					System.out.println("* * * Your choice is Rectangle * * * ");
					System.out.print("Enter length: ");
					double length = sc.nextDouble();
					System.out.print("Enter width: ");
					double width = sc.nextDouble();
					shape = new Rectangle(length, width);
					shapes.add(shape);
					i++;
					break;
	
				}
				//if user choice is 4 then it is printShapes
				case 4: {
					printShapes(shapes);
					break;
				}
				default: {
					System.out.println("Invalid Choice... Choose again");
				}
			}
		}
		//printing final Shapes
		System.out.println("\n----------------Final Shapes are------------");
		printShapes(shapes);
		sc.close();

	}

	// Method to print the shapes
	public static void printShapes(ArrayList<Shape> shapes) {

		System.out.println("* * * Shapes created so far are * * * ");

		for (Shape shape : shapes) {
			if (shape instanceof Circle) {
				System.out.print("Name: Cirlce\t");
			} else if (shape instanceof Square) {
				System.out.print("Name: Square\t");
			} else {
				System.out.print("Name: Rectangle\t");
			}
			System.out.println(shape.area());
			System.out.println();
		}
	}

}
