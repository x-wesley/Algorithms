package com.auditionoffer.audition22;

import java.util.Stack;

public class IsPopOrder {
	public IsPopOrder() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[] in = { 1, 2, 3, 4, 5 };
		int[] out = { 4, 3, 5, 1, 2 };
		System.out.println(valid(in, out));
	}

	private static boolean valid(int[] input, int[] out) {
		Stack<Integer> stack = new Stack<Integer>();
		int i = 0, o = 0;
		while (true) {
			if (i >= input.length && o >= out.length && stack.isEmpty()) {
				return true;
			}

			if (i < input.length) {
				stack.push(input[i]);
				i++;
				while (!stack.isEmpty() && stack.peek() == out[o]) { // 不停地检查看是否有机会弹栈
					stack.pop();
					o++;
				}
			} else {
				if (o < out.length) {
					if (stack.peek() != out[o]) {
						return false;
					}
					if (stack.isEmpty()) {
						return false;
					}
					if (stack.peek() == out[o]) {
						stack.pop();
						o++;
					}
				}
			}
		}
	}
}
