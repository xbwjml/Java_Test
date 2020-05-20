package com.interview.zsdl;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 生产者消费者模式-传统版
 * 案例：一个初始值为零的变量，两个线程对其交替操作，一个+1，一个-1，来5轮;
 * @author Leemi
 *
 */

class ShareData{
	private int num = 0;
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	
	public void increment() throws Exception{
		lock.lock();
		try {
			//1.判断
			while( num != 0 ) {
				//等待，不能生产
				condition.await();
			}
			//2.生产
			num++;
			System.out.println(Thread.currentThread().getName()+" \t"+num);
			//3.通知唤醒
			condition.signalAll();
		} finally {
			lock.unlock();
		}
	}
	
	public void decrement() throws Exception{
		lock.lock();
		try {
			//1.判断
			while( num == 0 ) {
				//等待，不能消费
				condition.await();
			}
			//2.消费
			num--;
			System.out.println(Thread.currentThread().getName()+" \t"+num);
			//3.通知唤醒
			condition.signalAll();
		} finally {
			lock.unlock();
		}
	}
}

public class Demo8 {
	public static void main(String[] args) {
		ShareData shareData = new ShareData();
		
		new Thread( ()->{
			for( int i=1; i<=5; i++ ) {
				try {
					shareData.increment();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		},"AAA").start();
		
		new Thread( ()->{
			for( int i=1; i<=5; i++ ) {
				try {
					shareData.decrement();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		},"BBB").start();
	}
}
