package application;

//java class BookAuthorCopy
public class BookAuthorCopy {
	
	/**
	 * which holds the bookName(String), 
	 * authorName (String), and 
	 * numCopies (int) (all of 
	 * which are private members of the class 
	 */
	
	private String bookName;
	private String authorName;
	private int numCopies;
	
	
	/**
	 * Constructor that takes 
	 * @param bookName
	 * @param authorName
	 * @param numCopies
	 * and initialize the fields of BookAuthorCopy
	 */
	public BookAuthorCopy(String bookName, String authorName, int numCopies) {
		this.bookName = bookName;
		this.authorName = authorName;
		this.numCopies = numCopies;
	}


	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}


	/**
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	/**
	 * @return the authorName
	 */
	public String getAuthorName() {
		return authorName;
	}


	/**
	 * @param authorName the authorName to set
	 */
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


	/**
	 * @return the numCopies
	 */
	public int getNumCopies() {
		return numCopies;
	}


	/**
	 * @param numCopies the numCopies to set
	 */
	public void setNumCopies(int numCopies) {
		this.numCopies = numCopies;
	}
}
