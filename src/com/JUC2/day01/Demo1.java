package com.JUC2.day01;

class ShareData {
	private int num = 0;

	public synchronized void incr() throws InterruptedException {
		// 判断
		if (num != 0) {
			this.wait();
		}
		// 干活
		num++;
		System.out.println(Thread.currentThread().getName() + " \t :" + num);
		// 通知
		this.notifyAll();
	}

	public synchronized void decr() throws InterruptedException {
		// 判断
		if (num == 0 ) {
			this.wait();
		}
		// 干活
		num--;
		System.out.println(Thread.currentThread().getName() + " \t :" + num);
		// 通知
		this.notifyAll();
	}
	
}

public class Demo1 {
	public static void main(String[] args) {
		ShareData shareData = new ShareData();
		
		new Thread( ()->{
			for( int i=0; i<9; i++ ) {
				try {
					shareData.incr();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		},"AA" ).start();
		
		new Thread( ()->{
			for( int i=0; i<9; i++ ) {
				try {
					shareData.decr();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		},"BB" ).start();
		
	}
}
