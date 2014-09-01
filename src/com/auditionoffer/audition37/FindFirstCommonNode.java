package com.auditionoffer.audition37;

import java.util.Stack;

public class FindFirstCommonNode {
	public ListNode findFirstCommonNode(ListNode list1, ListNode list2) {
		Stack<ListNode> stack1 = new Stack<ListNode>();
		Stack<ListNode> stack2 = new Stack<ListNode>();
		if(list1 == list2){
			return list1;
		}
		while (list1.next != null) {
			stack1.push(list1);
			list1 = list1.next;
		}
		while (list2.next != null) {
			stack2.push(list2);
			list2 = list2.next;
		}
		if (stack1.peek() != stack2.peek()) {
			return null;
		}
		while (!stack1.empty() && !stack2.empty()) {
			ListNode temp1 = stack1.pop();
			ListNode temp2 = stack2.pop();
			if (temp1 != temp2) {
				break;
			}
		}
		if (stack1.empty()) {
			return stack2.pop().next;
		} else if (stack2.empty()) {
			return stack1.pop().next;
		} else {
			return stack1.pop().next;
		}
	}
}

class ListNode {
	int val;
	ListNode next;
}