public class Stage1{
	

	/**
	 *
	 * 
	 * 
	 * @param str
	 * 
	 * @return true if str contains ONLY digits ('0' to '9'), false otherwise.
	 *
	 * 
	 * 
	 *         !!!!!!IMPORTANT!!!!!! return true if str is empty
	 *
	 * 
	 * 
	 *         return false if str is null.
	 *
	 * 
	 * 
	 *         HINT: you can check that a char ch is a digit using
	 *         Character.isDigit(ch)
	 * 
	 */

	public boolean isNumeric(String str) {

		if (str.isEmpty()) {

			return true;

		}

		if (!Character.isDigit(str.charAt(0))) {

			return false;

		}

		str = str.replaceAll(String.valueOf(str.charAt(0)), "");

		return isNumeric(str);

	}

	
}