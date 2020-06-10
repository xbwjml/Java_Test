package com.designPattern.singleton;

public class Test08 {
	public static void main(String[] args) {
		Singleton08 instance = Singleton08.INSTANCE;
		Singleton08 instance2 = Singleton08.INSTANCE;
		System.out.println(instance == instance2);
		instance.sayOK();
	}
}

/**
 * 枚举
 * @author Leemi
 */
enum Singleton08{
	INSTANCE;
	public void sayOK() {
		System.out.println("OK!!!!!!");
	}
}
