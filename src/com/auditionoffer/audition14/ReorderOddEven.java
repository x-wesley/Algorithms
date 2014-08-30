package com.auditionoffer.audition14;

public class ReorderOddEven {
	public ReorderOddEven() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[] data = { 4, 2, 3, 5, 6, 7, 8 };
		reorder(data);
	}

	public static void reorder(int[] data) {
		int low = 0;
		int high = data.length - 1;
		int temp;
		while (low < high) {
			while ((low < high) && (data[low] & 1) == 1) {
				low++;
			}
			while ((low < high) && ((data[high] & 1) == 0)) {
				high--;
			}
			if (low < high) {
				data[low] ^= data[high];
				data[high] ^= data[low];
				data[low] ^= data[high];
			}
		}
		for (int i : data) {
			System.out.println(i);
		}
	}
}
