package chapter8_debug;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * program that uses the class structure implemented in the first exercise:
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Create ArrayList of Person to store Student and Staff details
		ArrayList<Person> list = new ArrayList<Person>();
		int choice;
		while (true) {
			// display user choices
			System.out.println("1:Student\n2:Staff");
			System.out.print("Select your choice: ");
			choice = sc.nextInt();
			sc.nextLine();
			// if choice is 1
			if (choice == 1) {
				// create Student Object
				Student student = new Student();
				// Take data for Student
				System.out.print("Student Name: ");
				String studentName = sc.nextLine();
				System.out.print("Student Address: ");
				String studentAddress = sc.nextLine();
				System.out.print("Student Date Of Birth: ");
				String studentDateOfBirth = sc.nextLine();
				System.out.print("Student Number: ");
				int studentNumber = Integer.parseInt(sc.nextLine());
				System.out.print("Student Start Date: ");

				// Set the data Using setters
				String studentStartDate = sc.nextLine();
				student.setName(studentName);
				student.setAddress(studentAddress);
				student.setDateOfBirth(studentDateOfBirth);
				student.setStudentNumber(studentNumber);
				student.setStartDate(studentStartDate);

				// add Student to list
				list.add(student);

			}

			// if choice is 2
			else if (choice == 2) {
				// Create Staff Object
				Staff staff = new Staff();
				// Take data for Staff
				System.out.print("Staff Name: ");
				String staffName = sc.nextLine();
				System.out.print("Staff Address: ");
				String staffAddress = sc.nextLine();
				System.out.print("Staff Date Of Birth: ");
				String staffDateOfBirth = sc.nextLine();
				System.out.print("Staff Employee Number: ");
				String staffEmployeeNumber = sc.nextLine();
				System.out.print("Staff Location: ");
				String staffLocation = sc.nextLine();
				System.out.print("Staff Title: ");
				String staffTitle = sc.nextLine();

				// Set the data Using setters
				staff.setName(staffName);
				staff.setAddress(staffAddress);
				staff.setDateOfBirth(staffDateOfBirth);
				staff.setEmployeeNumber(staffEmployeeNumber);
				staff.setLocation(staffLocation);
				staff.setTitle(staffTitle);

				// add Staff to list
				list.add(staff);
			}

			// asking to continue or not
			System.out.print("Do you want to add more people? (y/n): ");
			char option = sc.nextLine().charAt(0);
			if (option == 'n' || option == 'N') {
				break;
			}
		}

		// print all students
		System.out.println("\n* * * All Students are * * * ");
		for (Person p : list) {
			if (p instanceof Student) {
				((Student) p).printStudent();
			}
		}

		// print all Staff
		System.out.println("\n* * * All Staff are * * * ");
		for (Person p : list) {
			if (p instanceof Staff) {
				((Staff) p).printStaff();
			}
		}
		sc.close();
	}

}
