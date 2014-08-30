package com.auditionoffer.audition13;

public class ListDel {
	public void del(ListNode head, ListNode toDel) {
		if (head == null || toDel == null) {
			return;
		}
		if (toDel.m_pNext != null) {
			if(toDel.m_pNext.m_pNext == null){
				toDel.m_nValue = toDel.m_pNext.m_nValue;
				toDel.m_pNext = null;
			}else{
				toDel.m_nValue = toDel.m_pNext.m_nValue;
				toDel.m_pNext = toDel.m_pNext.m_pNext;
			}
		}else if(head == toDel){
			head = null;
		}else{
			toDel = null;
		}
	}
}

class ListNode {
	int m_nValue;
	ListNode m_pNext;
}