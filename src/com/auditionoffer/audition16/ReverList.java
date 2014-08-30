package com.auditionoffer.audition16;

public class ReverList {
	public ReverList() {
		// TODO Auto-generated constructor stub
	}
	public ListNode rev(ListNode head){
		ListNode revHead = null;
		ListNode node = head;
		ListNode prev = null;
		while(node != null){
			ListNode next = node.next;
			if(next == null){
				revHead = node;
			}
			node.next = prev;
			prev = node;
			node = next;
		}
		return head;
	}
}

class ListNode{
	int val;
	ListNode next;
}
