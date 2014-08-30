package com.auditionoffer.audition24;

import java.util.Arrays;

public class VerigySquenceOfBST {

	static boolean ifIsPostOrderSerachTree(int[] array, int start, int end) { // 从start到end-1
		if (array == null || start > end)
			return false;
		if (start == end) // 序列中只有一个数
			return true;
		int root = array[end - 1];
		int i = start;
		while (array[i] < root && i < end - 1)
			// 找到第一个大于根的数的位置position
			i++;
		int position = i;
		while (i < end - 1) {
			if (array[i] < root) { // 如果在position后还有小于根的数，则不是二叉查找树
				return false;
			}
			i++;
		}
		// 若左右子树有一个不为二叉查找树，则当前序列不满足条件
		boolean left = true;
		left = ifIsPostOrderSerachTree(array, start, position);
		boolean right = true;
		right = ifIsPostOrderSerachTree(array, position, end - 1);
		return (left && right);

	}

	public static void main(String[] args) {
		int[] a = { 5, 7, 6, 9, 11, 10, 8 };
		System.out.println(ifIsPostOrderSerachTree(a, 0, a.length));
		int[] b = { 7, 4, 6, 5 };
		System.out.println(ifIsPostOrderSerachTree(b, 0, b.length));

	}

}
