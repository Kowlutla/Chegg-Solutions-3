package com.chegg.Assignment;

import java.util.*;
public class AssignmentRunner {
	public static void main(String[] args) {
		// Creating Scanner Object
		Scanner sc = new Scanner(System.in);
		// ArrayList to hold Assignment Objects
		ArrayList<Assignment> assignments = new ArrayList<Assignment>();
		while (true) {
			Assignment assignment;
			// asking user to enter assignment name
			System.out.print("Please enter an assignment name (exit to quit):");
			String name = sc.nextLine();
			// if user enter 'quit' or 'exit' then exit from loop
			if (name.equalsIgnoreCase("quit") || name.equalsIgnoreCase("exit"))
				break;
			else// otherwise
			{
				// Asking user to enter available points
				System.out.print("Please enter the available points: ");
				double availablePoints = sc.nextDouble();

				// Asking user to enter earned points
				System.out.print("Please enter the earned points: ");
				double earnedPoints = sc.nextDouble();

				// asking user to enter whether it is test or project
				System.out.print("Is this a (t)est or (p)roject: ");
				char testOrProject = sc.next().charAt(0);
				sc.nextLine();
				// if user choose test
				if (testOrProject == 't') {
					// ask user to enter test date
					System.out.print("Please enter the test date: ");
					String testDate = sc.next();
					sc.nextLine();

					// create Test Object with provided data
					assignment = new Test(name, availablePoints, earnedPoints, testDate);
				}
				// if user choose project
				else if (testOrProject == 'p') {
					// Ask user to enter due date
					System.out.print("Please enter the due date: ");
					String dueDate = sc.next();
					sc.nextLine();
					// Ask user to enter is gropu project or not
					System.out.print("Group project? true or false: ");
					boolean groups = sc.nextBoolean();
					sc.nextLine();
					// create Project Object with given data
					assignment = new Project(name, availablePoints, earnedPoints, dueDate, groups);
				}
				// if user enter any other option other than project or test
				else {
					// show invalid message
					System.out.print("Invalid Option..");
					continue;
				}
				// add the assignment to assignments list
				assignments.add(assignment);
			}
		}
		double average_points;// to hold the averagePoints

		// if no assignments are given
		if (assignments.size() == 0) {
			// set average points to 0
			average_points = 0;
		}
		// Otherwise calculate the average points by calling method average
		else {
			average_points = average(assignments);
		}
		// print average points
		System.out.println("Your average: " + average_points);

		sc.close();
	}
	// method to calculate average points
	public static double average(ArrayList<Assignment> assignments) {	
		double totalAvailablePoints = 0;// to hold total availablepoints
		double totalEarnedPoints = 0;// to hold total earned points

		// For each assignment in assignments
		for (Assignment a : assignments) {
			// add current assignment available points to totalAvailablePoints
			totalAvailablePoints += a.getAvailablePoints();

			// add current assignment earnedPoints to totalEarnedPoints
			totalEarnedPoints += a.getEarnedPoints();
		}

		// return average by calculating using formula
		return (totalEarnedPoints / totalAvailablePoints) * 100;
	}
}