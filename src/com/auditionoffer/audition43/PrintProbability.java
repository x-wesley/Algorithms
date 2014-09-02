package com.auditionoffer.audition43;

/*有k-1个骰子时，再增加一个骰子，这个骰子的点数只可能为1、2、3、4、5或6。那k个骰子得到点数和为n的情况有： 
 (k-1,n-1)：第k个骰子投了点数1 
 (k-1,n-2)：第k个骰子投了点数2 
 (k-1,n-3)：第k个骰子投了点数3 
 .... 
 (k-1,n-6)：第k个骰子投了点数6 
 在k-1个骰子的基础上，再增加一个骰子出现点数和为n的结果只有这6种情况！ 
 所以：f(k,n)=f(k-1,n-1)+f(k-1,n-2)+f(k-1,n-3)+f(k-1,n-4)+f(k-1,n-5)+f(k-1,n-6) 
 初始化：有1个骰子，f(1,1)=f(1,2)=f(1,3)=f(1,4)=f(1,5)=f(1,6)=1。 */
public class PrintProbability {
	public static void main(String[] args) {
		printProbability(2);
	}
	static void printProbability(int number) {
		if (number < 1) {
			return;
		}
		int MAX = 6;
		double total = Math.pow(MAX, number);
		int maxSum = number * MAX;
		double[][] f = new double[number + 1][number * MAX + 1];
		for (int i = 1; i <= MAX; i++) {
			f[1][i] = 1;
		}
		for (int k = 2; k <= number; k++) {
			for (int sum = number; sum <= maxSum; sum++) {
				for (int i = 1; sum - i >= 1 && i <= MAX; i++) {
					f[k][sum] += f[k - 1][sum - i];
				}
			}
		}
		for (int sum = number; sum <= maxSum; sum++) {
			System.out.println(sum + "," + f[number][sum] / total);
		}
	}
}
