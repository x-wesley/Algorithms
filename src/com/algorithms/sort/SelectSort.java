package com.algorithms.sort;
/*
ʱ�临�Ӷ�O(n^2)
n��С��ʱ�� n<=50  
һ���Ϊ������

������δ�����������ҵ���СԪ�أ�
��ŵ��������е���ʼλ�ã�Ȼ��
�ٴ�ʣ��δ����Ԫ���м���Ѱ����С
Ԫ�أ�������������β���Դ����ƣ�
ֱ������Ԫ�ؾ�������ϡ�
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
