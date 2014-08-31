package com.auditionoffer.audition35;

import java.util.Arrays;

public class FirstNotRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String s = "xabb";
		String s = "gabaccdeff";
		//
		char c = firstNotRepeatingChar(s);
		System.out.println(c);
	}

	public static char firstNotRepeatingChar(String str) {
		if (str == null) {
			return ' ';
		}
		int[] hash = new int[256];

		// 初始化hash数组
		Arrays.fill(hash, 0);

		for (int i = 0; i < str.length(); i++) {
			hash[str.charAt(i)]++;
		}

		for (int i = 0; i < str.length(); i++) {
			if (hash[str.charAt(i)] == 1)
				return str.charAt(i);
		}

		return ' ';
	}
}
