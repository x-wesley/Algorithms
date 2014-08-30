package com.auditionoffer.audition29;

public class MoreThanHalfNum {
	public int moreThanHalfNum(int[] num) {
		if (null == num || num.length == 0) {
			return -1;
		}
		int k = 0, j = 0;
		for (int i = 0; i < num.length; i++) {
			if (j == 0) {
				k = num[i];
			}
			if (k == num[i]) {
				++j;// 有人说++j比j++有先天的优势，不知你是否听说，如果你也听说，有没有想过More Effective
					// C++(C++程序员必看书籍)
			} else {
				--j;
			}
		}
		return k;
	}
}
