import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Create ArrayList of drinks
		ArrayList<SoftDrink> drinks = new ArrayList<SoftDrink>();

		int option;
		do {

			// showing options to user
			System.out.println("Enter option: (1) add soft drink (2) quit:");
			option = sc.nextInt();
			// if user enter 2 quit from loop
			if (option == 2) {
				break;
			}

			// Asking user to enter name,color and volume
			System.out.println("Enter name,color and volume in ml seperated by space");
			String name = sc.next();
			String color = sc.next();
			int volume = sc.nextInt();

			// Create SoftDrink obj with provided data
			SoftDrink drink = new SoftDrink(name, color, volume);

			// add soft drink to soft drinks
			drinks.add(drink);
		} while (true);

		// printing all soft drinks
		System.out.println("Soft Drinks in Original Order: ");
		for (SoftDrink drink : drinks) {
			System.out.println(drink);
		}

		System.out.println();
		// Sort soft drinks by name in ascending order
		Collections.sort(drinks, (o1, o2) -> {

			if (o1.getName().compareToIgnoreCase(o2.getName()) > 0) {
				return 1;
			} else if (o1.getName().compareToIgnoreCase(o2.getName()) < 0) {
				return -1;
			} else {

				if (o1.getColor().compareToIgnoreCase(o1.getColor()) > 0) {
					return 1;
				} else if (o1.getColor().compareToIgnoreCase(o1.getColor()) < 0) {
					return -1;
				} else {
					return o1.getVolume() - o2.getVolume();
				}
			}
		});

		// printing all soft drinks in ascending order by name
		System.out.println("Soft Drinks in Ascending Order Of name then color then volume: ");
		for (SoftDrink drink : drinks) {
			System.out.println(drink);
		}
		sc.close();
	}

}
