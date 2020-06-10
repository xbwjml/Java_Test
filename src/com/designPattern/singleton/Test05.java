package com.designPattern.singleton;

public class Test05 {
	public static void main(String[] args) {
		Singleton05 instance = Singleton05.getInstance();
		Singleton05 instance2 = Singleton05.getInstance();
		System.out.println(instance == instance2);
	}
}

/**
 * 懒汉式(同步代码块)
 * @author Leemi
 */
class Singleton05{
	private static Singleton05 instance;
	
	private Singleton05() {}
	
	public static Singleton05 getInstance() {
		if( instance == null ) {
			synchronized (Singleton05.class) {
				instance = new Singleton05();
			}
		}
		return instance;
	}
}