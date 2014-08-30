package com.auditionoffer.audition32;
//不会
public class NumberOf1Between1AndN {
	public static int fun2(int N) {
		int count = 0; // 记录次数
		int iFactor = 1; // 当前位数
		int iLowerNum = 0; // 低位
		int iCurrNum = 0; // 当前位上的数字
		int iHigherNum = 0; // 更高位

		while (N / iFactor != 0) {
			iLowerNum = N - (N / iFactor) * iFactor;
			iCurrNum = (N / iFactor) % 10;
			iHigherNum = N / (iFactor * 10);

			switch (iCurrNum) {
			case 0:
				count += iHigherNum * iFactor;
				break;
			case 1:
				count += iHigherNum * iFactor + iLowerNum + 1;
				break;
			default:
				count += (iHigherNum + 1) * iFactor;
				break;
			}

			iFactor *= 10;
		}
		return count;
	}
}
