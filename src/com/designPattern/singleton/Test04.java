package com.designPattern.singleton;

public class Test04 {
	public static void main(String[] args) {
		Singleton01 instance = Singleton01.getInstance();
		Singleton01 instance2 = Singleton01.getInstance();
		System.out.println(instance == instance2);
	}
}

/**
 * 懒汉式(同步方法)
 * @author Leemi
 */
class Singleton04{
	private static Singleton04 instance;
	
	private Singleton04() {}
	
	//用synchronized把这个方法同步
	public static synchronized Singleton04 getInstance() {
		if( instance == null ) {
			instance = new Singleton04();
		}
		return instance;
	}
}
