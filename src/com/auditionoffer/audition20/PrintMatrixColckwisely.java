package com.auditionoffer.audition20;

public class PrintMatrixColckwisely {
	public PrintMatrixColckwisely() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[][] numbers = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		printMatrixColckwisely(numbers);
	}

	public static void printMatrixColckwisely(int[][] numbers) {

		if (numbers == null) {
			return;
		}
		int startX = 0;
		int startY = 0;
		int endY = numbers[0].length - 1;
		int endX = numbers.length - 1;

		while ((startX <= endX) && (startY <= endY)) {
			printCircle(numbers, startX, startY, endX, endY);
			startX++;
			startY++;
			endX--;
			endY--;
		}

	}

	private static void printCircle(int[][] numbers, int startX, int startY, int endX,
			int endY) {
		// TODO Auto-generated method stub
		if (startY == endY) {
			for (int i = startX; i <= endX; i++) {
				System.out.println(numbers[i][endY]);
			}
			return;
		}

		if (startX == endX) {
			for (int i = startY; i <= endY; i++) {
				System.out.println(numbers[startX][i]);
			}
			return;
		}
		for (int i = startY; i < endY; i++) {
			System.out.println(numbers[startX][i]);
		}
		for (int i = startX; i < endX; i++) {
			System.out.println(numbers[i][endY]);
		}
		for (int i = endY; i > startY; i--) {
			System.out.println(numbers[endX][i]);
		}
		for (int i = endX; i > startX; i--) {
			System.out.println(numbers[i][startY]);
		}
	}
}
