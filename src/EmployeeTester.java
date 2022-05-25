import java.util.Scanner;

public class EmployeeTester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Create array of Employee Object of size 3;
		Employee[] employees = new Employee[3];

		/*
		 * create 3 Employee Objects by reading name,birthdate, salary and overtime from
		 * user and store in array
		 */
		for (int i = 0; i < 3; i++) {
			System.out.print("Enter the Employee name: ");
			String name = sc.nextLine();
			System.out.print("Enter the birthdate: ");
			String bDate = sc.nextLine();
			System.out.print("Enter the Salary: ");
			double salary = sc.nextDouble();
			System.out.print("Enter the overtime: ");
			int overtime = sc.nextInt();
			sc.nextLine();
			// create Employee Object with above information
			Employee e = new Employee(name, bDate, salary, overtime);
			// store employee in array
			employees[i] = e;
			System.out.println();
		}

		// 2.Display the name and year of birth of Employee Object in first cell of
		// array
		System.out.printf("\n%s is born in %d\n", employees[0].getName(), employees[0].getYearOfBirth());

		// 3.Check if first name of employee in second cell is Ali and then change to
		// John
		String name = employees[1].getName();
		String temp[] = name.split(" ");// store first name and last name
		if (temp[0].equalsIgnoreCase("Ali"))
			name = name.replace("Ali", "Jhon");
		employees[1].setName(name);
		System.out.println("\nFirst name of employee changed from Ali to Jhon");

		// 4.Change overtime of employee in third cell to 20
		employees[2].setOvertime(20);
		System.out.println("\nOvertime of employee changed to 20");

		// 5.Display the information of all employees
		System.out.println("\nEmployees Information");
		System.out.println("=====================\n");

		for (Employee e : employees) {
			e.print();
			System.out.println();
		}
		sc.close();
	}

}
