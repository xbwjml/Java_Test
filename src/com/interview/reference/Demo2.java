package com.interview.reference;

import java.lang.ref.SoftReference;

/**
 * 软引用案例
 * @author Leemi
 *
 */
public class Demo2 {
	public static void main(String[] args) {
//		memoryEnough();
		memoryNotEnough();
	}
	
	//内存充足的时候
	public static void memoryEnough() {
		Object o1 = new Object();
		SoftReference<Object> softReference = new SoftReference<>(o1);
		System.out.println(o1);
		System.out.println(softReference.get());
		
		o1=null;
		System.gc();
		
		System.out.println(o1);
		System.out.println(softReference.get());
	}
	
	//内存不足的时候
	//故意产生大对象并配置小内存，让它产生OOM,看软引用回收情况
	//设置 -Xms5m -Xmx5m -XX:+PrintGCDetails
	public static void memoryNotEnough() {
		Object o1 = new Object();
		SoftReference<Object> softReference = new SoftReference<>(o1);
		System.out.println(o1);
		System.out.println(softReference.get());
		
		o1 = null;
		
		try {
			byte[] arr = new byte[30*1024*1024];
		} catch( Throwable t) {
			t.printStackTrace();
		} finally {
			System.out.println(o1);
			System.out.println(softReference.get());
		}
	}
}
