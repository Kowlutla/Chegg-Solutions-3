import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class Album {

	// fields
	private String title;
	private String name;
	private HashSet<Truck> trucks;

	/**
	 * Constructor that takes
	 * 
	 * @param title
	 * @param name  and initializes tha all fields and instantiate the HashSet
	 */
	public Album(String title, String name) {
		this.title = title;
		this.name = name;
		trucks = new HashSet<Truck>();
	}

	// Getter methods for all attributes
	public String getTitle() {
		return title;
	}

	public String getName() {
		return name;
	}

	public HashSet<Truck> getTrucks() {
		return trucks;
	}

	// Setter methods for all variables
	public void setTitle(String title) {
		this.title = title;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTrucks(HashSet<Truck> trucks) {
		this.trucks = trucks;
	}

	/**
	 * Print the information of all trucks
	 */
	public void print() {
		// iterator to iterate all truck Objects
		Iterator<Truck> iter = trucks.iterator();
		while (iter.hasNext()) {
			// get the current truck
			Truck current = iter.next();
			// print title of truck
			System.out.println("Title: " + current.getTitle());
			// print date of truck
			System.out.println("Date: " + current.getDate());
			// print songs title
			System.out.println("Songs: ");
			HashMap<Integer, Song> songs = current.getSongs();
			for (Entry<Integer, Song> e : songs.entrySet()) {
				System.out.println(e.getValue().getTitle());
			}
			System.out.println();
		}
	}

	/**s
	 * count how much song in each truck published before 2017
	 * 
	 * @return the results
	 */
	public int count() {
		int result = 0;// to count much song in each truck published before 2017

		// for all Trucks in trucks
		for (Truck truck : trucks) {
			// get year from date (Assume date format is dd-mm-yyyy)
			int year = Integer.parseInt(truck.getDate().substring(6));

			// if year is before 2017n
			if (year < 2017) {
				result++;// increment result
			}
		}
		// return the result
		return result;
	}
}
