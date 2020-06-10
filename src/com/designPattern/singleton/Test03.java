package com.designPattern.singleton;

public class Test03 {
	public static void main(String[] args) {
		Singleton01 instance = Singleton01.getInstance();
		Singleton01 instance2 = Singleton01.getInstance();
		System.out.println(instance == instance2);
	}
}

/**
 * 懒汉式(线程不安全)
 * @author Leemi
 */
class Singleton03{
	private static Singleton03 instance;
	
	//构造器私有化
	private Singleton03() {}
	
	//对外提供一个静态方法，当使用到该方法时才去创建对象
	public static Singleton03 getInstance() {
		if( instance == null ) {
			instance = new Singleton03();
		}
		return instance;
	}
}