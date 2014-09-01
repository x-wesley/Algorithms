package com.auditionoffer.audition36;

public class InversePairs {
	public int inversePairs(int[] data) {
		if (data == null || data.length < 0) {
			return 0;
		}
		int[] copy = new int[data.length];
		for (int i = 0; i < data.length; i++) {
			copy[0] = data[0];
		}

		int count = inversaPairsCore(data, copy, 0, data.length - 1);
		return 0;
	}

	private int inversaPairsCore(int[] data, int[] copy, int start, int end) {
		// TODO Auto-generated method stub
		if (start == end) {
			copy[start] = data[start];
		}
		int length = (end - start) / 2;
		int left = inversaPairsCore(copy, data, start, start + length);
		int right = inversaPairsCore(copy, data, start + length + 1, end);

		int i = start + length;
		int j = end;
		int indexCopy = end;
		int count = 0;
		while (i >= start && j >= start + length + 1) {
			if (data[i] > data[j]) {
				copy[indexCopy--] = data[i--];
				count += j - start - length;
			} else {
				copy[indexCopy--] = data[j--];
			}
		}
		for (; i >= start; i--) {
			copy[indexCopy--] = data[i];
		}
		for (; j >= start + length + 1; j--) {
			copy[indexCopy--] = data[j];
		}
		return left + right + count;
	}
}
