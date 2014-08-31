package com.auditionoffer.audition34;

public class GetUglyNumber {
	public int getUglyNumber(int n) {
		if (n <= 0) {
			return 0;
		}
		int number = 0;
		int uglyFound = 0;
		while (uglyFound < n) {
			number++;
			if (isUgly(n)) {
				uglyFound++;
			}
		}
		return number;
	}

	private boolean isUgly(int n) {
		// TODO Auto-generated method stub
		while (n % 2 == 0) {
			n /= 2;
		}
		while (n % 3 == 0) {
			n /= 3;
		}
		while (n % 5 == 0) {
			n /= 5;
		}
		return (n == 1) ? true : false;
	}
}
