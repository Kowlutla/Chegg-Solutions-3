
import java.util.ArrayList;
import java.util.Scanner;

public class PlayList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// ArrayList to store a playlist of songs
		ArrayList<SongEntry> playlist = new ArrayList<>();

		// prompting user for title of playlist
		System.out.println("Enter playlist's title: ");
		String playListTitle = sc.nextLine();

		// printing playList Name
		System.out.println("\nPlayList Title is: " + playListTitle);
		sc.close();
	}
}
