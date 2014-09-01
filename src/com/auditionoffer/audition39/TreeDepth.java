package com.auditionoffer.audition39;

public class TreeDepth {
	public int treeDepth(BinaryTree tree) {
		if (tree == null) {
			return 0;
		}
		int left = treeDepth(tree.left);
		int right = treeDepth(tree.right);
		return (left > right) ? (left + 1) : (right + 1);
	}
}

class BinaryTree {
	int data;
	BinaryTree left;
	BinaryTree right;
}