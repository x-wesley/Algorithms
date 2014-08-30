package com.auditionoffer.audition11;

public class Pow {	
	public Pow() {
		// TODO Auto-generated constructor stub
	}
	public static double pow (double base, int exponent){
		if(exponent == 0){
			return 1;
		}
		if(exponent == 1){
			return base;
		}
		double res = pow(base, exponent>>1);
		res = res * res;
		if((exponent & 0x1) == 1){
			res = res * base;
		}
		return res;
	}
}
