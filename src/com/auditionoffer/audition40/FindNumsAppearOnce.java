package com.auditionoffer.audition40;

public class FindNumsAppearOnce {
	public void findNumsAppearOnce(int[] nums) {
		int result = 0;
		for (int i = 1; i < nums.length; i++) {
			result = result ^ nums[i];
		}
		// 找出这两个数的第一个相异位置
		int count = 1;
		int i = 1;
		while (true) {
			if ((result & i) == 1) {
				break;
			}
			result = result >> 1;
			count = count << 1;
		}
		// 按照这个位置把数组分成两组
		int num1 = 0;
		int num2 = 0;
		for (int j = 0; j < nums.length; j++) {
			if ((nums[j] & count) == 0) {
				num1 ^= nums[j];
			} else {
				num2 ^= nums[j];
			}
		}
		System.out.println(num1 + "----" + num2);
	}
}
