package com.yangGe.JVM.day01;

import com.sun.org.apache.bcel.internal.util.ClassLoader;

class Test{
	
}

public class Demo1 {
	public static void main(String[] args) {
		Object obj = new Object();
		Test t1 = new Test();
		
		System.out.println(obj.getClass().getClassLoader());
		System.out.println("==================================");
		System.out.println(t1.getClass().getClassLoader().getParent().getParent());
		System.out.println(t1.getClass().getClassLoader().getParent());
		System.out.println(t1.getClass().getClassLoader());
		
	}
}
