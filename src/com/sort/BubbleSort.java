package com.sort;

import com.sun.xml.internal.bind.v2.model.util.ArrayInfoUtil;

/**
 * 冒泡排序
 * @author Leemi
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {2,5,1,3,8,5,7,4,3,808,98,-5};
        bubbleSort(arr);
        for (int a : arr) {
			System.out.print(a+"  ");
		}
	}
	
	/**
	 * 从第一个元素开始相邻亮亮比较，若前数比后数大，则两数交换。
	 * 循环每一次从第一个元素开始，每次比上一次循环少比较依次。
	 * @param arr
	 */
	private static void bubbleSort(int[] arr) {
		for( int i=arr.length-1; i>0; i-- ) {
			for( int j=0; j<i; j++ ) {
				if( arr[j]>arr[j+1] ) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
