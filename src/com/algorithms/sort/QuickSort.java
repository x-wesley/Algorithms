package com.algorithms.sort;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] list = {34,3,53,2,23,7,14,10};  
		QuickSort qs = new QuickSort();
		qs.quick(list);
		for(int i = 0; i < list.length; i++){
			System.out.println(list[i] + " ");
		}
		System.out.println();
	}
	public void quick(Integer[] str){
		if(str.length > 0){
			_quickSort(str, 0, str.length - 1);
		}
	}
	public void _quickSort(Integer[] list, int low, int high){
		if(low < high){
			int middle = getMiddle(list, low, high);
			_quickSort(list, low, middle - 1);
			_quickSort(list, middle + 1, high);
		}
	}
	public int getMiddle(Integer[] list, int low, int high){
		int temp = list[low];
		while(low < high){
			while(low < high && list[high] > temp){
				high--;
			}
			list[low] = list[high];
			while(low < high && list[low] <temp){
				low++;
			}
			list[high] = list[low];
		}
		list[low] = temp;
		return low;
	}
}
