package com.interview.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo1 {
	public static void main(String[] args) {
		ExecutorService threadPool = Executors.newFixedThreadPool(5);//一池5个处理线程
//		ExecutorService threadPool = Executors.newSingleThreadExecutor();//一池1个处理线程
//		ExecutorService threadPool = Executors.newCachedThreadPool();//一池不确定个处理线程
		
		try {
			//模拟10个用户，每个用户就是来自外部的请求
			for( int i=1; i<=10; i++ ){
				threadPool.execute( ()->{
					System.out.println(Thread.currentThread().getName()+"\t 办理业务");
				});
			}
		} catch( Exception e ) {
			e.printStackTrace();
		} finally {
			threadPool.shutdown();
		}
	}
}
