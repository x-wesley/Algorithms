package com.auditionoffer.audition07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class StackImplementByTwoQueues {
	private LinkedList<Integer> queue1;
	private LinkedList<Integer> queue2;

	public StackImplementByTwoQueues() {
		// TODO Auto-generated constructor stub
		queue1 = new LinkedList<Integer>();
		queue2 = new LinkedList<Integer>();
	}

	public Integer pop() {
		Integer re = null;
		if (queue1.size() == 0 && queue2.size() == 0) {
			return null;
		}
		if (queue2.size() == 0) {
			while (queue1.size() > 0) {
				re = queue1.removeFirst();
				if (queue1.size() != 0) {// do not add the last element of
											// queue1 to queue2
					queue2.addLast(re);
				}
			}
		} else if (queue1.size() == 0) {
			while (queue2.size() > 0) {
				re = queue2.removeFirst();
				if (queue2.size() != 0) {// do not add the last element of
											// queue2 to queue1
					queue1.addLast(re);
				}
			}
		}
		return re;
	}

	public Integer push(Integer o) {
		if (queue1.size() == 0 && queue2.size() == 0) {
			queue1.addLast(o);// queue2.addLast(o); is also ok
		}
		if (queue1.size() != 0) {
			queue1.addLast(o);
		} else if (queue2.size() != 0) {
			queue2.addLast(o);
		}
		return o;
	}

	public static void main(String[] args) {
		StackImplementByTwoQueues stack = new StackImplementByTwoQueues();
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
