
public class Song {

	// fields
	private String title;
	private int number;
	private String singer;
	private int publishedDate;

	/**
	 * Constructor that takes
	 * 
	 * @param title
	 * @param number
	 * @param singer
	 * @param publishedDate and initializes the fields
	 */
	public Song(String title, int number, String singer, int publishedDate) {
		this.title = title;
		this.number = number;
		this.singer = singer;
		this.publishedDate = publishedDate;
	}

	// Getter methods for all fields
	public String getTitle() {
		return title;
	}

	public int getNumber() {
		return number;
	}

	public String getSinger() {
		return singer;
	}

	public int getPublishedDate() {
		return publishedDate;
	}

	// Setter methods for all fields
	public void setTitle(String title) {
		this.title = title;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public void setPublishedDate(int publishedDate) {
		this.publishedDate = publishedDate;
	}
}
