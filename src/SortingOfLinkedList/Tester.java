package SortingOfLinkedList;

public class Tester {

	public static void main(String[] args) {

		System.out.println("Printing even numbers in list");
		// create 1 -> 2 -> 5 -> 3 -> 8
		LinkedList list1 = new LinkedList();
		list1.insert(1);
		list1.insert(2);
		list1.insert(5);
		list1.insert(3);
		list1.insert(8);

		list1.printEven();

		// create 101 -> 120 -> 25 -> 91-> 87 -> 1
		LinkedList list2 = new LinkedList();
		list2.insert(101);
		list2.insert(120);
		list2.insert(25);
		list2.insert(91);
		list2.insert(87);
		list2.insert(1);
		list2.printEven();

		System.out.println("======================================================");

		System.out.println("Checking for element in list: ");
		System.out.println(list1.isContain(7));
		System.out.println(list2.isContain(87));

		System.out.println("\n======================================================");
		System.out.println("Reversing list: ");
		list1.reverse();
		list1.traverse();

		System.out.println("\n======================================================");
		System.out.println("Sorting List: ");
		list1 = new LinkedList();
		list1.insert(1);
		list1.insert(2);
		list1.insert(5);
		list1.insert(3);
		list1.insert(8);
		list1.sortList();
		list1.traverse();

		System.out.println("\n======================================================");
		System.out.println("Sum Of items in List: ");
		System.out.println(list1.sumOfElements());

		System.out.println("\n======================================================");
		System.out.println("Rotate List ");
		System.out.println("left Rotate: ");
		list1 = new LinkedList();
		list1.insert(3);
		list1.insert(2);
		list1.insert(5);
		list1.insert(1);
		list1.insert(8);
		list1.rotate("left", 2);
		list1.traverse();

		System.out.println("Right Rotate: ");
		list1 = new LinkedList();
		list1.insert(3);
		list1.insert(2);
		list1.insert(5);
		list1.insert(1);
		list1.insert(8);
		list1.rotate("right", 2);
		list1.traverse();
	}
}
