import java.util.HashMap;

public class Truck {

	// fields
	private String title;
	private String date;
	private HashMap<Integer, Song> songs;

	/**
	 * Constructor that takes
	 * 
	 * @param title
	 * @param date  initializes the fields and instantiate HashMap
	 */
	public Truck(String title, String date) {
		this.title = title;
		this.date = date;
		songs = new HashMap<>();
	}

	// Getter methods for attributes
	public String getTitle() {
		return title;
	}

	public String getDate() {
		return date;
	}

	public HashMap<Integer, Song> getSongs() {
		return songs;
	}

	// Setter method for all variables
	public void setTitle(String title) {
		this.title = title;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setSongs(HashMap<Integer, Song> songs) {
		this.songs = songs;
	}
}

