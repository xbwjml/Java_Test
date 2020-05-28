package com.interview.reference;

import java.lang.ref.WeakReference;

public class Demo3 {
	public static void main(String[] args) {
		Object o1 = new Object();
		WeakReference<Object> weakReference = new WeakReference<Object>(o1);
		System.out.println(o1);
		System.out.println(weakReference.get());
		
		o1 = null;
		System.gc();
		System.out.println("=========");
		
		System.out.println(o1);
		System.out.println(weakReference.get());
	}
}
