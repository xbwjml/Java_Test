package com.se.Thread.xx;

public class Demo03 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		
		binarySearch(arr,2);
		System.out.println("=====");
		left_bound(arr,2);
		System.out.println("=====");
		right_bound(arr,2);
		System.out.println("=====");
		
	}
	
	/**
	 * 
	 * @param arr		数组
	 * @param target	目标值
	 * @return			目标值索引
	 */
	private static int binarySearch(int[] arr,int target){
		int left = 0;
		int right = arr.length - 1;
		int middle ;			
		
		if(target < arr[left] || target > arr[right] ){
			return -1;				
		}
		
		while(left <= right){
			middle = (left + right) / 2;
			System.out.println(arr[middle]);
			if(arr[middle] > target){
				right = middle - 1;
			}else if(arr[middle] < target){
				left = middle + 1;
			}else{
				return middle;
			}
		}
		
		return -1;	
	}

	
	private static int left_bound(int[] nums, int target) {
	    if (nums.length == 0) return -1;
	    int left = 0;
	    int right = nums.length; // 注意

	    while (left < right) { // 注意
	        int mid = (left + right) / 2;
	        System.out.println(nums[mid]);
	        if (nums[mid] == target) {
	            right = mid;
	        } else if (nums[mid] < target) {
	            left = mid + 1;
	        } else if (nums[mid] > target) {
	            right = mid; // 注意
	        }
	    }
	    return left;
	}
	
	private static int right_bound(int[] nums, int target) {
	    if (nums.length == 0) return -1;
	    int left = 0, right = nums.length;

	    while (left < right) {
	        int mid = (left + right) / 2;
	        System.out.println(nums[mid]);
	        if (nums[mid] == target) {
	            left = mid + 1; // 注意
	        } else if (nums[mid] < target) {
	            left = mid + 1;
	        } else if (nums[mid] > target) {
	            right = mid;
	        }
	    }
	    return left - 1; // 注意
	}
}
