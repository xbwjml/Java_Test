package com.designPattern.singleton;

public class Test07 {
	public static void main(String[] args) {
		Singleton07 instance = Singleton07.getInstance();
		Singleton07 instance2 = Singleton07.getInstance();
		System.out.println(instance == instance2);
	}
}

/**
 * 静态内部类
 * @author Leemi
 */
class Singleton07{
	
	private Singleton07() {}
	
	//写一个静态内部类，该类中有一个静态属性Singleton07 instance
	private static class Inner{
		private static final Singleton07 instance = new Singleton07();
	}
	
	//对外提供一个静态方法,直接返回静态内部类Inner的静态属性Singleton07 instance
	public static Singleton07 getInstance() {
		return Inner.instance;
	}
	
}

