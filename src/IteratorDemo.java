import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {

		System.out.println("INTERACTIVE PRACTICE 15.2 Letterslist\n");
		
		// Create List Object to hold strings
		List<String> letters = new ArrayList<>();

		// add Strings to letters list
		letters.add("A");
		letters.add("B");
		letters.add("C");
		letters.add("D");
		letters.add("E");

		// create iterator Object
		ListIterator<String> iter = letters.listIterator();
		// print letters in original order
		System.out.println("Original Order: " + letters);

		// print first Object in Iterator
		System.out.println("\n1st next(): " + iter.next());

		// print second Object in Iterator
		System.out.println("\n2nd next: " + iter.next());
		// remove current Object in iterator from letters
		iter.remove();
		// print letters after remove
		System.out.println("\nString after remove(): " + letters);

		// print third Object in Iterator
		System.out.println("\nThird next: " + iter.next());

		// add "E" to letters using iterator
		iter.add("E");
		// print letters after adding "E"
		System.out.println("\nString after add(E): " + letters);

		// print fourth Object in Iterator
		System.out.println("\n4th next: " + iter.next());

		// add "F" to letters using iterator
		iter.add("F");
		// print letters after adding "F"
		System.out.println("\nString after add(F): " + letters);
		
		System.out.println("\nTHE END OF INTERACTIVE PRACTICE 15.2 Letterslist");
	}
}
