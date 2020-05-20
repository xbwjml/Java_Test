package com.interview.zsdl;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

public class Demo7 {
	public static void main(String[] args) {
		BlockingQueue<String> blockingQueue = new SynchronousQueue<>();
		
		new Thread( ()->{
			try {
				System.out.println(Thread.currentThread().getName()+"\t 准备put    a ");
				blockingQueue.put("a");
				System.out.println(Thread.currentThread().getName()+"\t 准备put    b ");
				blockingQueue.put("b");
				System.out.println(Thread.currentThread().getName()+"\t 准备put    c ");
				blockingQueue.put("c");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		},"AAA").start();
		
		new Thread( ()->{
			try {
				TimeUnit.SECONDS.sleep(5);
				System.out.println(Thread.currentThread().getName()+"\t take \t"+blockingQueue.take());
				TimeUnit.SECONDS.sleep(5);
				System.out.println(Thread.currentThread().getName()+"\t take \t"+blockingQueue.take());
				TimeUnit.SECONDS.sleep(5);
				System.out.println(Thread.currentThread().getName()+"\t take \t"+blockingQueue.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		},"BBB").start();
		
	}
}
