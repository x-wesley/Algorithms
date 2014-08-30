package com.algorithms.sort;
/*���ַ�����/�۰���뷨
��ֱ�Ӳ���������е�ĳһ���ǣ�����r[i].key������ǰ��i-1����¼�Ѿ����ؼ������򡣴�ʱ����ֱ�Ӳ�����Ѫ�ķ�����
����Ϊ�����۰���ң��ҳ�r[i].keyӦ�����λ�ã�Ȼ����롣
�Ƚϴ���O(nlogn)
�ƶ�����O(n2)
ʱ�临�Ӷ�O(n2)
�ȶ�����*/
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
