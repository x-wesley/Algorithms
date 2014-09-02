package com.auditionoffer.audition41;

public class FindNumbersWithSum {

	/* 和为s的两个数字 */
	public boolean findNumbersWithSum(int[] nums, int sum) {
		boolean found = false;
		int num1, num2;
		if (nums.length < 1) {
			return found;
		}
		int head = nums.length - 1;
		int behind = 0;
		while (head > behind) {
			long curSum = nums[head] + nums[behind];
			if (curSum == sum) {
				num1 = nums[behind];
				num2 = nums[head];
				found = true;
				break;
			} else if (curSum > sum) {
				head--;
			} else {
				behind++;
			}
		}
		return found;
	}
	/* 和为s的连续整数序列 */
	public void findContinuousSequence(int sum){
		if(sum < 3){
			return;
		}
		int small = 1;
		int big = 2;
		int middle = (1+sum)/2;
		int curSum = small + big;
		while(small < middle){
			if(curSum==sum){
				pringContinuousSequence(small, big);
			}
			while(curSum > sum && small < middle){
				curSum -= small;
				small++;
				if(curSum == sum){
					pringContinuousSequence(small, big);
				}
			}
			big++;
			curSum+=big;
		}
	}
	private void pringContinuousSequence(int small, int big) {
		// TODO Auto-generated method stub
		for(int i = small;i<=big;i++){
			System.out.println(i);
		}
	}
}
