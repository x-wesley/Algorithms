package com.auditionoffer.audition19;

public class MirrorRecursively {
	public void mirrorRecursively(BinaryTreeNode node) {
		if (node == null || (node.left == null) && (node.right == null)) {
			return;
		}
		BinaryTreeNode temp = node.left;
		node.left = node.right;
		node.right = temp;
		
		if(node.left != null){
			mirrorRecursively(node.left);
		}
		if(node.right != null){
			mirrorRecursively(node.right);
		}
	}
}

class BinaryTreeNode {
	int val;
	BinaryTreeNode left;
	BinaryTreeNode right;
}