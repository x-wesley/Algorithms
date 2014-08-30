package com.auditionoffer.audition03;

public class Find {
	private static boolean found = false;

	public boolean find(int[][] matrix, int num) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return false;
		} else {
			findMatrixNumber(matrix, matrix.length, 0, matrix[0].length, num);

		}
		return found;
	}

	private void findMatrixNumber(int matrix[][], int rows, int row,
			int columns, int number) {
		// TODO Auto-generated method stub
		if (row > rows - 1)
			return;
		int cornerNumber = matrix[row][columns - 1];
		if (cornerNumber == number) {
			found = true;
			return;
		} else if (cornerNumber < number) {
			findMatrixNumber(matrix, rows, ++row, columns, number);
		} else if (cornerNumber > number) {
			findMatrixNumber(matrix, rows, row, --columns, number);
		}
	}
}
