package com.interview.JVM;

public class Demo1 {
	public static void main(String[] args) throws Exception {
		System.out.println("******************Hello GC***");
		// Thread.sleep(Integer.MAX_VALUE);
		byte[] arr = new byte[50 * 1024 * 1024];
	}
}
