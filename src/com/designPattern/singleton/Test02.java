package com.designPattern.singleton;

public class Test02 {
	public static void main(String[] args) {
		Singleton02 instance = Singleton02.getInstance();
		Singleton02 instance2 = Singleton02.getInstance();
		System.out.println(instance == instance2);
	}
}

/**
 * 饿汉式(静态代码块)
 * @author Leemi
 */
class Singleton02{
	//1.构造方法私有化
	private Singleton02() {}
	
	private static Singleton02 instance;
	
	//2.在静态代码块中创建对象
	static {
		Singleton02 instance = new Singleton02();
	}
	
	//3.对外提供一个公有的静态方法，返回实例对象
	public static Singleton02 getInstance() {
		return instance;
	}
	
}
