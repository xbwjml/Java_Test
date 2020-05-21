package com.interview.zsdl;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ShareResource{
	private int number = 1;
	private Lock lock = new ReentrantLock();
	private Condition c1 = lock.newCondition();
	private Condition c2 = lock.newCondition();
	private Condition c3 = lock.newCondition();
	
	public void print5() throws Exception {
		lock.lock();
		try {
			//1.判断
			while( number != 1 ) {
				c1.await();
			}
			//2.干活
			for( int i=1; i<=5; i++ ) {
				System.out.println(Thread.currentThread().getName()+"\t"+number);
			}
			//3.通知
			number = 2;
			c2.signal();
		} finally {
			lock.unlock();
		}
	}
	
	public void print10() throws Exception {
		lock.lock();
		try {
			//1.判断
			while( number != 2 ) {
				c2.await();
			}
			//2.干活
			for( int i=1; i<=10; i++ ) {
				System.out.println(Thread.currentThread().getName()+"\t"+number);
			}
			//3.通知
			number = 3;
			c3.signal();
		} finally {
			lock.unlock();
		}
	}
	
	public void print15() throws Exception {
		lock.lock();
		try {
			//1.判断
			while( number != 3 ) {
				c3.await();
			}
			//2.干活
			for( int i=1; i<=15; i++ ) {
				System.out.println(Thread.currentThread().getName()+"\t"+number);
			}
			//3.通知
			number = 1;
			c1.signal();
		} finally {
			lock.unlock();
		}
	}
}

/**
 * AAA打印5次，BBB打印10次，CCC打印15次，
 * 这样进行10轮
 * @author Leemi
 *
 */
public class Demo9 {
	public static void main(String[] args) {
		ShareResource shareResource = new ShareResource();
		
		new Thread( ()->{
			for( int i=1; i<=10; i++ ) {
				try {shareResource.print5();
				} catch (Exception e) {e.printStackTrace();}
			}
		},"AAA").start();
		
		new Thread( ()->{
			for( int i=1; i<=10; i++ ) {
				try {shareResource.print10();
				} catch (Exception e) {e.printStackTrace();}
			}
		},"BBB").start();
		
		new Thread( ()->{
			for( int i=1; i<=10; i++ ) {
				try {shareResource.print15();
				} catch (Exception e) {e.printStackTrace();}
			}
		},"CCC").start();
		
	}
}
