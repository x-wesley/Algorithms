package com.auditionoffer.audition17;

public class Merge {
	public ListNode merge(ListNode l1, ListNode l2) {
		ListNode res = new ListNode();
		if(l1 == null){
			return l2;
		}
		if(l2 == null){
			return l1;
		}
		if(l1.val > l2.val){
			res.val = l2.val;
			l2 = l2.next;
		}
		if(l1.val < l2.val){
			res.val = l1.val;
			l1 = l1.next;
		}
		res.next = merge(l1, l2);
		return res;
	}
}

class ListNode {
	int val;
	ListNode next;
}