package com.auditionoffer.audition10;

public class NumOfOne {
	public static void main(String[] args) {
		System.out.println(getNum(88888));
	}
	public static int getNum(int n) {
		int num = 0;
		for(int i = n; i/1 != 0; i = i>>1){
			if((i&1) == 1){
				num++;
			}
		}
		return num;
	}
}
