package com.yangGe.JVM.day01;

import java.util.Random;

public class Demo2 {
	public static void main(String[] args) {
		
		//java虚拟机试图使用的最大内存量。
		long maxMemory = Runtime.getRuntime().maxMemory();
		
		//java虚拟机中的总内存量
		long totalMemory = Runtime.getRuntime().totalMemory();
		
		System.out.println("MAX_MEMORY:" + maxMemory*1.0/1024.0/1024.0 +"MB");
		System.out.println("TOTAL_MEMORY:" + totalMemory*1.0/1024.0/1024.0 +"MB");
		
//		String str = "Hello";
//		while( true ) {
//			str += str+ new Random().nextInt(888888888);
//		}
	} 
}
