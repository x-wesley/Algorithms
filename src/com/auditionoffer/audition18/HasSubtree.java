package com.auditionoffer.audition18;

public class HasSubtree {
	public boolean hasSubtree(BinaryTreeNode treeA, BinaryTreeNode treeB) {
		boolean res = false;
		if (treeA != null && treeB != null) {
			res = doesTreeAHaveTreeB(treeA,treeB);
		}
		if(!res){
			res = hasSubtree(treeA.left, treeB);
		}
		if (!res) {
			res = hasSubtree(treeA.right, treeB);
		}
		return false;
	}

	private boolean doesTreeAHaveTreeB(BinaryTreeNode treeA,
			BinaryTreeNode treeB) {
		// TODO Auto-generated method stub
		if(treeA == null){
			return true;
		}
		if(treeA == null){
			return false;
		}
		if(treeA.val != treeB.val){
			return false;
		}
		
		return doesTreeAHaveTreeB(treeA.left, treeB.left) 
				&& doesTreeAHaveTreeB(treeA.right, treeB.right);
	}
}

class BinaryTreeNode {
	int val;
	BinaryTreeNode left;
	BinaryTreeNode right;

}