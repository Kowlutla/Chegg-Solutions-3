package lab_7;

import java.util.Scanner;

public class AppointmentDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// take input from user for Appointment 1
		System.out.print("Enter day of Appointment1: ");
		int day1 = sc.nextInt();
		System.out.print("Enter month of Appointment1: ");
		int month1 = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter description of Appointment1: ");
		String description1 = sc.nextLine();

		// Create Appointment with provided values
		Appointment obj1 = new Appointment(day1, month1, description1);

		// take input from user for Appointment 2
		System.out.print("\nEnter day of Appointment2: ");
		int day2 = sc.nextInt();
		System.out.print("Enter month of Appointment2: ");
		int month2 = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter description of Appointment2: ");
		String description2 = sc.nextLine();

		// Create Appointment with provided values
		Appointment obj2 = new Appointment(day2, month2, description2);

		// Print the 2 objects.
		System.out.println(obj1);
		System.out.println(obj2);

		// Checking whether two objects have same data by calling method
		if (obj1.hasTheSameDate(obj2)) {
			System.out.println("Both Appointments have same data");
		} else {
			System.out.println("Both Appointments have different data");
		}

		sc.close();
	}

}
