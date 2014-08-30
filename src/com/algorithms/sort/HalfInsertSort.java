package com.algorithms.sort;
/*二分法排序/折半插入法
当直接插入排序进行到某一趟是，对于r[i].key来讲，前面i-1个记录已经按关键字排序。此时不用直接插入排血的方法，
而改为二分折半查找，找出r[i].key应插入的位置，然后插入。
比较次数O(nlogn)
移动次数O(n2)
时间复杂度O(n2)
稳定排序*/
public class HalfInsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] source =  {1,3,5,2,6,8,32,674,34,55,72,23};
		int low, high,mid;
		int temp;
		for(int i = 1; i < source.length; i++){
			temp = source[i];
			high = i - 1;
			low = 0;
			while(low <= high){
				mid = (low + high)/2;
				if(source[mid] < source[i]){
					low = mid + 1;
				}else {
					high = mid - 1;
				}
			}
			for(int j = i - 1; j > high; j--){
				source[j + 1] = source[j];
			}
			source[high + 1] = temp;
		}
		for(int i = 0; i < source.length; i++){
			System.out.println(source[i]);
		}
	}

}
