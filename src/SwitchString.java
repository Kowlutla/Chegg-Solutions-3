
public class SwitchString {

	// Main method
	public static void main(String[] args) {

		// call the method switchOX using some example
		System.out.printf("switchXO(\"X\") -> \"%s\"\n\n", switchXO("X"));

		System.out.printf("switchXO(\"\") -> \"%s\"\n\n", switchXO(""));

		System.out.printf("switchXO(\"XO\") -> \"%s\"", switchXO("XO"));

	}

	/**
	 * Method that takes
	 * @param str
	 * @return String that switch X->O and vice versa
	 */
	public static String switchXO(String str) {
		// Create StringBuffer Object to Store resulted string
		StringBuffer result = new StringBuffer();

		// for all characters in string str
		for (int i = 0; i < str.length(); i++) {
			// get the current character
			char currentChar = str.charAt(i);

			// if current character is 'X' add 'O' to result
			if (currentChar == 'X') {
				result.append("O");
			}

			// if current character is 'O' add 'X' to result
			else if (currentChar == 'O') {
				result.append("X");
			}
			// for remaining add original character
			else {
				result.append(currentChar);
			}
		}
		// return result by converting into String
		return result.toString();
	}
}
