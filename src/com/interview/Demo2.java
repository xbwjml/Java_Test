package com.interview;

/**
 * 设置 -Xms1m -Xmx1m
 * @author Leemi
 *
 */
public class Demo2 {
	public static void main(String[] args) {
		//创建一个 80M 得大对象
		byte[] arr = new byte[10*1024*1024];
	}
}
