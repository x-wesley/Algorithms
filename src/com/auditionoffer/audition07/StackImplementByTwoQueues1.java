package com.auditionoffer.audition07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class StackImplementByTwoQueues1 {
	private LinkedList<Integer> queue1;
	private LinkedList<Integer> queue2;

	public StackImplementByTwoQueues1() {
		// TODO Auto-generated constructor stub
		queue1 = new LinkedList<Integer>();
		queue2 = new LinkedList<Integer>();
	}

	public Integer pop() {
		Integer re = null;
		Integer temp = null;
		if(queue1.isEmpty()){
			return re;
		}else{
			while(queue1.size() > 1){
				temp = queue1.getFirst();
				queue2.addLast(temp);
				queue1.removeFirst();
			}
			re = queue1.getFirst();
			queue1.removeFirst();
			while(queue2.size() != 0){
				temp = queue2.getFirst();
				queue1.addLast(temp);
				queue2.removeFirst();
			}
		}
		return re;
	}

	public Integer push(Integer o) {
		queue1.addLast(o);
		return o;
	}

	public static void main(String[] args) {
		StackImplementByTwoQueues1 stack = new StackImplementByTwoQueues1();
		int tmp = 0;
		stack.push(1);
		stack.push(2);
		stack.push(3);
		tmp = stack.pop();
		System.out.println(tmp);// 3
		stack.push(4);
		tmp = stack.pop();
		System.out.println(tmp);// 4
		tmp = stack.pop();
		System.out.println(tmp);// 2
		stack.push(5);
		stack.push(6);
		tmp = stack.pop();
		System.out.println(tmp);// 6
		tmp = stack.pop();
		System.out.println(tmp);// 5
		tmp = stack.pop();
		System.out.println(tmp);// 1
	}
}
