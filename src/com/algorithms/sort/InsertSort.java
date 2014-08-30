package com.algorithms.sort;

/*ʱ�临�Ӷ�O(n^2)
n��С��ʱ�� n<=50 ����С��ǧ
һ���Ϊ������

1 �ӵ�һ��Ԫ�ؿ�ʼ����Ԫ�ؿ�����Ϊ�Ѿ�������
2 ȡ����һ��Ԫ�أ����Ѿ������Ԫ�������дӺ���ǰɨ��
3 �����Ԫ�أ������򣩴�����Ԫ�أ��򽫸�Ԫ���Ƶ���һλ�á�
4 �ظ�����3��ֱ���ҵ��������Ԫ��С�ڻ��ߵ�����Ԫ�ص�λ�á�
5 ����Ԫ�ز��뵽��λ��
6 �ظ�����2

���Ŀ���ǰ�n��Ԫ�ص������������У���ô���ò������������������������
���������ǣ������Ѿ����������У�����������£���Ҫ���еıȽϲ����裨n- 1���μ��ɡ�
�������ǣ������ǽ������У���ô��ʱ��Ҫ���еıȽϹ���n��n-1��/2�Ρ�
��������ĸ��Ʋ����ǱȽϲ����������ϣ�n-1���Ρ�*/
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