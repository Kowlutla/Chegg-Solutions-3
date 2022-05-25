
//Tester class
public class LinkedDictionaryTester {

	public static void main(String[] args) {

		// Creating Dictionary Object with key type Integer and Value type String
		LinkedDictionary<Integer, String> dic = new LinkedDictionary<Integer, String>();

		// checking Dictionary is empty or not
		System.out.println("Is Empty: " + dic.isEmpty());

		// add some key-value pairs to Dictionary
		dic.add(151337, "kowlutla");
		dic.add(151129, "Sudeepthi");
		dic.add(151330, "Anji");
		dic.add(151335, "Dheeraj");

		// printing Dictionary
		System.out.println("\n* * * Dictionary is * * *");
		dic.printDic();

		// get and print value by passing key
		System.out.println("\nValue Of 151129: " + dic.getValue(151129));

		// Checking Dictionary contains 151337 key or not
		System.out.println("\nIs Contain 151337: " + dic.contains(151337));

		// Checking Dictionary contains 15130 key or not
		System.out.println("\nIs Contain 151130: " + dic.contains(151130));

		// Checking Dictionary is empty or not
		System.out.println("\nIs Empty: " + dic.isEmpty());

		// removing 151330
		dic.remove(151330);

		// printing dictionary after removing key 151330
		System.out.println("\n* * * After removing key 151330 * * *");
		dic.printDic();

		// adding key-value where key is already present
		dic.add(151335, "Deekshita");
		// printing dictionary after adding 151335-'Deekhita'
		System.out.println("\n* * * After adding key-value with already present key * * *");
		dic.printDic();
	}
}
