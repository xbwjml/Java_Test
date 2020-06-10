package com.designPattern.singleton;

public class Test01 {
	public static void main(String[] args) {
		Singleton01 instance = Singleton01.getInstance();
		Singleton01 instance2 = Singleton01.getInstance();
		System.out.println(instance == instance2);
	}
}

/**
 * 饿汉式(静态常量)
 * @author Leemi
 */
class Singleton01{
	//1.构造器私有化,外部就不能new了
	private Singleton01() {}
	
	//2.本类内部创建一个对象实例
	private final static Singleton01 instance = new Singleton01();
	
	//3.提供公有的静态方法，返回实例对象
	public static Singleton01 getInstance() {
		return instance;
	}
	
}
