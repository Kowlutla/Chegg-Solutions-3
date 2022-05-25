
public class Main {

	// Main method
	public static void main(String[] args) {

		String test1 = "It's 0.";
		// print absolute difference of upper and non upper character count for test1
		System.out.println("\ncompareUpper(\"It's 0.\"): " + compareUpper(test1));

		String test2 = "";
		// print absolute difference of upper and non upper character count for test2
		System.out.println("\ncompareUpper(\"\"): " + compareUpper(test2));

		String test3 = "COMPSCI";
		// print absolute difference of upper and non upper character count for test3
		System.out.println("\ncompareUpper(\"COMPSCI\"): " + compareUpper(test3));

		String test4 = "$%&**";
		// print absolute difference of upper and non upper character count for test4
		System.out.println("\ncompareUpper(\"$%&**\"): " + compareUpper(test4));

	}

	/**
	 * 
	 * @param inputStr
	 * @return absolute difference of upperCaseCount and nonUpperCaseCount
	 */
	public static int compareUpper(String inputStr) {
		int upperCount = 0;// to count uppercase characters
		int nonUpperCount = 0;// to count non uppercase characters

		// for all characters in inputStr
		for (int i = 0; i < inputStr.length(); i++) {
			// if current character is upperCaseCount
			if (Character.isUpperCase(inputStr.charAt(i))) {
				// increment uppercount
				upperCount++;
			}
			// Otherwise increment nonUpperCaseCount
			else {
				nonUpperCount++;
			}
		}

		// return absolute difference of upperCaseCount and nonUpperCaseCount
		return Math.abs(upperCount - nonUpperCount);
	}

}
