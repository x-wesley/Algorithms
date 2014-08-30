package com.algorithms.sort;

import java.util.Arrays;

public class QuickSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sort = new int[] { 1, 0, 10, 20, 3, 5, 6, 4, 9, 8, 12, 17, 34, 11 };
		quickSort(sort, 0, sort.length - 1);
		System.out.println(Arrays.toString(sort));
	}

	static void quickSort(int[] s, int low, int high) {
		int mid;
		int i, j;
		if (low < high) {
			i = low;
			j = high;
			mid = s[i];
			while (i < j) {
				while (i < j && s[j] > mid) {
					j--;
				}
				if (i < j) {
					s[i] = s[j];
					i++;
				}
				while (i < j && s[i] < mid) {
					i++;
				}
				if (i < j) {
					s[j] = s[i];
					j--;
				}
			}
			s[i] = mid;
			quickSort(s, low, i - 1);
			quickSort(s, j + 1, high);
		}
	}
}
