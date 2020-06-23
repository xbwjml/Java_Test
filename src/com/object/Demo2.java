package com.object;

import java.util.Date;

public class Demo2 {
	public static void main(String[] args) {
		Thread t1 = new Thread("t1");
		System.out.println("t1 :" + t1);
		synchronized (t1) {
			try {
				//启动线程
				System.out.println(Thread.currentThread().getName() + " start t1");
				t1.start();
				// 主线程等待t1通过notify唤醒
				System.out.println(Thread.currentThread().getName() + "  wait " + new Date());
				t1.wait();
				System.out.println(Thread.currentThread().getName() + "  continue " + new Date());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class ThreadA extends Thread {
	@Override
	public void run() {
		synchronized (this) {
			System.out.println("this : " + this);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " call nothfy()");
			this.notify();
		}
	}
}
