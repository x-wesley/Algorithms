package com.auditionoffer.audition28;

import java.util.ArrayList;
import java.util.Random;

public class Permutation {
	public static void main(String[] args) {
		String str = "12345";
		//permutation(str.toCharArray(), 0);
		System.out.println(permute(str.toCharArray()).toString());
	}
	public static void permutation(char[] str, int i) {
        if (i >= str.length)
            return;
        if (i == str.length - 1) {
            System.out.println(String.valueOf(str));
        } else {
            for (int j = i; j < str.length; j++) {
                char temp = str[j];
                str[j] = str[i];
                str[i] = temp;

                permutation(str, i + 1);

                temp = str[j];
                str[j] = str[i];
                str[i] = temp;
            }
        }
    }
	
	public static ArrayList<ArrayList<Character>> permute(char[] num) {
		ArrayList<ArrayList<Character>> arrlist = new ArrayList<>();
		int r = num.length;
		for(int i= num.length - 1; i >= 1; i--){
			r*=i;
		}
		while(arrlist.size() != r){
			ArrayList<Character> a = new ArrayList<>();
			Random ran=new Random();
			while(a.size() != num.length){
				int z = ran.nextInt(num.length);
				if(!a.contains(num[z])){
					a.add(num[z]);
				}
			}
			if(!arrlist.contains(a)){
				arrlist.add(a);
			}
		}
    	return arrlist;
    }
}
