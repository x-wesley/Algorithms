package com.auditionoffer.audition09;

public class Fibonacci {
	public Fibonacci() {
		// TODO Auto-generated constructor stub
	}
	
	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);

	}
	
	public static long fibonacci1(int n){
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		int first = 0;
		int second = 1;
		int res = 0;
		for(int i = 2; i <= n ;i++){
			res = first + second;
			first = second;
			second = res;
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(fibonacci(30));
		System.out.println(fibonacci1(30));
	}
}
