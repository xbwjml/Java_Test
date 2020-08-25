package com.se.Thread.xx;

public class Demo1 {
	public static void main(String[] args) {
		
		int tatalNum = 5;
		int[] heightArr = {5,4,3,2,1};
		
		method(heightArr);
		
	}

	/**
	 * 第一题
	 * @param heightArr
	 */
	private static void method(int[] heightArr) {
		
		for( int i=0; i<heightArr.length; i++ ) {
			for( int j=i-1; j>-2; j-- ) {
				if( j == -1) {
					System.out.print(-1 + " ");
					break;
				}
				if( heightArr[j] > heightArr[i] ) {
					System.out.print(heightArr[j] +" ");
					break;
				}
			}
		}
		
	}
}
