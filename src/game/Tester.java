package game;

import java.util.LinkedList;
import java.util.ListIterator;

public class Tester {

	static Integer sillyMethod(LinkedList<Integer> L1, LinkedList<Integer> L2) {
		ListIterator<Integer> p1 = L1.listIterator();
		ListIterator<Integer> p2 = L2.listIterator();
		while (p2.hasNext()) {
			p1.next();
			p2.next();
			if (p2.hasNext()) {
				p2.next();
			}
		}
		return p1.next();
	}

	public static void main(String[] args) {

		LinkedList<Integer>list1=new LinkedList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(8);
		list1.add(9);
		list1.add(10);
		
		LinkedList<Integer>list2=new LinkedList<>();
		list2.add(11);
		list2.add(12);
		list2.add(13);
		list2.add(14);
		list2.add(15);
		list2.add(16);
		list2.add(17);
		list2.add(18);
		list2.add(19);
		list1.add(20);
		
		System.out.println(sillyMethod(list1, list2));
	}

}
