package com.auditionoffer.audition25;

import java.util.Scanner;
import java.util.Stack;

public class BinaryTreePath {
	private Scanner scanner = new Scanner(System.in);

	// 先序建立二叉树，测试数据10 5 4 # # 7 # # 12 # #
	public BTreeNode createTree(BTreeNode root) {
		String data = scanner.next();
		if (data.equals("#"))
			return null;
		root = new BTreeNode();
		root.data = Integer.valueOf(data);
		root.left = createTree(root.left);
		root.right = createTree(root.right);
		return root;
	}

	/**
	 * 
	 * @param root
	 *            树的根节点
	 * @param sum
	 *            当前路径之和
	 * @param stack
	 *            存放路径上结点的值
	 * @param num
	 *            求的路径和
	 */
	public void printPath(BTreeNode root, int sum, Stack<Integer> stack, int num) {
		if (root != null) {
			sum = sum + root.data;
			stack.push(root.data);
			printPath(root.left, sum, stack, num);
			printPath(root.right, sum, stack, num);
			if (sum == num && root.left == null && root.right == null) {
				for (int i : stack) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
			stack.pop();
		}
	}

	public static void main(String[] args) {
		BinaryTreePath btp = new BinaryTreePath();
		BTreeNode root = null;
		root = btp.createTree(root);
		Stack<Integer> stack = new Stack<Integer>();
		int num = 22;
		int sum = 0;
		btp.printPath(root, sum, stack, num);
	}
}

// 树的结构
class BTreeNode {
	Integer data;
	BTreeNode left;
	BTreeNode right;
}