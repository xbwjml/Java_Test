package com.sort;

/**
 * 直接插入排序
 * @author Leemi
 *
 */
public class InsertSort {
	public static void main(String[] args) {
		int[] arr = {2,5,1,3,8,5,7,4,3,808,98,-5,34,56,41,-90};
		insertSort(arr);
		for (int a : arr) {
			System.out.print(a+"  ");
		}
	}
	
	/**
	 * 
	 * @param arr
	 */
	private static void insertSort(int[] arr) {
		for( int i=1; i<arr.length; i++ ) {
			//用未排序序列的第一个元素为待插入元素
			for( int j=i; j>0; j-- ) {
				//遍历已排序序列，依次和待插入元素比较
				if( arr[j] < arr[j-1] ) {
					//若待插入元素比已排序序列中的某个元素小，则将它俩交换
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}else {
					break;
				}
			}
		}
	}
}
