package com.sort;

/**
 * 选择排序
 * @author Leemi
 *
 */
public class SelectSort {
	
	public static void main(String[] args) {
		int[] arr = {2,5,1,3,8,5,7,4,3,808,98,-5,34,56,41,-90};
		selectSort(arr);
		for (int a : arr) {
			System.out.print(a+"  ");
		}
	}
    
	/**
	 * 每次从未排序序列中找出最小值，把它排在已排序序列的后面
	 * @param arr
	 */
    private static void selectSort(int[] arr){
    	for( int i=0; i<arr.length; i++ ) {
    		
    		//遍历未排序的序列，找到未排序序列中的最小的元素
    		int minIdx = i;
    		for( int j=i+1; j<arr.length; j++ ) {
    			minIdx = arr[j] < arr[minIdx] ? j:minIdx;
    		}
    		
    		//把未排序序列中的最小的元素添加在已排序序列的后面
    		if( minIdx != i ) {
    			int temp = arr[minIdx];
    			arr[minIdx] = arr[i];
    			arr[i] = temp;
    		}
    		
    	}
    }
}
