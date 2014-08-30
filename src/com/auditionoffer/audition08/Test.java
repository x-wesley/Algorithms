package com.auditionoffer.audition08;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int low = 0;
		int high = 0;
		for(;high != 10;high++){
			System.out.println("low: " + low + " high: " + high );
			System.out.println((low&high)+(low^high)/2);
			System.out.println();
		}
		
	}

}
