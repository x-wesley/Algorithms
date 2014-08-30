package com.auditionoffer.audition27;

public class Convert {
	public BinaryTreeNode convert(BinaryTreeNode tree){
		BinaryTreeNode lastNodeInList = null;
		convertNode(tree, lastNodeInList);
		BinaryTreeNode headOfList = lastNodeInList;
		while(headOfList != null && headOfList.left!= null){
			headOfList = headOfList.left;
		}
		return headOfList;
	}

	private void convertNode(BinaryTreeNode tree, BinaryTreeNode lastNodeInList) {
		// TODO Auto-generated method stub
		if(tree == null){
			return;
		}
		BinaryTreeNode current = tree;
		if(current.left != null){
			convertNode(current.left, lastNodeInList);
		}
		current.left = lastNodeInList;
		if(lastNodeInList != null){
			lastNodeInList.right = current;
		}
		
		lastNodeInList = current;
		if(current.right != null){
			convertNode(current.right, lastNodeInList);
		}
	}
}
class BinaryTreeNode{
	int value;
	BinaryTreeNode left;
	BinaryTreeNode right;
}