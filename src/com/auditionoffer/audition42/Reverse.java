package com.auditionoffer.audition42;

public class Reverse {
	public String reverse(String str){
		String[] strs = str.split(" ");
		StringBuffer sb = new StringBuffer();
		for(int i = strs.length - 1; i>=0;i--){
			sb.append(strs[i]);
		}
		return sb.toString();
	}
}
