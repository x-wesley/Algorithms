package com.auditionoffer.audition30;

import java.util.Random;
import java.util.TreeSet;

public class GetLeastNumbers {
	public static void main(String[] args) {
		int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
				17, 18, 19, 21, 22, 23, 24, 25, 26, 27, 28, 29 };
		TreeSet<Integer> leastNumbers = new TreeSet<Integer>();
/*		Random r = new Random();
		for (int i = 0; i < 500; i++) {
			int a = r.nextInt(500);
			leastNumbers.add(i);
		}
		System.out.println(leastNumbers.toString());
		System.out.println(leastNumbers.size());*/
		getLeastNumbers(data, leastNumbers, 5);
	}

	public static void getLeastNumbers(int[] data,
			TreeSet<Integer> leastNumbers, int k) {
		leastNumbers.clear();
		if (k < 1 || data.length < k)
			return;

		for (int i = 0; i < data.length; i++) {
			if (leastNumbers.size() < k)
				leastNumbers.add(data[i]);
			else {
				// System.out.println(leastNumbers.last().hashCode());
				if (data[i] < leastNumbers.last()) {

					leastNumbers.remove(leastNumbers.last());
					leastNumbers.add(data[i]);
				}
			}
		}
		System.out.println(leastNumbers.toString());
	}
}
