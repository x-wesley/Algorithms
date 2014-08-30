package com.auditionoffer.audition07;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class QueueImplementByTwoStacks2 {
	private Stack<Integer> stack1;
	private Stack<Integer> stack2;

	public QueueImplementByTwoStacks2() {
		// TODO Auto-generated constructor stub
		stack1 = new Stack<Integer>();
		stack2 = new Stack<Integer>();
	}

	public Integer poll() {
		Integer re = null;
		Integer temp = null;
		if(stack1.isEmpty()){
			return re;
		}else{
			while(!stack1.isEmpty()){
				re = stack1.pop();
				stack2.push(re);
			}
			re = stack2.pop();
			while(!stack2.isEmpty()){
				temp = stack2.pop();
				stack1.push(temp);
			}
		}
		return re;
	}

	public Integer offer(int o) {
		stack1.push(o);
		return o;
	}

	public static void main(String[] args) {
		QueueImplementByTwoStacks2 queue = new QueueImplementByTwoStacks2();
		List<Integer> re = new ArrayList<Integer>();
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		re.add(queue.poll());
		queue.offer(4);
		re.add(queue.poll());
		queue.offer(5);
		re.add(queue.poll());
		re.add(queue.poll());
		re.add(queue.poll());
		System.out.println(re.toString());
	}
}
