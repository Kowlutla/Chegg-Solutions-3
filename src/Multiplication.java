
import java.util.Scanner;
public class Multiplication {
	public static void main(String[] args) {

		// Create Scanner Object to read input from user
		Scanner sc = new Scanner(System.in);
		// take two lists as input as string
		String lists = sc.nextLine();

		// find the index where seperation of two list
		int index = lists.indexOf('|');
		// store the list1 from entered string in string form
		String list1string = lists.substring(0, index);

		// store the list2 from entered string in string form
		String list2string = lists.substring(index + 2);

		// store the values of list1 in array of string type
		String list1[] = list1string.split(" ");

		// store the values of list3 in array of string type
		String list2[] = list2string.split(" ");

		// to calculate the product of two lists
		for (int i = 0; i < list1.length; i++) {
			// get the value from list1 and convert to integer
			int num1 = Integer.parseInt(list1[i]);
			// get the value from list2 and convert to integer
			int num2 = Integer.parseInt(list2[i]);

			// print the product of values
			System.out.print(num1 * num2 + " ");
		}
		sc.close();
	}
}
