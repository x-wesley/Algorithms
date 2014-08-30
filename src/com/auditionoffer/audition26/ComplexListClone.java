package com.auditionoffer.audition26;

public class ComplexListClone {
	public static ComplexListNode clone(ComplexListNode head){
		CloneNodes(head);
		ConnectSiblingNodes(head);
		return ReconnectNodes(head);
	}

	private static void CloneNodes(ComplexListNode head) {
		// TODO Auto-generated method stub
		ComplexListNode node = head;
		while(node != null){
			ComplexListNode cloned = new ComplexListNode();
			cloned.data = node.data;
			cloned.next = node.next;
			cloned.sibling = null;
			
			node.next = cloned;
			node = cloned.next;
		}
	}

	private static ComplexListNode ReconnectNodes(ComplexListNode head) {
		// TODO Auto-generated method stub
		ComplexListNode node = head;
		ComplexListNode clonedHead = null;
		ComplexListNode clonedNode = null;
		if(node != null){
			clonedHead = clonedNode = node.next;
			node.next = clonedNode.next;
			node = node.next;
		}
		while(node != null){
			clonedNode.next = node.next;
			clonedNode = clonedNode.next;
			node.next = clonedNode.next;
			node = node.next;
		}
		return clonedHead;
	}

	private static void ConnectSiblingNodes(ComplexListNode head) {
		// TODO Auto-generated method stub
		ComplexListNode node = head;
		while(node != null){
			ComplexListNode cloned = node.next;
			if(node.sibling != null){
				cloned.sibling = node.next.sibling;
			}
			node = cloned.next;
		}
	}
}
class ComplexListNode{
	int data;
	ComplexListNode next;
	ComplexListNode sibling;
}