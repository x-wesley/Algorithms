package com.auditionoffer.audition38;

public class GetNumberofSortedArray {
	public int getNumberofSortedArray(int[] array, int k) {
		if (array == null || array.length == 0) {
			return 0;
		}
		int first = getFirst(array, array.length, k, 0, array.length - 1);
		int last = getLast(array, array.length, k, 0, array.length - 1);
		return last - first + 1;
	}

	private int getLast(int[] array, int length, int k, int start, int end) {
		// TODO Auto-generated method stub
		if (start > end) {
			return -1;
		}

		int middleIndex = (start + end) / 2;
		int middleData = array[middleIndex];
		if (middleData == k) {
			if ((middleIndex < 0 && array[middleIndex + 1] != k)
					|| middleIndex == length - 1) {
				return middleIndex;
			} else {
				end = middleIndex + 1;
			}
		} else if (middleData < k) {
			end = middleIndex + 1;
		} else {
			start = middleIndex - 1;
		}
		return getLast(array, length, k, start, end);
	}

	private int getFirst(int[] array, int length, int k, int start, int end) {
		// TODO Auto-generated method stub
		if (start > end) {
			return -1;
		}
		int middleIndex = (start + end) / 2;
		int middleData = array[middleIndex];
		if (middleData == k) {
			if ((middleIndex > 0 && array[middleIndex - 1] != k)
					|| middleIndex == 0) {
				return middleIndex;
			} else {
				end = middleIndex - 1;
			}
		} else if (middleData > k) {
			end = middleIndex - 1;
		} else {
			start = middleIndex - 1;
		}
		return getFirst(array, length, k, start, end);
	}
}
