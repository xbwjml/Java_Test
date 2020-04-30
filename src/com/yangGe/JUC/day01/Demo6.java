package com.yangGe.JUC.day01;

import java.util.concurrent.locks.ReentrantReadWriteLock;

class MyQueue{
	private Object obj;
	private ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
	
	public void writeObj( Object obj ) {
		rwLock.writeLock().lock();
		try {
			this.obj = obj;
			System.out.println(Thread.currentThread().getName()+"\t"+obj);
		} catch (Exception e) {
			
		} finally {
			rwLock.writeLock().unlock();
		}
	}
	
	public void ReadObj() {
		rwLock.readLock().lock();
		try {
			System.out.println(Thread.currentThread().getName()+"\t"+obj);
		} catch (Exception e) {
			
		} finally {
			rwLock.readLock().unlock();
		}
	}
	
}

public class Demo6 {
	public static void main(String[] args) throws Exception {
		MyQueue q  = new MyQueue();
		 new Thread( ()->{
			 q.writeObj("Hello World");
		 },"writeThread" ).start();
		 
		 Thread.sleep(100);
		 
		 for( int i=1; i<101; i++ ) {
			 new Thread( ()->{
				 q.ReadObj();
			 },String.valueOf(i) ).start();
		 }
	}
}
