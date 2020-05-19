package com.interview.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/**
 * 自旋锁
 * @author Leemi
 *
 */
public class Demo3 {
	
	//原子引用线程
	AtomicReference<Thread> atomicReference = new AtomicReference<>();
	
	public void myLock() {
		Thread thread = Thread.currentThread();
		System.out.println(Thread.currentThread().getName()+"\t come in! ");
		while( !atomicReference.compareAndSet(null, thread) ) {
			
		}
	}
	
	public void myUnlock() {
		Thread thread = Thread.currentThread();
		atomicReference.compareAndSet(thread, null);
		System.out.println(Thread.currentThread().getName()+"\t unlocked! ");
	}
	
	public static void main(String[] args) {
		Demo3 demo3 = new Demo3();
		
		new Thread( ()->{
			demo3.myLock();
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			demo3.myUnlock();
		},"AAA").start();
		
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		new Thread( ()->{
			demo3.myLock();
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			demo3.myUnlock();
		},"BBB").start();
		
	}
	
}
