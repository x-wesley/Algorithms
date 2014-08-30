package com.auditionoffer.audition23;

import java.util.LinkedList;
import java.util.Queue;


public class PrintFromTopToBottom {
	public PrintFromTopToBottom() {
		// TODO Auto-generated constructor stub
	}

	public void printFromTopToBottom(BinaryTreeNode tree) {
		if (tree == null)
			return;
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.offer(tree);//将指定元素添加到此列表的末尾（最后一个元素）。 
		while(queue.size()>0){   
			BinaryTreeNode temp=queue.poll();    //获取并移除此列表的头（第一个元素） 
			System.out.println(temp.val);
			if(temp.left!=null){   
                queue.offer(temp.left);   
            }  
			if(temp.right!=null){   
                queue.offer(temp.right);   
            }  
        }   
	}
}

class BinaryTreeNode {
	int val;
	BinaryTreeNode left;
	BinaryTreeNode right;
}