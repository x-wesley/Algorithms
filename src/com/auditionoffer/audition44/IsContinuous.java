package com.auditionoffer.audition44;

import java.util.Arrays;

public class IsContinuous {
	public boolean isContinuous(int[] numbers) {
		if (numbers == null || numbers.length < 1) {
			return false;
		}
		Arrays.sort(numbers);
		int numberOfZero = 0;
		int numberOfGap = 0;
		for (int i = 0; i < numbers.length && numbers[i] == 0; i++) {
			numberOfZero++;
		}
		int small = numberOfZero;
		int big = small + 1;
		while (big < numbers.length) {
			if (numbers[small] == numbers[big]) {
				return false;
			}
			numberOfGap += numbers[big] - numbers[small] - 1;
			small = big;
			big++;
		}
		return (numberOfGap > numberOfZero) ? false : true;

	}
}
