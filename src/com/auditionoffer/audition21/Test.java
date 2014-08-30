package com.auditionoffer.audition21;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackWithMin<Integer> newStack = new StackWithMin<Integer>();
		newStack.push(4);
		newStack.push(6);
		newStack.push(2);
		newStack.push(5);
		newStack.pop();
		newStack.pop();
		newStack.push(1);
		System.out.println(newStack.min());

	}

}
