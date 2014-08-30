package com.auditionoffer.audition15;

public class LinkNumK {
	public LinkNumK() {
		// TODO Auto-generated constructor stub
	}
	public static ListNode printK(ListNode head, int k) {
		if (head == null || k == 0) {
			return null;
		}
		ListNode pHead = head;
		ListNode pBehind = null;
		for (int i = 0; i < k - 1; i++) {
			if(pHead.next !=null){
				pHead = pHead.next;
			}else{
				return null;
			}
		}
		pBehind = head;
		while(pHead.next != null){
			pHead = pHead.next;
			pBehind = pBehind.next;
		}
		return pBehind;
	}
}

class ListNode {
	int val;
	ListNode next;
}
