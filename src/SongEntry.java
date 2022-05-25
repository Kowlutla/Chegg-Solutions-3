
public class SongEntry {

	// private fields
	private String uniqueID;
	private String songName;
	private String artistName;
	private int songLength;

	/**
	 * Default constructor
	 */
	public SongEntry() {
		uniqueID = "none";
		songName = "none";
		artistName = "none";
		songLength = 0;
	}

	/**
	 * Paremeterized Constructor that takes
	 * 
	 * @param uniqueID
	 * @param songName
	 * @param artistName
	 * @param songLength and initialize all fileds of SongEntry with given values
	 */
	public SongEntry(String uniqueID, String songName, String artistName, int songLength) {
		this.uniqueID = uniqueID;
		this.songName = songName;
		this.artistName = artistName;
		this.songLength = songLength;
	}

	// public methods
	/**
	 * Accessor method for id
	 * 
	 * @return uniqueid
	 */
	public String getID() {
		return uniqueID;
	}

	/**
	 * Accessor method for songName
	 * 
	 * @return songName
	 */
	public String getSongName() {
		return songName;
	}

	/**
	 * Accessor method for artistName 
	 * @return artistName
	 */
	public String getArtistName() {
		return artistName;
	}

	/**
	 * Accessor method for songLength	 * 
	 * @return songLength
	 */
	public int getSongLength() {
		return songLength;
	}
}
