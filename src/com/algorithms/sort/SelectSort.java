package com.algorithms.sort;
/*
时间复杂度O(n^2)
n较小的时候 n<=50  
一般称为简单排序

首先在未排序序列中找到最小元素，
存放到排序序列的起始位置，然后，
再从剩余未排序元素中继续寻找最小
元素，放在排序序列尾，以此类推，
直到所有元素均排序完毕。
*/
public class SelectSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] source =  {1,3,5,2,6,8,32,674,34,55,72,23};
		for(int i = 0; i < source.length; i++){
			for(int j = i + 1; j < source.length; j++){
				if(source[j] < source[i]){
					source[j] = source[j] ^ source[i];
					source[i] = source[i] ^ source[j];
					source[j] = source[j] ^ source[i];
				}
			}
		}
		for (int i = 0; i < source.length; i++) {
			System.out.println(source[i]);
		}
	}

}
