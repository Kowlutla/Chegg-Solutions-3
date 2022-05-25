import java.util.Scanner;

public class Palindroome {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		//taking string as input from user
		String string=sc.nextLine();
		//Print out the original string
		System.out.println("Original String: "+string);
		
		//check and print whether string is palindrome or not
		System.out.print("\nPalindrome(YES/NO): ");
		if(isPalindrome(string))
			System.out.println("YES");
		else
			System.out.println("NO");
		sc.close();
	}
	
	/*
	 * 	1.function removeAllMarks( String ) that takes the original string as its argument
	 *  and returns a new string after the original string has been stripped of the 
	 *  punctuation marks
	 */
	public static String removeAllMarks(String string)
	{
		
		//Creating StringBuffer Object
		StringBuffer sb=new StringBuffer();
		//canning the argument string
		for(int i=0;i<string.length();i++)
		{
			/*
			 * the charAt ( int i ) method presented in Section 4.4.2 and 
			 * checking whether the character at position i is alphanumeric or not
			 */
			char current_character=string.charAt(i);
			if(Character.isLetterOrDigit(current_character))
			{
				//append ( char ) method defined for the StringBuffer class
				sb.append(current_character);
			}
		}
		
		/*
		 * StringBuffer object can be converted into a String object by 
		 * using the toString() method of the StringBuffer class.
		 */
		return sb.toString();
	}
	
	
	/*
	 * 2.Provide implementation for reverseString(String str) which returns a 
	 * new string obtained by reversing the argument string
	 */
	public static String reverse(String string)
	{
		//convert the argument string into a StringBuffer object via the latter's constructor
		StringBuffer sb=new StringBuffer(string);
		//then invoke the reverse () method on the StringBuffer object
		sb.reverse();
		return sb.toString();
	}
	
	/*
	 * 3. Provide implementation for isPalindrome( string ) that will return true or false 
	 * as to whether the argument string is a palindrome. 
	 */
	public static boolean isPalindrome(String string)
	{
		//remove all non-alpha numeric characters from string
		string=removeAllMarks(string);
		
		//Compare the cleaned up version of the original string with the cleaned up and
		//reversed version using the compareToIgnoreCase( String ) method of the String class
		if(string.compareToIgnoreCase(reverse(string))==0)
			return true;
		else
			return false;
	}
}
