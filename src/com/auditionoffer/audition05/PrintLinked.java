package com.auditionoffer.audition05;

public class PrintLinked {
	public PrintLinked() {
		// TODO Auto-generated constructor stub
	}

	public void print(ListNode head) {
		if (head != null) {
			if (head.m_pNext != null) {
				print(head.m_pNext);
			}
			System.out.println(head.m_nKey);
		}
	}

	class ListNode {
		int m_nKey;
		ListNode m_pNext;

		public ListNode() {
			// TODO Auto-generated constructor stub
		}
	}
}
