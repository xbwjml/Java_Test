package com.yangGe.JUC.day01;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ShareResource{
	private int number = 1;
	private Lock lock = new ReentrantLock();
	private Condition c1 = lock.newCondition();
	private Condition c2 = lock.newCondition();
	private Condition c3 = lock.newCondition();
	
	public void print5( int totalLoop ) {
		lock.lock();
		try {
			//1.判断
			while( number != 1 ) {
				c1.await();
			}
			//2.干活
			for( int i=1; i<6; i++ ) {
				System.out.println(Thread.currentThread().getName()+"\t"+i+"\t totalLoop"+totalLoop);
			}
			//3.通知
			number = 2;
			c2.signal();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void print10( int totalLoop ) {
		lock.lock();
		try {
			//1.判断
			while( number != 2 ) {
				c2.await();
			}
			//2.干活
			for( int i=1; i<11; i++ ) {
				System.out.println(Thread.currentThread().getName()+"\t"+i+"\t totalLoop"+totalLoop);
			}
			//3.通知
			number = 3;
			c3.signal();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void print15( int totalLoop ) {
		lock.lock();
		try {
			//1.判断
			while( number != 3 ) {
				c3.await();
			}
			//2.干活
			for( int i=1; i<16; i++ ) {
				System.out.println(Thread.currentThread().getName()+"\t"+i+"\t totalLoop"+totalLoop);
			}
			//3.通知
			number = 1;
			c1.signal();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}

public class Demo5 {
	public static void main(String[] args) {
		ShareResource sr = new ShareResource();
		
		new Thread( ()->{
			for( int i=1; i<11; i++ ) {
				sr.print5(i);
			}
		},"AA" ).start();
		
		new Thread( ()->{
			for( int i=1; i<11; i++ ) {
				sr.print10(i);
			}
		},"BB" ).start();
		
		new Thread( ()->{
			for( int i=1; i<11; i++ ) {
				sr.print15(i);
			}
		},"CC" ).start();
		
	}
}
