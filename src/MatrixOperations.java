
public class MatrixOperations {

	/**
	 * @param m1
	 * @param m2 eturns a matrix which is the sum of matrix m1 and matrix m2.
	 *  m1 and m2 have the same dimensions.
	 */
	public static double[][] matrixAdd(double m1[][], double m2[][]) {

		// create result matrix with given matrices dimensions
		double[][] result = new double[m1.length][m1[0].length];

		// look for all rows
		for (int i = 0; i < m1.length; i++) {
			// for all columns
			for (int j = 0; j < m1[i].length; j++) {

				// add the values at ith row and jth column and store in result
				result[i][j] = m1[i][j] + m2[i][j];
			}
		}
		// return result
		return result;
	}

	/**
	 * @param m1
	 * @returns the sum of the elements on the first diagonal of matrix m1. 
	 * Consider the matrix m1 to be square.
	 */
	public static double matrixDiagSum(double m1[][]) {

		// to hold the sum of diagonal elements
		double result = 0;

		// getting the size of square matrix
		int n = m1.length;

		// for each row
		for (int i = 0; i < n; i++) {

			// for each column
			for (int j = 0; j < n; j++) {

				// if it is diagonal element
				if (i == j)
					// add the value to result
					result += m1[i][j];
			}
		}
		// return result as sum of diagonal elements of m1
		return result;
	}

}
