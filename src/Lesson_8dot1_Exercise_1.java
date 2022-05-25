
public class Lesson_8dot1_Exercise_1 {

	/**
	 * Write a method public static int max(int[][] a) that returns the maximum
	 * value in the 2d parameter array a.
	 */
	public static int max(int[][] a) {

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				max = Math.max(a[i][j], max);
			}
		}
		return max;

	}

	/**
	 * Write a method public static int rowSum(int[][] a, int x) that returns the
	 * sum of the elements in Row x of a.
	 */

	public static int rowSum(int[][] a, int x) {
		int sum = 0;
		for (int i = 0; i < a[x].length; i++) {
			sum += a[x][i];
		}
		return sum;
	}

	/**
	 * Write a method public static int columnSum(int[][] a, int x) that returns the
	 * sum of the elements in Column x of a
	 */

	public static int columnSum(int[][] a, int x) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i][x];
		}
		return sum;
	}

	/**
	 * Write a method public static int[] allRowSums(int[][] a) that calculates the
	 * row sum for every row and returns each of the values in an array. Index i of
	 * the return array contains the sum of elements in row i.
	 */

	public static int[] allRowSums(int[][] a) {
		int result[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = 0; j < a[i].length; j++) {
				sum += a[i][j];
			}
			result[i] = sum;
		}
		return result;
	}

	/**
	 * Write a method public static boolean isRowMagic(int[][] a) that checks if the
	 * array is row-magic (this means that every row has the same row sum).
	 */
	public static boolean isRowMagic(int[][] a) {
		int result[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = 0; j < a[i].length; j++) {
				sum += a[i][j];
			}
			result[i] = sum;
		}

		for (int i = 1; i < result.length; i++) {
			if (result[i] != result[i - 1]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Write a method public static boolean isColumnMagic(int[][] a) that checks if
	 * the array is column-magic (this means that every column has the same column
	 * sum).
	 */
	public static boolean isColumnMagic(int[][] a) {
		int colSum[] = new int[a[0].length];
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = 0; j < a[i].length; j++) {
				sum += a[j][i];
			}
			colSum[i] = sum;
		}

		for (int i = 1; i < colSum.length; i++) {
			if (colSum[i] != colSum[i - 1]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Write a method public static boolean isSquare(int[][] a) that checks if the
	 * array is square (i.e. every row has the same length as a itself).
	 */
	public static boolean isSquare(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			if (a.length != a[i].length) {
				return false;
			}
		}
		return false;
	}

	/**
	 * Write a method public static boolean isMagic(int[][] a) that checks if the
	 * array is a magic square. This means that it must be square, and that all row
	 * sums, all column sums, and the two diagonal-sums must all be equal.
	 */
	public static boolean isMagic(int[][] a) {

		int leftRightSum = 0, rightLeftSum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				// Check for main diagonal element.
				if (i == j) {
					leftRightSum += a[i][j];
				}

				// Check for secondary diagonal element.
				if (i + j == a.length - 1) {
					rightLeftSum += a[i][j];
				}

			}
		}
		return isSquare(a) && isRowMagic(a) && isColumnMagic(a) && (rightLeftSum == leftRightSum);

	}

	/**
	 * that checks to see if the array is square (suppose it is n x n), and contains
	 * each of the digits from 1 to n*n, eg. 1, 2, ..., 16 for a 4 x 4 array.
	 */
	public static boolean isSequence(int[][] a) {

		int sequence = 1;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (sequence != a[i][j]) {
					return false;
				}
				sequence++;
			}
		}
		return true;
	}

	/**
	 * return a square symmetric matrix with random numbers from -MaxElementto
	 * MaxElement.
	 * 
	 * @return
	 */
	public static int[][] getSymmetricMatrix(int matrixSize, int maxElement) {
		int[][] symmetricMatrix;
		symmetricMatrix = new int[matrixSize][matrixSize];
		for (int i = 0; i < matrixSize; i++) {
			for (int j = 0; j < matrixSize; j++) {
				symmetricMatrix[i][j] = (int) ((Math.random() * (maxElement - (-1 * maxElement))) + (-1 * maxElement));
			}
		}
		return symmetricMatrix;
	}

	/**
	 * returns a string representation of the array to be printed to the console.
	 * Each town in the array must be printed in a separate line.
	 */
	public static String toString(int[][] a) {
		String printThis = "";

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				printThis += a[i][j] + " ";
			}
			printThis += "\n";
		}
		return printThis;
	}

}
