package com.interview.volatilee;

import java.util.concurrent.TimeUnit;

/**
 * 1，验证volatile的可见性
 * 
 * @author Leemi
 *
 */
public class Demo1 {
	public static void main(String[] args) {
		MyData myData = new MyData();
		new Thread(() -> {
			System.out.println(Thread.currentThread().getName() + "\t come in");
			// 线程暂停一会儿
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			myData.addTo60();
			System.out.println(Thread.currentThread().getName() + "\t updated num:" + myData.num);
		}, "AAA").start();

		// 第二个线程就是我们的main线程
		while (myData.num == 0) {
			// main线程就再这里一直等待，直到num!=0
		}
		System.out.println(Thread.currentThread().getName() + "\t main mission is over, now num is :" + myData.num);

	}
}

class MyData {
	volatile int num = 0;

	public void addTo60() {
		this.num = 60;
	}
}
