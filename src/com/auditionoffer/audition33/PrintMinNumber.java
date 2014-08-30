package com.auditionoffer.audition33;

import java.util.Arrays;

public class PrintMinNumber {

	public static int printMinNumber(int[] n) {
		MString s[] = new MString[n.length];
		for (int i = 0; i < n.length; i++) {
			s[i] = new MString(n[i] + "");
		}
		Arrays.sort(s);
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length; i++) {
			sb.append(s[i].toString());
		}
		return Integer.parseInt(sb.toString());
	}

	public static void main(String[] args) {
		int[] n = { 32, 321, 324 };
		System.out.println(printMinNumber(n));
	}
}

class MString implements Comparable<MString> {

	String src;

	public MString(String src) {
		// TODO Auto-generated constructor stub
		this.src = src;
	}

	@Override
	public String toString() {
		return src;
	}

	@Override
	public int compareTo(MString paramT) {
		String s1 = this.src + paramT.src;
		String s2 = paramT.src + this.src;
		if (s1.compareTo(s2) == 0) {
			return 0;
		} else if (s1.compareTo(s2) > 0) {
			return 1;
		} else
			return -1;
	}
}