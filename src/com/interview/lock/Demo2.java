package com.interview.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 可重入锁
 * @author Leemi
 *
 */
public class Demo2 {
	public static void main(String[] args) throws Exception {
		Phone p = new Phone();
		
		new Thread(()->{
			try {
				p.sendMSM();
			} catch (Exception e) {
				e.printStackTrace();
			}
		},"t1").start();
		
		new Thread(()->{
			try {
				p.sendMSM();
			} catch (Exception e) {
				e.printStackTrace();
			}
		},"t2").start();
		TimeUnit.SECONDS.sleep(2);
		System.out.println("=========================");
		
		Thread t3 = new Thread(p, "t3");
		Thread t4 = new Thread(p, "t4");
		t3.start();
		t4.start();
	}
}

class Phone implements Runnable{
	
	public synchronized void sendMSM() throws Exception{
		System.out.println(Thread.currentThread().getName()+"\t sendMSM()");
		sendEmail();
	}
	public synchronized void sendEmail() throws Exception{
		System.out.println(Thread.currentThread().getName()+"\t ###########sendEmail()");
	}
	
	////////////////////////////////////////////////////////////
	Lock lock = new ReentrantLock();
	@Override
	public void run() {
		get();
	}
	public void get() {
		lock.lock();
		try {
			System.out.println(Thread.currentThread().getName()+"\t get()");
			set();
		}finally {
			lock.unlock();
		}
	}
	public void set() {
		lock.lock();
		try {
			System.out.println(Thread.currentThread().getName()+"\t set()");
		}finally {
			lock.unlock();
		}
	}
	
}
