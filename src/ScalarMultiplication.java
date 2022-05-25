import java.util.Scanner;

public class ScalarMultiplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice;// to take choice for array/matrix multiplication
		while (true) {

			/*
			 * display message to user and ask to select one choice 1 for scalar
			 * multiplication of array 2 for scalar multipliation of matrix repeatedly ask
			 * for choice in case of user enter invalid choice
			 */
			System.out.println("1.Scalar Multiplication Of Array: ");
			System.out.println("2.Scalar Multiplication Of Matrix: ");

			System.out.print("Enter Your Choice: ");
			choice = sc.nextInt();
			// if user choose 1 or 2 then stop asking for choice
			if (choice == 1 || choice == 2) {
				break;
			} else {// otherwise show invalid choice message and ask again
				System.out.println("\nInvalid Choice.. Please choose correct choice");
			}
		}

		// if user choose 1 that is scalar multiplication of array
		if (choice == 1) {
			// ask user to enter length of array
			System.out.print("\nEnter Length Of Array: ");
			// take input for length from user
			int n = sc.nextInt();
			// create array with given length
			int array[] = new int[n];

			// ask user to enter elements into array
			for (int i = 0; i < n; i++) {
				System.out.print("Enter element " + (i + 1) + " : ");
				array[i] = sc.nextInt();
			}

			// ask user to enter scalar value for multiplication
			System.out.print("Enter Scalar Value: ");
			int scalar = sc.nextInt();

			// print original array
			System.out.println("Original Array: ");
			for (int i = 0; i < n; i++) {
				System.out.print(array[i] + " ");
			}

			// call method scalarM by passing array and scalar value store results in array
			array = scalarM(array, scalar);

			// print the array after multiplication
			System.out.printf("\nArray after multiplied with %d : \n", scalar);
			for (int i = 0; i < n; i++) {
				System.out.print(array[i] + " ");
			}
		}

		// if user choose 2 that is for scalar multiplication of matrix
		else if (choice == 2) {
			// ask user to enter rows of matrix
			System.out.print("\nEnter No Of Rows: ");
			int rows = sc.nextInt();
			// ask user to enter columns of matrix
			System.out.print("Enter No Of Columns: ");
			int columns = sc.nextInt();

			// create matrix with given rows and columns
			int matrix[][] = new int[rows][columns];

			// take elements from user into matrix
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					System.out.printf("Enter element for row %d column %d : ", i + 1, j + 1);
					matrix[i][j] = sc.nextInt();
				}
			}

			// Ask user to enter scalar for multiplication of matrix
			System.out.print("Enter Scalar: ");
			int scalar = sc.nextInt();

			// print original array
			System.out.println("Original Matrix: ");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {

					System.out.print(matrix[i][j] + "\t");
				}
				System.out.println();
			}

			// call method scalarM by passing matrix and scalar and store results in matrix
			matrix = scalarM(matrix, scalar);

			// print matrix after multiplication
			System.out.printf("Matrix after multiplied with %d : \n", scalar);
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {

					System.out.print(matrix[i][j] + "\t");
				}
				System.out.println();
			}
		}

		sc.close();
	}

	// Method to scalar multiplication of array
	public static int[] scalarM(int[] array, int scalar) {

		// for all elements in array multiply with scalar and store back to array
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] * scalar;
		}

		// return resulted array
		return array;
	}

	// method to scalar multiplication of matrix
	public static int[][] scalarM(int[][] matrix, int scalar) {

		// for each row in matrix
		for (int i = 0; i < matrix.length; i++) {
			// for each column in matrix
			for (int j = 0; j < matrix[i].length; j++) {
				// multiply element at ith row jth column with scalar and store
				matrix[i][j] = matrix[i][j] * scalar;
			}
		}
		// return resulted matrix
		return matrix;
	}

}
