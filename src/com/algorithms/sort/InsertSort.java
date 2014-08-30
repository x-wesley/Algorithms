package com.algorithms.sort;

/*时间复杂度O(n^2)
n较小的时候 n<=50 量级小于千
一般称为简单排序

1 从第一个元素开始，该元素可以认为已经被排序
2 取出下一个元素，在已经排序的元素序列中从后向前扫描
3 如果该元素（已排序）大于新元素，则将该元素移到下一位置。
4 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置。
5 将新元素插入到该位置
6 重复步骤2

如果目标是把n个元素的序列升序排列，那么采用插入排序存在最好情况和最坏情况。
最好情况就是：序列已经是升序排列，在这种情况下，需要进行的比较操作需（n- 1）次即可。
最坏情况就是：序列是降序排列，那么此时需要进行的比较共有n（n-1）/2次。
插入排序的复制操作是比较操作次数加上（n-1）次。*/
public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sort = new int[]{1,0,10,20,3,5,6,4,9,8,12,17,34,11};
		for(int i = 0; i < sort.length; i++){
			for(int j = i; (j > 0)&& (sort[j] < sort[j - 1]); j--){
				sort[j] = sort[j] ^ sort[j - 1];
				sort[j -1] = sort[j-1] ^ sort[j];
				sort[j] = sort[j] ^ sort[j - 1];
			}
		}
		for(int i = 0; i < sort.length; i++){
			System.out.println(sort[i]);
		}
	}

}
