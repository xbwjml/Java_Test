package com.interview.volatilee;

/**
 * 单例模式案例
 * @author Leemi
 *
 */
public class SingletonDemo {
	
	private static volatile SingletonDemo instance = null;
	
	//构造方法私有化
	private SingletonDemo() {
		System.out.println(Thread.currentThread().getName()+"\t 我是构造方法 private SingletonDemo()");
	}
	
	//DCL (Double Check Lock) 双端检锁机制
	public static SingletonDemo getInstance() {
		if( instance == null ) {
			synchronized(SingletonDemo.class) {
				if( instance == null ) {
					instance = new SingletonDemo();
				}
			}
		}
		return instance;
	}
	
	public static void main(String[] args) {
		
		//先来单线程
//		System.out.println(SingletonDemo.getInstance() == SingletonDemo.getInstance());
//		System.out.println(SingletonDemo.getInstance() == SingletonDemo.getInstance());
//		System.out.println(SingletonDemo.getInstance() == SingletonDemo.getInstance());
		System.out.println("==========================");
		
		//下面是多线程
		for( int i=0; i<10; i++ ) {
			new Thread(()->{
				SingletonDemo.getInstance();
			},String.valueOf(i)).start();
		}
	}
}
