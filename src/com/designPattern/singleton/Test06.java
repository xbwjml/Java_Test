package com.designPattern.singleton;

public class Test06 {
	public static void main(String[] args) {
		Singleton06 instance = Singleton06.getInstance();
		Singleton06 instance2 = Singleton06.getInstance();
		System.out.println(instance == instance2);
	}
}

/**
 * 双重检查
 * @author Leemi
 */
class Singleton06{
	private static volatile Singleton06 instance;
	
	private Singleton06() {}
	
	//双重检查，既保证线程安全又提高效率
	public static Singleton06 getInstance() {
		if( instance == null ) {//第一次判断
			synchronized (Singleton06.class) {
				if( instance == null ) {//第二次判断
					instance = new Singleton06();
				}
			}
		}
		return instance;
	}
}
