package com.chegg.atoms;

import java.util.ArrayList;

//Create another class which will contain the  main method.
public class CollegeList {

	public static void main(String[] args) {

		// instantiate 6 objects of the College class.
		College palomar = new College("Palomar   ", "San Marcos", 26000, 1943);
		College miraCosta = new College("MiraCosta", " Oceanside", 19000, 1934);
		College grossmont = new College("Grossmont", "El Cajon", 18000, 1968);
		College saddleback = new College("Saddleback", "Mission Viejo", 26000, 1934);
		College mesa = new College("Mesa     ", "San Diego", 25000, 1958);
		College southwestern = new College("Southwestern", "Chula Vista", 21000, 1961);

		/**
		 * Create an ArrayList named schoolList having a base type of College with an
		 * initial capacity of 3.
		 */

		ArrayList<College> schoolList = new ArrayList<College>(3);

		/**
		 * Add the objects for Palomar, MiraCosta, and Grossmont to schoolList at the
		 * end of the list using the add method.
		 */
		schoolList.add(palomar);
		schoolList.add(miraCosta);
		schoolList.add(grossmont);

		/**
		 * Insert the Saddleback object to schoolList at position 1 and the Mesa object
		 * at position 2. Use the add method which allows you to insert an element at a
		 * specific index.
		 */
		schoolList.add(1, saddleback);
		schoolList.add(2, mesa);

		/**
		 * At the end of the report, display the number of College objects listed.
		 * Invoke your new method. (It should display the Palomar, Saddleback, Mesa,
		 * MiraCosta, and Grossmont colleges, in that order.)
		 */
		showSchools(schoolList);

		/**
		 * Determine the index of the Grossmont object in the list using the indexOf
		 * method and store in an int variable.
		 */

		int index = schoolList.indexOf(grossmont);

		/**
		 * Using the index from the last step, replace the Grossmont object with the
		 * Southwestern object using the set method.
		 */
		schoolList.set(index, southwestern);

		/**
		 * Remove the objects representing MiraCosta and Saddleback using the remove
		 * method.
		 */
		schoolList.remove(miraCosta);
		schoolList.remove(saddleback);

		/**
		 * Invoke the method that you wrote to display the College objects in schoolList
		 * again.
		 */

		showSchools(schoolList);

		/**
		 * Show what happens when you simply print the schoolList variable:
		 */
		System.out.println(schoolList);

		/**
		 * Empty schoolList using the clear() method
		 */
		schoolList.clear();

		/**
		 * Reduce the capacity of schoolList using the trimToSize() method.
		 */
		schoolList.trimToSize();

		/**
		 * Invoke the showschools method one last time to display the College objects in
		 * schoolLlist.
		 */
		showSchools(schoolList);
	}

	/**
	 * Write a method with the following heading: t should use an enhanced for-loop
	 * to display on the console all of the College objects in the ArrayList passed
	 * as a parameter. The list should be formatted into a columnar report (with
	 * headings) similar to the format used above. Do not use the toString() method
	 * in the College class. Instead, you should use the printf method to format
	 * each line.
	 */
	private static void showSchools(ArrayList list) {

		System.out.println("\nCollege\t\tCity\t\tStudents Est.\tDate");
		System.out.println("----------\t-----\t\t------------\t------");
		for (Object college : list) {
			College c = (College) college;
			System.out.printf("%s\t%s\t%d\t\t%d\n", c.getName(), c.getCity(), c.getStudents(), c.getEstablished());

		}

		System.out.println("No Of Collages: " + list.size());
		System.out.println();
	}

}
