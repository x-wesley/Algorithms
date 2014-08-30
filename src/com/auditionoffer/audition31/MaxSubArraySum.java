package com.auditionoffer.audition31;

public class MaxSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, -2, 3, 10, -4, 7, 2, -5 };
		System.out.println("Max sum: " + MaxSubArraySum.getMax(array));
	}

	private static int getMax(int[] array) {
		// TODO Auto-generated method stub
		if (array == null || array.length <= 0) {
			return 0;
		}

		int maxSum = array[0]; // 所有子数组中最大的和
		int righteEdge = array[0]; // 右侧子数组的最大和
		for (int i = 1; i < array.length; i++) {
			// 当右侧子数组的最大和为负数时，对于新数组，右侧子数组的最大和为新增加的数。
			if (righteEdge < 0) {
				righteEdge = array[i];
			} else { // 为正数时，对于新数组，右侧子数组的最大和为新增加的数 + 原来的最大和。
				righteEdge += array[i];
			}
			// 所有子数组中最大的和
			maxSum = righteEdge > maxSum ? righteEdge : maxSum;
		}
		return maxSum;
	}

}
