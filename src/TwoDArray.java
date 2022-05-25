import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// taking values for n and m from user
		int n = sc.nextInt();
		int m = sc.nextInt();

		// Create 2d array with n*m size
		int array[][] = new int[n][m];

		// store the values into 2D array
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				array[i][j] = sc.nextInt();

			}
		}

		int temp = n;
		int row = 0;
		// start from 1st row print n times
		for (int i = n; i > 0; i--) {

			// for every row
			for (int j = temp; j > 0; j--) {
				// for every column
				for (int col = 0; col < m; col++) {
					// print value
					System.out.print(array[row][col] + " ");
				}
				// print new line after printing row
				System.out.println();
			}
			// decrease the no of time to print
			temp--;
			// increment the row number
			row++;
			// print new lines for seperating the rows
			System.out.println();
			System.out.println();
		}

		sc.close();
	}

}
