package com.auditionoffer.audition08;

public class minOfShiftedArray { 
	public static void main(String[] args) {  
    int[][] a={  
            {1,2,3,4,5},  
            {2,3,4,5,1},  
            {3,4,5,1,2},  
            {4,5,1,2,3},  
            {5,1,2,3,4},  
    };  
    for(int[] each:a){  
        int min=minOfShiftedArray(each);  
        System.out.println(min);  
    }  
  
      
}  
	public static int minOfShiftedArray(int[] x){  
        if(x==null||x.length==0){  
            return -1;  
        }  
        int len=x.length;  
        int low=0;  
        int high=len-1;  
        if(x[low]<x[high]){//if the array is not shifted actually,e.g. {1,2,3,4,5}  
            return x[low];  
        }  
        int mid=0;  
        while(low<high){  
            mid=(low&high)+(low^high)/2;  
            if(mid==low){//if there are only two elements left  
                return x[low]<x[high]?x[low]:x[high];  
            }  
            if(x[mid]>x[low]){  
                low=mid;  
            }else{  
                high=mid;  
            }  
        }  
        return x[mid];  
    }  
}
