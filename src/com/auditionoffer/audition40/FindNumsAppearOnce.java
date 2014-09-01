package com.auditionoffer.audition40;

/*我们还是从头到尾依次异或数组中的每一个数字，那么最终得到的结果就是两个只出现一次的数字的异或结果。
 * 因为其他数字都出现了两次，在异或中全部抵消掉了。由于这两个数字肯定不一样，那么这个异或结果肯定不为0，
 * 也就是说在这个结果数字的二进制表示中至少就有一位为1。我们在结果数字中找到第一个为1的位的位置，记为第N位。
 * 现在我们以第N位是不是1为标准把原数组中的数字分成两个子数组，第一个子数组中每个数字的第N位都为1，
 * 而第二个子数组的每个数字的第N位都为0。(这两个数字不同，意味着为1的那个位是相异的)  */

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
