package com.interview.lock;

import java.util.concurrent.CountDownLatch;

public class Demo5 {
	public static void main(String[] args) throws Exception {
		
		CountDownLatch countDownLatch = new CountDownLatch(6);
		
		for( int i=1; i<=6; i++ ) {
			new Thread( ()->{
				System.out.println(Thread.currentThread().getName()+"号学生上完自习走人");
				countDownLatch.countDown();
			}).start();
		}
		
		countDownLatch.await();
		System.out.println("==========================班长关教室");
	}
}
